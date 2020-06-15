package cn.JavaLearningCode.day01.demo03;

import java.util.ArrayList;

public class Demo04ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student one = new Student("honhqigong", 20);
        Student two = new Student("ouyangfeng", 21);
        Student three = new Student("huangyaoshi", 22);
        Student four = new Student("duanzhixing", 23);

        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println("xingming:" + stu.getName() + "nianlin" + stu.getAge());
        }

    }
}
