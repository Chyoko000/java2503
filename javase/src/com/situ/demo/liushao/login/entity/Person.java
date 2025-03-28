package com.situ.demo.liushao.login.entity;

import java.io.Serial;
import java.io.Serializable;

/**
 * @program: untitled1
 * @ClassName Person
 * @description:
 * @author: 刘庆东
 * @create: 2025−03-26 09:11
 * @Version 1.0
 **/

public class Person implements Serializable {

    private String name;
    private int age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
