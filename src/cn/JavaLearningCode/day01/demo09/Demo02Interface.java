package cn.JavaLearningCode.day01.demo09;

public class Demo02Interface {
    public static void main(String[] args) {
        MyInterfaceDefaultA a =new MyInterfaceDefaultA();
        a.methodAbs2();    //调用抽象方法，实际运行的是右侧实现类
        //调用默认方法，如果实现类当中没有，会向上找接口
        a.methodDefault();
        System.out.println("=============");
        MyInterfaceDefaultB b = new MyInterfaceDefaultB();
        b.methodAbs2();
        b.methodDefault();
    }



}
