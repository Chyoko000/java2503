package test.T3;


import java.util.*;

/**
 * @program: java2503
 * @ClassName CustomerRatio
 * @description: 计算顾客比例
 * @author: HarlanSu
 * @create: 2025−03-28 14:31
 * @Version 1.0
 **/

public class CustomerRatio {



    public static void main(String[] args) {
        List<Integer> list =new ArrayList<>();
        Scanner scanner=new Scanner(System.in);


        //输入
        int i=1;
        System.out.println("请输入客户年龄:(输入非整数停止输入)");
        while (scanner.hasNextInt()){
            int num=scanner.nextInt();
            System.out.println("第"+i+"位顾客的年龄:"+num);
            list.add(num);
            i++;
        }
        scanner.close();

        int end=0;
        int size= list.size();
        for (int j = 0; j <size ; j++) {
            int num=list.get(j);

            if(num>=30){
                end++;
            }
        }

        System.out.println("三十岁以上的客户比例为："+((double)end/size)*100+"%");
        System.out.println("三十岁以下的客户比例为："+((1-(double)end/size))*100+"%");

    }

}
