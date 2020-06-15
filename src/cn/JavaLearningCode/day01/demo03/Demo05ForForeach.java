package cn.JavaLearningCode.day01.demo03;

public class Demo05ForForeach {
    public static void main(String[] args) {
        String[] books = {"fengkuangJavajiangyi","fengkuangAndroidjiangyi"};
        for (String book:books){
            book = "later";
            System.out.println(book);
        }
        System.out.println(books[0]);
    }
}
