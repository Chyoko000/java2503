package test;

import java.util.ArrayList;
import java.util.Collections;
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

        //输入，这里决定用arraylist(泛型是int)
        List<Integer> list = new ArrayList<>();
        Scanner scanner=new Scanner(System.in);

        System.out.println("请输入整数若否则停止输入");
        while (scanner.hasNextInt()){//检查输入是否为整数
            int num=scanner.nextInt();
            list.add(num);
        }
        scanner.close();//关闭sanner释放资源
        //数据处理之前
        System.out.println("您输入的是"+list);
        //数据处理
        //经过排序之后
        Collections.sort(list);//利用collections的sort默认排序
        System.out.println("排序过后的"+list);

        double end;
        int size= list.size();//赋值size为list这
        //这里用一个if语句区分数组单双位数的情况
        if(size%2==1){//奇数的情况下中位数是中间的数字
            end=list.get(size/2);
        }else {
            end=(list.get(size / 2 - 1) + list.get(size / 2))/2.0;//中位数的意思是中间两个数字的中间
        }

        System.out.println(end);
    }

}
