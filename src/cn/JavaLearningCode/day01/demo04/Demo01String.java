package cn.JavaLearningCode.day01.demo04;

public class Demo01String {
    public static void main(String[] args) {
        //使用空参构造
        String str1 = new String();  //小括号留空，说明字符串什么内容都没有
        System.out.println("diyigeziguchuan:" + str1);
        //根据字符数组创建字符串
        char[] charArray = {'A', 'B', 'C'};
        String str2 = new String(charArray);
        System.out.println("diergezifuchuan:" + str2);
        //根据字节数组创建字符串
        byte[] byteArray = {97,98,99};
        String str3 = new String(byteArray);
        System.out.println("disangezifuchuan:"+str3);
        //直接创建
        String str4 = "hello";
        System.out.println("disigezifuchuan:"+str4);

    }
}
