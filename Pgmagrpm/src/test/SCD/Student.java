package test.SCD;


import java.util.ArrayList;

/**
 * @program: java2503
 * @ClassName Student
 * @description: 学生类包括姓名科目的成绩
 * @author: HarlanSu
 * @create: 2025−03-28 09:32
 * @Version 1.0
 **/

public class Student {
    public String name;
    public int id;
    //通过arraylist更方便插入
    //相互没关联，但是通过下标进行一一对应
    public ArrayList<String> subject;
    public ArrayList<Double> scores;


}
