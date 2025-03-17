package test;


import org.junit.internal.ArrayComparisonFailure;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @program: java2503
 * @ClassName getsmall
 * @description:寻找输入整数中最小的k个数字
 * @author: HarlanSu
 * @create: 2025−03-24 13:08
 * @Version 1.0
 **/

public class getsmall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //输入进行排序的数组
        int[] num = new int[8];//读取十个数字
        for (int i = 0; i < 8; i++) {
            num[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(num));

        //排序过后的数组,进行冒泡排序
        //逻辑第一次取第一个数字
        // 进行挨个对比每次对比都取得最大的那个数字往后传递，
        // 直至将最大/最小的数字放在最后一位
        //然后外层循环再执行一次内层循环控制位移
        //外层循环控制循环次数
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = 0; j < num.length - 1 - i; j++) {
                if (num[j] > num[j + 1]) {//位移规则为将大的存储
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }


        //利用工具类打印需求的部分
        int k=scanner.nextInt();
        int[] num1= Arrays.copyOfRange(num,0,k);
        System.out.print(Arrays.toString(num1));

    }


}
