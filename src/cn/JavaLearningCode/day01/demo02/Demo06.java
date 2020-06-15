package cn.JavaLearningCode.day01.demo02;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Demo06 {
    public static void main(String[] args) {
        Random r = new Random();
        int numberRandom = r.nextInt(100);//随机生成100以内的数
        Scanner sc = new Scanner(System.in);
        System.out.println("欢迎体验猜数字游戏\n请输入您猜测的数字");
        while (true) {
            int numberScanner = sc.nextInt();
            if (numberScanner > numberRandom) {
                System.out.println("您输入的数字"+numberScanner+"太大，请重新输入");
            } else if (numberRandom > numberScanner){
                System.out.println("您输入的数字"+numberScanner+"太小，请重新输入");
            }else {
                System.out.println("您输入的数字为:"+numberScanner+"\n随机数为:"+numberRandom+"\n恭喜您回答正确");
            }
        }
    }
}
