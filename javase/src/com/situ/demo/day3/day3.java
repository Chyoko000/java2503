package com.situ.demo.day3;


/**
 * @program: java2503
 * @ClassName day3
 * @description:
 * @author: HarlanSu
 * @create: 2025−03-17 09:37
 * @Version 1.0
 **/
//上机练习1
//指导：计算100以内(包括100)的偶数之和
//训练要点
//    for循环结构
//    程序调试
//需求说明
//    编程实现：计算100以内（包括100）的偶数之和
//    观察每一次循环中变量值的变化
//实现思路及关键代码
//（1）    声明整型变量num和sum，分别表示当前加数和当前和
//（2）    循环条件：num<=100。
//（3）    循环操作：累加求和

public class day3 {
    public static void main(String[] args) {
        int num=0;
        for (int i = 0; i <=100 ; i++) {
            if (i%2 == 0 ) {//全等的时候要用双等号
                num = num + i;
            }
        }
        System.out.println("100以内偶数的之和为"+num);

    }


}
