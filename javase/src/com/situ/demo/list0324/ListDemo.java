package com.situ.demo.list0324;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @program: untitled1
 * @ClassName ListDemo
 * @description:  List接口  使用泛型  在入口处控制一下 类型
 * @author: 刘庆东
 * @create: 2025−03-24 09:07
 * @Version 1.0
 **/

public class ListDemo {

    public static void main(String[] args) {
         //创建集合对象
        List<Student> list = new ArrayList<Student>();

        //  接口  对象名 = new 接口实现类();

        //创建学生对象
        Student student = new Student("张无忌",18);
        Student student1 = new Student("张三丰",19);
        Student student2 = new Student("张翠山",20);

        //将学生对象添加都集合中

        Teacher t  = new Teacher("张雪峰",43);

        //添加对象到集合中
        list.add(student1);
        list.add(student);
        list.add(student2);
        //发现 老师也可以添加到集合中
        //list.add(t); //报错  t是Teacher  不是Student 类型

        //遍历集合
        for (Student s:list){
            System.out.println(s);

        }

        /*
          增强for循环
          for(集合或者数组中的数据类型  变量名:集合或者数组){
                 System.out.println(变量名);
          }
         */









    }
    @Test
    public void test1(){
        List<Student> list=new ArrayList<>();

        Student student=new Student("原神",11);
        Student student1=new Student("贾元春",14);
        list.add(student);
        list.add(student1);
        for (Student s:list){
            System.out.println(s);

        }
    }

    @Test
    public void test2(){
        List<String> list = new LinkedList<>();
        list.add("苹果");
        list.add("香蕉");
        list.add("橙子");

        System.out.println(list);

    }

}
