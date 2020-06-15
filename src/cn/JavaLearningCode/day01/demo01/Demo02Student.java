package cn.JavaLearningCode.day01.demo01;

import cn.JavaLearningCode.day01.demo01.Student;

public class Demo02Student {
    public static void main(String[] args) {
        Student stu1 = new Student(); // 无参构造
        System.out.println("============");

        Student stu2 = new Student("asd", 18); // 全参构造
        System.out.println("姓名：" + stu2.getName() + "，年龄：" + stu2.getAge());
        stu2.setAge(21); // 改变年龄
        System.out.println("姓名：" + stu2.getName() + "，年龄：" + stu2.getAge());

    }

}