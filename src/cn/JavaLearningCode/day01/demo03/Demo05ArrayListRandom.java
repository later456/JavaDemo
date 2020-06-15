package cn.JavaLearningCode.day01.demo03;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Demo05ArrayListRandom {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 6; i++) {
            int num = r.nextInt(33)+1;
            list.add(num);
        }
        System.out.println(list);
    }
}
