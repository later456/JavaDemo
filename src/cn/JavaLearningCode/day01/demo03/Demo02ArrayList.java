package cn.JavaLearningCode.day01.demo03;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Demo02ArrayList {
    public static void main(String[] args) {
        //创建了一个ArrayList集合，集合的名称是list,里面装的全部都是String字符串类型的数据
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);
        list.add("赵丽颖");
        System.out.println(list);
        list.add("迪丽热巴");

        list.add("玛尔扎哈");
        System.out.println(list);
    }



}
