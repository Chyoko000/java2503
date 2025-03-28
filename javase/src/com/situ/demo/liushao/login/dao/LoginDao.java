package com.situ.demo.liushao.login.dao;


import com.situ.demo.liushao.login.entity.User;

/**
 * @program: untitled1
 * @ClassName LoginDao
 * @description:
 * @author: 刘庆东
 * @create: 2025−03-26 09:17
 * @Version 1.0
 **/

public interface LoginDao {

    /**
     * 注册方法
     * @param user
     * @return
     */
    public boolean register(User user);


    /**
     * 登录方法
     * @param user
     * @return
     */
    public boolean login(User user);


}
