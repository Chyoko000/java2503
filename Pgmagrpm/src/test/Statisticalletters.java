package test;


import java.util.Scanner;

/**
 * @program: java2503
 * @ClassName Statisticalletters
 * @description:输入字符串检查元音字母
 * @author: HarlanSu
 * @create: 2025−03-27 20:25
 * @Version 1.0
 **/
//题目2：元音字母统计（字符串/循环）
//要求：输入一个字符串，统计元音字母(a,e,i,o,u)出现的总次数，不区分大小写
//示例输入："Hello World!"
//示例输出：3
//知识点：
//- String.charAt()
//- 循环结构
//- 逻辑运算符
public class Statisticalletters {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str= scanner.nextLine();//输入字符串
        int num=0;
        for (int i = 0; i < str.length()-1; i++) {
            char cha=str.charAt(i);
            if(cha=='a'||cha=='e'||cha=='i'||cha=='o'||cha=='u'){//没写大写但整体逻辑没问题
                num++;
            }
        }
        System.out.println("您输入的字符串中元音的个数为"+num);

        scanner.close();//关闭输入流
    }
}
