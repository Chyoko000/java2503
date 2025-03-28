package com.situ.demo.liushao.login.controller;


import com.situ.demo.liushao.login.entity.User;
import com.situ.demo.liushao.login.service.LoginBiz;
import com.situ.demo.liushao.login.service.impl.LoginBizImpl;

/**
 * @program: untitled1
 * @ClassName LoginController
 * @description:
 * @author: 刘庆东
 * @create: 2025−03-26 10:11
 * @Version 1.0
 **/

public class LoginController {
    //面向接口编程
    private LoginBiz loginBiz;

    public LoginController() {
        loginBiz = new LoginBizImpl();
    }

   // 注册
    public boolean doRegister(String userName,String pwd){
        boolean flag=false;

        User user = new User(userName,pwd);
        //调用注册的方法
        flag = loginBiz.myRegister(user);

        return flag;


    }

    // 注册
    public boolean doLogin(String userName,String pwd){
        boolean flag=false;

        User user = new User(userName,pwd);
        //调用注册的方法
        flag = loginBiz.myLogin(user);

        return flag;


    }
}
