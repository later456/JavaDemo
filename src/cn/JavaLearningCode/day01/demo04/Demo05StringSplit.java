package cn.JavaLearningCode.day01.demo04;

public class Demo05StringSplit {
    public static void main(String[] args) {
        String str1 = "aaa,bbb,ccc";
        System.out.println(str1);
        String[] array1 = str1.split(",");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        String str2 = "AAA.BBB.CCC";
        String[] array2 = str2.split("//.");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
    }
}
