package com.situ.demo.list0324;

/**
 * @program: untitled1
 * @ClassName Student
 * @description:  学生类
 * @author: 刘庆东
 * @create: 2025−03-24 09:14
 * @Version 1.0
 **/

public class Student {

    private String name;
    private int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Student() {
    }

    public Student(String name, int age) {
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
