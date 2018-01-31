package com.service;

import com.service.util.RedisJava;
import redis.clients.jedis.Jedis;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by asd on 17-10-29.
 */
public class RedisServiceImpl implements  IRedisService {
    private Jedis jedis;

    private String getTime(){
        Date date=new Date();
        DateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return format.format(date);
    }
    private String getMessage(String classNameString,String message){
        message="\n"+"["+getTime()+"]{"+classNameString+"} - "+message;
        return message;
    }
    @Override
    public boolean info(String classNameString,String message) {
        try{
            jedis=RedisJava.getJedis();
            jedis.append("info",getMessage(classNameString,message));
            RedisJava.returnResource(jedis);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public boolean dubug(String classNameString,String message) {
        try{
            jedis=RedisJava.getJedis();
            jedis.append("dubug",getMessage(classNameString,message));
            RedisJava.returnResource(jedis);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public boolean error(String classNameString,String message) {
        try{
            jedis=RedisJava.getJedis();
            jedis.append("error",getMessage(classNameString,message));
            RedisJava.returnResource(jedis);
            return true;
        }catch (Exception e){
            return false;
        }
    }

}
