package cn.JavaLearningCode.day01.demo09;

public class MyInterfaceDefaultA implements  MyInterfaceDefault {
    @Override
    public void methodAbs2() {
        System.out.println("实现了抽象方法A");
    }

    @Override
    public void methodAbs3() {

    }

    @Override
    public void methodDefault() {
        System.out.println("实现类B");
    }
}
