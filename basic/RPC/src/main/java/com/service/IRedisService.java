package com.service;

/**
 * Created by asd on 17-10-29.
 */
public interface IRedisService {
    public boolean info(String classNameString,String str);
    public boolean dubug(String classNameString,String str);
    public boolean error(String classNameString,String str);
}
