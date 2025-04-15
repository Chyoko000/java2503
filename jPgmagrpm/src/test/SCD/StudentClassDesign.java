package test.SCD;


import java.util.Scanner;

/**
 * @program: java2503
 * @ClassName StudentClassDesign
 * @description: 学生类设计
 * @author: HarlanSu
 * @create: 2025−03-28 09:30
 * @Version 1.0
 *
 *创建Student类，包含属性：学号、姓名、成绩数组
 *添加方法：计算平均分、获取最高分科目
 *编写测试类创建对象并调用方法
 * 知识点：
 * - 类与对象
 * - 封装性
 * - 方法定义
 *
 **/

public class StudentClassDesign {

    public static void main(String[] args) {
        //输入和展示
        Scanner scanner =new Scanner(System.in);
        System.out.println("请依次输入学生的姓名和学号");

        Student xiaoming=new Student();
        xiaoming.name=scanner.nextLine();
        xiaoming.id=scanner.nextInt();
        System.out.println("请输入"+xiaoming.id+" "+xiaoming.name+"的学科和成绩");


        while (scanner.hasNext()){
            if (scanner.hasNextLine()){
                xiaoming.subject.add(scanner.nextLine());
            } else if (scanner.hasNextDouble()) {
                xiaoming.scores.add(scanner.nextDouble());
            }else {
                //先进行判断，返回值说明应该输入课程名字还是某课程的成绩
                //然后打印，输入，再结束循环重新再进入循环，以保证程序能够完整的完成任务
                System.out.println("输入错误请重新输入");//解决此时可能出现的错位问题
                //还没写好，传进去一个参数这个参数应该进一个判断语句
                xiaoming.chenge();
                break;
            }

        }

        //各科平均分数


        //写一个判断语句，判断条件是哪个不齐
        //然后进行输入
        //最后再重新加载输入函数

    }


}
