package test.T3;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @program: java2503
 * @ClassName RenewPoints
 * @description:
 * @author: HarlanSu
 * @create: 2025−03-28 15:00
 * @Version 1.0
 **/

public class RenewPoints {
    public static void main(String[] args) {
        List<Integer> list =new ArrayList<>();
        Scanner scanner=new Scanner(System.in);


        //输入
        int i=1;
        System.out.println("请输入会员积分");
        while (scanner.hasNextInt()){
            int num=scanner.nextInt();
            list.add(num);
            i++;
        }

//        for (int j = 1; j < 4; j++) {
//            System.out.println("第"+i+"位会员的积分为："+list.get(j));
//            j++;
//        }
        System.out.println("序号；历史积分；新年积分");
        for (int j = 0; j < 4; j++) {
            System.out.println((j+1)+"-"+list.get(j)+"-"+((list.get(j))+500));
        }
    }
}
