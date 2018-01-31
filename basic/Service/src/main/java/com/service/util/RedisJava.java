package com.service.util;

        import redis.clients.jedis.Jedis;
        import redis.clients.jedis.JedisPool;
        import redis.clients.jedis.JedisPoolConfig;

/**
 * Created by asd on 17-10-27.
 */
public final  class RedisJava {
    /**
     * 新建线程池私有静态变量与各种配置属性：
     */
    private Jedis jedisCli;
    private static JedisPool pool; //线程池对象
    private static String ADDR = "192.168.1.108"; //redis所在服务器地址（案例中是在本机）
    private static int PORT = 6379; //端口号
    private static String AUTH = null;//密码（我没有设置）
    private static int MAX_IDLE = 10;//连接池最大空闲连接数（最多保持空闲连接有多少）
    private static int MAX_ACTIVE = 50;//最大激活连接数（能用的最多的连接有多少）
    private static int MAX_WAIT = 100000;//等待可用连接的最大时间(毫秒)，默认值-1，表示永不超时。若超过等待时间，则抛JedisConnectionException
    private static int TIMEOUT = 10000;//链接连接池的超时时间#使用连接时，检测连接是否成功
    private static boolean TEST_ON_BORROW = true;   //使用连接时，测试连接是否可用
    private static boolean TEST_ON_RETURN = true;//返回连接时，测试连接是否可用

    /**
     * 静态块加载连接属性：
     */
    static {
        try {
            JedisPoolConfig config = new JedisPoolConfig();
            //config.setMaxActive(MAX_ACTIVE);
            config.setMaxIdle(MAX_IDLE);
            //config.setMaxWait(MAX_WAIT);
            config.setTestOnBorrow(TEST_ON_BORROW);
            pool = new JedisPool(config, ADDR, PORT, TIMEOUT, AUTH);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * 获取Jedis实例
     * @return
     */
    public synchronized static Jedis getJedis() {
        try {
            if (pool != null) {
                Jedis resource = pool.getResource();
                return resource;
            } else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    /**
     * 释放jedis资源
     * @param jedis
     */
    public static void returnResource(final Jedis jedis) {
        if (jedis != null) {
            pool.returnResource(jedis);
        }
    }

    public static void main(String[] args) {
        Jedis jedis=RedisJava.getJedis();
        String s=jedis.get("string");
        RedisJava.returnResource(jedis);
    }
}
