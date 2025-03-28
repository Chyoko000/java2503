package com.situ.demo.liushao.login.entity;

import java.io.Serializable;

/**
 * @program: untitled1
 * @ClassName Student
 * @description:
 * @author: 刘庆东
 * @create: 2025−03-26 09:15
 * @Version 1.0
 **/

public class Student extends Person implements Serializable {

    private double socre;

    public Student(double socre) {
        this.socre = socre;
    }

    public Student() {

    }

    public double getSocre() {
        return socre;
    }

    public void setSocre(double socre) {
        this.socre = socre;
    }
}
