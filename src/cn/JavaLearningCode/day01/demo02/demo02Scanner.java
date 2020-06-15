package cn.JavaLearningCode.day01.demo02;

import java.lang.String;
import java.sql.SQLOutput;
import java.util.Scanner; //导包

public class demo02Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //System.in 代表从键盘输入
        int num = sc.nextInt();
        System.out.println("输入的int数字是：" + num);

        String str = sc.next();
        System.out.println("输入的字符串是：" + str);
    }
}
