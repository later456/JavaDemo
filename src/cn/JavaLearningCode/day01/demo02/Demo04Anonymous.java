package cn.JavaLearningCode.day01.demo02;

import java.util.Scanner;

public class Demo04Anonymous {
    public static void main(String[] args) {
/*        Person one = new Person();
        one.name = "高圆圆";
        one.showName();
        System.out.println("===========");
        new Person().name =  "赵又廷";
        new Person().showName();*/
        /*  methodParam(new Scanner(System.in))*/
        ;
        Scanner sc = methodParam();
        int num = sc.nextInt();
        System.out.println("shurudeshi:" + num);
    }

/*    public static void methodParam(Scanner sc) {
        int num = sc.nextInt();
        System.out.println("shurudeshi:" + num);
    }*/

    public static Scanner methodParam() {
/*        Scanner sc = new Scanner(System.in);
        return sc;*/
        return new Scanner(System.in);
    }
}
