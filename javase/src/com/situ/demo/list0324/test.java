package com.situ.demo.list0324;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @program: java2503
 * @ClassName test
 * @description:
 * @author: HarlanSu
 * @create: 2025−03-24 19:52
 * @Version 1.0
 **/

public class test {

    // 定义一个私有的静态内部类 Person，实现 Comparable 接口
    // 用于定义“自然排序”，此处按照姓名（name）的字典顺序排序
    private static class Person implements Comparable<Person> {

        int age;       // 年龄属性
        String name;   // 姓名属性

        // 重写 toString() 方法，方便输出对象信息
        @Override
        public String toString() {
            return "Person{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }

        // 带参构造器，方便创建 Person 对象时初始化年龄和姓名
        public Person(int age, String name) {
            this.age = age;
            this.name = name;
        }

        // 无参构造器，允许创建空的 Person 对象
        public Person() {
        }

        // Getter 和 Setter 方法，用于访问和修改私有属性
        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        // 实现 Comparable 接口的 compareTo 方法
        // 这里使用姓名（name）的字典顺序进行比较
        @Override
        public int compareTo(Person person) {
            return name.compareTo(person.name);
        }

        // 定义一个 equals 方法，判断两个 Person 对象是否相等
        // 注意：此方法并未正确重写 Object 的 equals(Object) 方法，而是重载了 equals(Person)
        // 正确做法应当使用 @Override 并将参数类型声明为 Object
        // 此处比较逻辑为：若年龄和姓名都相等，则认为两个 Person 对象相等
        public boolean equals(Person person) {
            if(this.age == person.age && this.name == person.name)
                return true;
            return false;
        }
    }

    // 定义一个私有静态内部类 AscAgeComparator，实现 Comparator 接口
    // 用于按照年龄进行升序排序
    private static class AscAgeComparator implements Comparator<Person> {

        @Override
        public int compare(Person p1, Person p2) {
            // 这里直接用相减实现升序排序
            // 注意：这种方式在极端数值下可能存在溢出风险，
            // 推荐使用 Integer.compare(p1.getAge(), p2.getAge()) 更安全
            return p1.getAge() - p2.getAge();
        }
    }

    // 定义一个私有静态内部类 DescAgeComparator，实现 Comparator 接口
    // 用于按照年龄进行降序排序
    private static class DescAgeComparator implements Comparator<Person> {

        @Override
        public int compare(Person p1, Person p2) {
            // 将比较顺序反转，实现降序排序
            return p2.getAge() - p1.getAge();
        }
    }

    // main 方法，程序入口
    public static void main(String[] args) {
        // 创建一个动态数组 ArrayList，用于存放 Person 对象
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person(20, "ccc"));
        list.add(new Person(30, "AAA"));
        list.add(new Person(10, "bbb"));
        list.add(new Person(40, "ddd"));

        // 调用 Collections.sort(list) 进行排序
        // 此处排序会使用 Person 类中实现的 compareTo() 方法，即按照姓名的字典顺序排序
        Collections.sort(list);
        // 打印分隔符，区分不同排序结果的输出
        System.out.println("----------------");

        // 使用 AscAgeComparator 对 list 进行排序，按照年龄升序排序
        Collections.sort(list, new AscAgeComparator());


        // 输出排序后的列表（调用了 Person 的 toString() 方法）
        System.out.println(list);

        System.out.println("---------=======-------");

        // 使用 DescAgeComparator 对 list 进行排序，按照年龄降序排序
        Collections.sort(list, new DescAgeComparator());
        System.out.println(list);

        // 创建两个 Person 对象，属性均相同（年龄和姓名）
        Person person1 = new Person(10, "eeee");
        Person person2 = new Person(10, "eeee");
        // 使用自定义的 equals(Person) 方法判断两个对象是否相等
        // 注意：由于 equals 方法未正确重写 Object 的 equals(Object)，
        // 在其他场景（如集合操作）中可能会导致问题
        if(person1.equals(person2)){
            System.out.println("相等===");
        } else {
            System.out.println("不相等====");
        }
    }
}

