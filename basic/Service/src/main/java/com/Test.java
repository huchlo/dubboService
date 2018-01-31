package com;

import com.service.IRedisService;
import com.service.RedisServiceImpl;

/**
 * Created by asd on 17-10-29.
 */
public class Test {
    //static IRedisService i;
    //i=new RedisServiceImpl("sd");
    public static void main(String[] args) {
        IRedisService i=new RedisServiceImpl();

        System.out.println(i.dubug("asd","1"));
    }
}
