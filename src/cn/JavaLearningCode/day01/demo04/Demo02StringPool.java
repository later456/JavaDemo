package cn.JavaLearningCode.day01.demo04;

public class Demo02StringPool {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        char[] charArray = {'a', 'b', 'c'};
        String str3 = new String(charArray);
        System.out.println(str1 == str2);  //true
        System.out.println(str1 == str3);  //false
        System.out.println(str1 == str3);  //false
    }
}
