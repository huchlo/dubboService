package test;

import org.apache.ibatis.session.SqlSessionFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
public class Test1 {
    private static final String resource = "mybatis/mybatis-config.xml";
    private static InputStream inputStream;
    private static SqlSessionFactory sqlSessionFactory;
    private static SqlSession session;
    static {
        try{
            inputStream =Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        }catch (IOException e){
            System.out.println("cant find "+resource);
        }
    }
    // static final ThreadLocal<SqlSession> THREAD_LOCAL = new ThreadLocal<SqlSession>();

    public static SqlSession currentSession(){
        //SqlSession session = THREAD_LOCAL.get();
        //if(session==null){
            session = sqlSessionFactory.openSession();
            //THREAD_LOCAL.set(session);
        //}
        return session;
    }

    public static void closeSession(){
        //SqlSession session =THREAD_LOCAL.get();
        //THREAD_LOCAL.set(null);
        if (session!=null){
            session.clearCache();
            session.close();
        }
    }
}
