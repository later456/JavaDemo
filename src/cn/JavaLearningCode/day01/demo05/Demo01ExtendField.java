package cn.JavaLearningCode.day01.demo05;

public class Demo01ExtendField {
    public static void main(String[] args) {
        FU fu = new FU();
        System.out.println(fu.numFu);
        Zi zi = new Zi();
        System.out.println(zi.numFu);
        System.out.println(zi.numZi);
        System.out.println("=================");
        System.out.println(zi.num);

        zi.methodZi();
        zi.methodFu();
    }
}
