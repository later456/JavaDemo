package cn.JavaLearningCode.day01.demo04;

public class Demo03StringEquals {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        char[] charArray = {'h','e','l','l','o'};
        String str3 = new String(charArray);
        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));
        System.out.println(str3.equals("hello"));
        System.out.println("hello".equals(str1));

        String str4 = "Hello";
        System.out.println(str1.equals(str4));
        System.out.println("=====================");
        String str5 = "abc";
        System.out.println("abc".equals(str5));
        System.out.println(str5.equals("abc"));

        String strA = "Java";
        String strB = "java";
        System.out.println(strA.equals(strB));
        System.out.println(strA.equalsIgnoreCase(strB));  //equalsIgnoreCase 忽略大小写


    }
}
