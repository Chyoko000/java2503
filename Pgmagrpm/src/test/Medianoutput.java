package test;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @program: java2503
 * @ClassName Medianoutput
 * @description:输入数字，输出中位数
 * @author: HarlanSu
 * @create: 2025−03-25 14:37
 * @Version 1.0
 **/

public class Medianoutput {

    public static void main(String[] args) {

        //输入，这里决定用arraylist
        List<String> list = new ArrayList<>();
        Scanner scanner=new Scanner(System.in);

        System.out.println("输入，结束为^D");
        while (scanner.hasNext()){//判断若为空则不输入
            //验证以下如果为空再输入是否仍能储存进list
            String num=scanner.next();
            list.add(num);
        }


        //数据处理
        System.out.println("您输入的是"+list);
        String[] arr = list.toArray(new String[0]);//将输入的内容转换为数组
        //排序使用冒泡排序
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {

            }
        }



        //输出
        int num=Integer.parseInt(arr[0])+Integer.parseInt(arr[(args.length)-1]);
        //输出数字为最大值和最小值相加
        System.out.println(num/2);
    }

}
