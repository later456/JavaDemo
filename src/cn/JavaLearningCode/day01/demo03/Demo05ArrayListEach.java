package cn.JavaLearningCode.day01.demo03;

import com.sun.jdi.ArrayReference;

import java.util.ArrayList;

public class Demo05ArrayListEach {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("dilireba");
        list.add("gulinazha");
        list.add("maerzhaha");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
