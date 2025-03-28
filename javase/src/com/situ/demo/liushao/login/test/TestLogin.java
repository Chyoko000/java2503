package com.situ.demo.liushao.login.test;

import com.situ.demo.liushao.login.controller.LoginController;

import java.util.Scanner;

/**
 * @program: untitled1
 * @ClassName TestLogin
 * @description:
 * @author: 刘庆东
 * @create: 2025−03-26 10:15
 * @Version 1.0
 **/

public class TestLogin {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("请输入用户名");
        String uname = input.next();


        System.out.println("请输入密码");
        String pwd = input.next();

        //创建控制器对象
        LoginController loginController = new LoginController();

        //先注册
    /*    boolean result = loginController.doRegister(uname, pwd);

        if(result){
            System.out.println("注册成功了!");
        }else{
            System.out.println("注册失败了!");
        }*/


        boolean result = loginController.doLogin(uname, pwd);

        if(result){
            System.out.println("denglu成功了!");
        }else{
            System.out.println("denglu失败了!");
        }


    }
}
