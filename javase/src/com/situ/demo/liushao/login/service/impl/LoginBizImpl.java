package com.situ.demo.liushao.login.service.impl;


import com.situ.demo.liushao.login.dao.LoginDao;
import com.situ.demo.liushao.login.dao.impl.LoginDaoImpl;
import com.situ.demo.liushao.login.entity.User;
import com.situ.demo.liushao.login.service.LoginBiz;

/**
 * @program: untitled1
 * @ClassName LoginBizImpl
 * @description:
 * @author: 刘庆东
 * @create: 2025−03-26 10:06
 * @Version 1.0
 **/

public class LoginBizImpl implements LoginBiz {

    //面向接口编程
    private LoginDao loginDao;

    public LoginBizImpl() {
        loginDao = new LoginDaoImpl();

    }

    @Override
    public boolean myRegister(User user) {
        return loginDao.register(user);
    }

    @Override
    public boolean myRegister(com.situ.demo.liushao.login.service.User user) {
        return false;
    }

    @Override
    public boolean myLogin(User user) {
        return loginDao.login(user);
    }
}
