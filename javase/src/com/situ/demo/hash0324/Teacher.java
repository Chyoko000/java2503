package com.situ.demo.hash0324;

/**
 * @program: untitled1
 * @ClassName Teacher
 * @description:
 * @author: 刘庆东
 * @create: 2025−03-24 09:16
 * @Version 1.0
 **/

public class Teacher {


    private String name;
    private int age;

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Teacher() {
    }

    public Teacher(String name, int age) {
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
