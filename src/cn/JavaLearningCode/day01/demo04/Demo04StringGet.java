package cn.JavaLearningCode.day01.demo04;

import java.util.Calendar;

public class Demo04StringGet {
    public static void main(String[] args) {
        int length = "asdadasdasdasdadasd".length();
        System.out.println("zifuchuandechuangdushi:"+length);

        //拼接字符串
        String str1 = "hello";
        String str2 = "world";
        String str3 = str1.concat(str2);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        char ch = "hello".charAt(1);
        System.out.println("在1号索引位置的字符是："+ch);
        System.out.println("=====================");

        String original = "helloworldhelloworld";
        int index = original.indexOf("llo");
        System.out.println("diyicisuoyinzhishi:"+index); //如果有只查找返回的第一次
        System.out.println("helloworld".indexOf("abc")); //如果没有就返回-1
    }
}
