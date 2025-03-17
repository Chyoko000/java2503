package com.situ.demo.day5Lei;


import org.junit.Test;

/**
 * @program: java2503
 * @ClassName day5
 * @description:引用测试
 * @author: HarlanSu
 * @create: 2025−03-19 09:51
 * @Version 1.0
 **/

public class day5 {
    @Test
    public void test22(){
        //要先创建类，才能引用类
        person person1=new person();
        person1.test();
        int age;
        person1.fuzhi();
    }
}
