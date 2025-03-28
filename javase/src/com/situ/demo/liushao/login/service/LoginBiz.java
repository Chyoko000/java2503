package com.situ.demo.liushao.login.service;


import com.situ.demo.liushao.login.entity.User;

/**
 * @program: untitled1
 * @ClassName LoginBiz
 * @description:
 * @author: 刘庆东
 * @create: 2025−03-26 10:05
 * @Version 1.0
 **/

public interface LoginBiz {

    /**
     * 注册方法
     * @param user
     * @return
     */
    public boolean myRegister(com.situ.demo.liushao.login.service.User user);


    /**
     * 登录方法
     * @param user
     * @return
     */
    public boolean myLogin(User user);
}
