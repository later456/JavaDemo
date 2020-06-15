package cn.JavaLearningCode.day01.demo04;

public class Demo04Substring {
    public static void main(String[] args) {
        String str1 = "helloworld";
        String str2 = str1.substring(5);
        System.out.println(str1);
        System.out.println(str2);

        String str3 = str1.substring(4,7);
        System.out.println(str3);

        String strA = "Hello";
        System.out.println(strA);
        strA = "Java";
        System.out.println(strA);
    }

}
