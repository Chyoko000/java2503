package test;


import java.util.*;

/**
 * @program: java2503
 * @ClassName performanceanalysissystems
 * @description: 成绩分析系统（数组）
 * @author: HarlanSu
 * @create: 2025−03-27 20:49
 * @Version 1.0
 *输入10个学生成绩（0-100）
 *输出最高分、最低分、平均分
 *统计及格率（≥60）
 * 知识点：
 * - 数组遍历
 * - Math.max/min
 * - 格式化输出
 **/
//使用Collections.sort自定义排序
public class performanceanalysissystems {
    public static class gradesComparator implements Comparator<Integer>{
        //其他静态方法和变量通常用于类本身的共享资源或功能，静态成员不需要创建类的实例就可以访问。
        @Override
        public int compare(Integer o1, Integer o2) {
            return Integer.compare(o1, o2);  // 使用 Integer 类自带的 compare 方法来比较两个 Integer
        }

    }


    public static void main(String[] args) {
        //输入成绩
        List<Integer> list =new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入多个学生的学习成绩,输入非整数字符结束");
        while (scanner.hasNextInt()){
            int grades=scanner.nextInt();
            list.add(grades);
        }
        //重写一个compare自定义排序'
        scanner.close();
        //先进行排序
        Collections.sort(list,new gradesComparator());
        //Integer 自带 compareTo 方法，排序可以直接使用 Collections.sort(list)。
        System.out.println("学生成绩排行是"+list);
        int size= list.size();
        //输出最高分
        System.out.println("这些同学中的最高分是"+list.get(size-1));
        //输出最低分
        System.out.println("这些学生中的最低分是"+list.get(0));
        //输出平均分
        double num= 0;
        for (int i = 0; i < size; i++) {
            num=num+ list.get(i);
        }

        System.out.println("这些学生的平均分是"+num/size);
        //求出及格率
        int num2=0;
        for (int i = 0; i < size; i++) {
            if(list.get(i)>=60){
                num2=num2+1;
            }
        }
        System.out.println("学生的及格率是"+((double)num2/size)*100+"%");//使用（double）确保输出正常，因为取百分比的个位数会是0
    }
}
