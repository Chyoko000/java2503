package test;


import org.junit.jupiter.api.Test;

import java.util.Scanner;

/**
 * 2@program: java2503
 * @ClassName day1
 * @description:
 * @author: HarlanSu
 * @create: 2025−03-14 13:43
 * @Version 1.0
 **/


public class day1 {
    //编写一个Java程序，显示你的个人档案。分别使用IDEA实现
    //写成输入加拼接的样式（待修改）
    //next() 只读取空格前内容的问题（nextLine() 读取整行）。
    @Test
    public void test(){
        //char字符
        //str字符串
        //因为不需要计算所以同意使用字符串格式
        Scanner scanner=new Scanner(System.in);

        System.out.println("请输入姓名：");
        String nam=scanner.next();
        System.out.println("请输入性别：");
        String gender=scanner.next();
        System.out.println("请输入职业：");
        String occ=scanner.next();
        System.out.println("请输入联系方式：");
        String num=scanner.next();

        System.out.println("----------如下是刚才输入的信息----------");
        System.out.println("姓名："+nam);
        System.out.println("性别："+gender);
        System.out.println("职业："+occ);
        System.out.println("联系方式："+num);
    }

    //小明左右手分别拿两张牌：黑桃10和红桃8，现在交换手中的牌。
    // 用程序模拟这一过程：两个整数分别保存在两个变量中，将这两个变量中，
    // 将这两个变量的值互换，并打印输出互换后的结果
    @Test
    public void test2(){
        String Temp=new String();
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入左手的扑克牌");
        String left=scanner.nextLine();
        System.out.println("请输入右手的扑克牌");
        String right=scanner.nextLine();
        System.out.println("--------你输入的左右手是--------");
        System.out.println("左手："+left);
        System.out.println("右手："+right);
        System.out.println("-------交换之后你的左右手--------");
        Temp=left;
        left=right;
        right=Temp;
        System.out.println("左手："+left);
        System.out.println("右手："+right);
    }
    //华氏度转换为摄氏度
    @Test
    public void test3(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入你想转换的华氏度：");
        String h=scanner.next();
        //转换为整形
        double s= Double.parseDouble(h);
        //int b= Integer.parseInt(h);
        //防止出现问题这一步单独计算
        s=s*9/5+32;
        System.out.println("华氏度："+h+"（摄氏度："+s+")");

    }

}