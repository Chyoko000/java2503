package com.situ.demo.hash0324;

import org.junit.Test;

import java.util.*;

/**
 * @program: untitled1
 * @ClassName hashtest
 * @description:
 * @author: Harlan su
 * @create: 2025−03-24 10:13
 * @Version 1.0
 **/

public class SetDemo {

    public static void main(String[] args) {
        String p1="zhang3";
        String p2="li4";
        String p3="wang5";

        Set<String> set1 = new HashSet<>();
        //添加数据
        set1.add(p1);
        set1.add(p2);
        set1.add(p3);

        //遍历
        Iterator<String> it = set1.iterator();
        while (it.hasNext()){
            String next = it.next();
            System.out.println(next);
        }



    }

    @Test
    public void test1(){
        Map<String, Integer> map = new HashMap<>();
        map.put("苹果", 10);
        map.put("香蕉", 20);
        map.put("西红柿",100);
        map.put("橙子", 30);


        System.out.println(map); // 10
    }
}
