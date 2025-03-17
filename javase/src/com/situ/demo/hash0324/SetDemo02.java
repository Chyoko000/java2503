package com.situ.demo.hash0324;



import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @program: untitled1
 * @ClassName hashtest
 * @description:
 * @author: Harlansu
 * @create: 2025−03-24 10:20
 * @Version 1.0
 **/

public class SetDemo02 {

    public static void main(String[] args) {
        Student s1 = new Student("sun2",20);
        Student s2 = new Student("sun1",10);
        Student s3 = new Student("sun3",30);
        Student s4 = new Student("sun3",30);

        Set<Student> set1 = new HashSet<>();
        set1.add(s1);
        set1.add(s2);
        set1.add(s3);
        set1.add(s4);

        Iterator<Student> iterator = set1.iterator();

        while (iterator.hasNext()){
            Student next = iterator.next();
            System.out.println(next);
        }

        //没有成功的去除重复 !!!
    }
}
