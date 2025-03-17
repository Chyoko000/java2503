package test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
//为解决，准备
public class Backpackproblem {
    @Test
    //01背包问题
    //第一行先输入两个数字A和B表示数量和容积
    //然后进行输入多组数字分别表示体积和价值

    //bag为背包数组
    //int N=bag[0];为物品数量
    //int V=bag[1];为最大容积
    //bagl为物品栏
    //bagn为权重栏
    //num为最大价值


    public void test01(){
        //输入环节（包和内容）
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入两个数字表示数量和容积");


        //输入部分用到bag[0]
        int bag[]= new int[2];//分别定义两个
        bag[0]=Integer.parseInt(scanner.next());
        bag[1]=Integer.parseInt(scanner.next());
        System.out.println("请输入多个数字组合来分别代表体积和价值");
        System.out.println(Arrays.toString(bag));
        //方案一先尝试定义一个超级大数组放5组数据的数组，但回车的存在纯属有毛病，为权宜之策
        //方案二循环定义n个数组，停止条件为输入为null
        int N=bag[0];
        int[] bagl=new int[N*2];//暂时设定为4组
        for (int i = 0; i < bagl.length; i=i+2) {
            bagl[i]=Integer.parseInt(scanner.next());
            bagl[i+1]=Integer.parseInt(scanner.next());
        }
        System.out.println(Arrays.toString(bagl));





        //算法部分
        //算法部分用到bag[1]
        int V=bag[1];
        int num=0;
        double[] bagn=new double[bagl.length/2];
        for (int i = 0; i < bagl.length; i=i+2) {

            bagn[i/2]=(Double.parseDouble(String.valueOf(bagl[i]))+Double.parseDouble(String.valueOf(bagl[i+1])))/2;
        }
        System.out.println("此时得出一个数组为单格的单格价值"+ Arrays.toString(bagn));
        //此时得出一个数组为单格的单格价值

        //遍历取最大值，将被取走设为零在进行循环再取最大值，限制条件为最多取四个数
        // 遍历取最大值，将被取走的设为零，在进行循环再取最大值，限制条件为最多取 N 组
        for (int i = 0; num < V; i++) {
            int j = 0;  // 存最大值的索引
            double maxValue = -1;  // 存当前找到的最大单位价值

            // 遍历 bagn，找到当前最大的单位价值
            for (int k = 0; k < bagn.length; k++) {
                if (bagn[k] > maxValue) {
                    maxValue = bagn[k]; // 记录最大值
                    j = k; // 记录最大值所在索引
                }
            }

            // 获取该物品的体积和价值
            int itemVolume = bagl[j * 2];
            int itemValue = bagl[j * 2 + 1];

            // 判断是否能放入背包
            if (num + itemVolume <= V) {
                num += itemVolume; // 更新当前已使用的背包容量
                System.out.println("选中物品: 体积=" + itemVolume + ", 价值=" + itemValue);
            }

            // 标记已选物品，避免重复选择
            bagn[j] = 0;
        }
        System.out.println("最大可获得的价值: " + num);


    }




    @Test
    public void test02(){

    }



}
