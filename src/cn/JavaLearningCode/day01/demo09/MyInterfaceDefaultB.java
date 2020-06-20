package cn.JavaLearningCode.day01.demo09;

public class MyInterfaceDefaultB implements MyInterfaceDefault {
    @Override
    public void methodAbs2() {
        System.out.println("实现了方法B");
    }

    @Override
    public void methodAbs3() {

    }

    @Override
    public void methodDefault() {
        System.out.println("实现类B覆盖重写了接口的默认方法");
    }
}
