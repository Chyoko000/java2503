package test.RPS;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.random;

/**
 * @program: java2503
 * @ClassName RPS
 * @description:猜拳
 * @author: HarlanSu
 * @create: 2025−03-19 11:30
 * @Version 1.0
 **/

public class RPS {
    public static void main(String[] args) {
        Random random=new Random();
        Scanner scanner=new Scanner(System.in);
        KESAN jiben= new KESAN();
        KESAN computer=new KESAN();
        System.out.println("请输入您想出的类容：[0]拳头[1]剪刀[2]布");

        //只有声明了这个对象才能使用这个对象的元素和方法
        //给对象jiben的变量te赋值
        jiben.rps[0] =Integer.parseInt(scanner.next());
        jiben.print(1);

        computer.rps[0]=random.nextInt(3);//随机生成012其中一个数组
        computer.rps[1]=jiben.rps[0];
        computer.print(2);

        //输出两者对决
        computer.out();


    }

}
