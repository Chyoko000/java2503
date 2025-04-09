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
        Scanner scanner =new Scanner(System.in);
        System.out.println("请依次输入学生的姓名和");
        Student xiaoming=new Student();
        xiaoming.name=scanner.nextLine();
        xiaoming.id=scanner.nextInt();
        for (int i = 0; i < 100; i++) {
            
        }
    }


}
