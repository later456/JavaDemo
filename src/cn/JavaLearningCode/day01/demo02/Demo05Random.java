package cn.JavaLearningCode.day01.demo02;

import java.util.Random;
import java.util.Scanner;

public class Demo05Random {
    /*    public static void main(String[] args) {
            Random r = new Random();
            for (int i = 0; i < 20; i++) {
                int num = r.nextInt(10);
                System.out.println(num);
            }
        }*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            int result = r.nextInt(n) + 1;
            System.out.println(result);
        }

    }
}
