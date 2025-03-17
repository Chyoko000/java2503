package test.RPS;


/**
 * @program: java2503
 * @ClassName KESAN
 * @description:顺便加了子类父类的练习
 * @author: HarlanSu
 * @create: 2025−03-19 13:54
 * @Version 1.0
 **/

public class KESAN {
    //定义一个数组通过第一位识别所出内容
    //通过数组第二位传递
    public int[] rps=new int[2];

    //出拳识别（人和电脑）
    public void print(int chak) {
        switch (chak){
            case 1: {
                if (rps[0] == 0) {
                    System.out.println("您出的是石头");
                } else if (rps[0] == 1) {
                    System.out.println("您出的是剪刀");
                } else if (rps[0] == 2) {
                    System.out.println("您出的是布");
                } else {
                    System.out.println("您没有按照规定输入，爷不伺候了");
                }
                break;
            }
            case 2: {
                if (rps[0] == 0) {
                    System.out.println("电脑出的是石头");
                } else if (rps[0] == 1) {
                    System.out.println("电脑出的是剪刀");
                } else if (rps[0] == 2) {
                    System.out.println("电脑出的是布");
                } else {
                    System.out.println("小子你是不是改代码了？？？");
                }
                break;
            }
        }
    }

    //输赢判断输出
    public void out(){
        if (rps[0] == rps[1]) {
            System.out.println("你和电脑达成了平手");
        }else {
            switch (rps[0]) {
                case 0:
                    if (rps[1] ==1) {
                        System.out.println("你输给了电脑");
                    }else {
                        System.out.println("你赢过了电脑");
                    }
                    break;
                case 1:
                    if (rps[1] ==0) {
                        System.out.println("你输给了电脑");
                    }else {
                        System.out.println("你赢过了电脑");
                    }
                    break;
                case 2:
                    if (rps[1] ==0) {
                        System.out.println("你输给了电脑");
                    }else {
                        System.out.println("你赢过了电脑");
                    }
                    break;
            }
        }

    }



}
