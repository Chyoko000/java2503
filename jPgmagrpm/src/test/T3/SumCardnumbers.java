package test.T3;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @program: java2503
 * @ClassName SumCardnumbers
 * @description: 计算会员卡号之和
 * @author: HarlanSu
 * @create: 2025−03-28 14:52
 * @Version 1.0
 **/

public class SumCardnumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入四位会员卡号：");
        int cardNumber = scanner.nextInt();
        scanner.close();

        // 检查输入是否是四位数
        if (cardNumber < 1000 || cardNumber > 9999) {
            System.out.println("请输入有效的四位数会员卡号！");
            return;
        }

        // 计算四位数各位数字的和
        int sum = 0;
        int temp = cardNumber;

        while (temp > 0) {
            sum += temp % 10;  // 取最后一位数字并加到sum
            temp /= 10;        // 去掉最后一位
        }

        System.out.println("会员卡号各位数字之和：" + sum);
    }
}
