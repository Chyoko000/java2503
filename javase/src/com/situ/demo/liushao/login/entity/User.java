package com.situ.demo.liushao.login.entity;

import java.io.Serializable;

/**
 * @program: untitled1
 * @ClassName User
 * @description:
 * @author: 刘庆东
 * @create: 2025−03-26 09:13
 * @Version 1.0
 **/

public class User extends Person implements Serializable {

    private String username;
    private String password;

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User() {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
