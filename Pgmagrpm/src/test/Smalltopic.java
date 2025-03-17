package test;


import org.junit.Test;

import java.util.Scanner;

/**
 * @program: java2503
 * @ClassName Smalltopic
 * @description:小题目练习
 * @author: HarlanSu
 * @create: 2025−03-18 09:22
 * @Version 1.0
 **/

public class Smalltopic {

//查找并替换目标字符


    @Test
    public void test(){
        //输入阶段
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一行字符串：");
        String input = scanner.nextLine(); // 读取整行输入
        //此时缓存区进来一个字符串
        //此时将字符串转换为字符数组
        char[] inputArray = input.toCharArray(); // 将字符串转换为字符数组

        //算法阶段
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == ' ') {
                inputArray[i] = '_'; // 将空格替换为下划线
            }
        }
        //输出阶段
        String result = new String(inputArray); // 将字符数组转换回字符串
        System.out.println("替换后的字符串：" + result);
    }


    @Test
    public void test2(){
    Scanner scanner =new Scanner(System.in);
    String input=scanner.nextLine();//输入整行字符串,这样可以解决定义数组长度的问题
    char[] out=input.toCharArray();//定义字符数组为input转换为char数组
        for (int i = 0; i < out.length; i++) {
            if (out[i]==' '){
                out[i]='_';
            }
        }
        System.out.println(out);
    }

}
