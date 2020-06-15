package cn.JavaLearningCode.day01.demo03;

import java.util.ArrayList;
import java.util.List;

public class Demo05ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<String> lsitA = new ArrayList<>();
        ArrayList<Integer> lsitB = new ArrayList<>();
        lsitB.add(100);
        lsitB.add(200);
        System.out.println(lsitB);
        int num = lsitB.get(0);
        System.out.println(num);
        System.out.println(lsitB);
    }
}
