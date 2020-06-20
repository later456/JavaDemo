package cn.JavaLearningCode.day01.demo09;

public interface MyInterfaceDefault {
    //抽象方法
    public abstract void methodAbs2();
//新添加了一个抽象方法
    public abstract void methodAbs3();
    //新添加的方法，改成默认方法
    public default void methodDefault(){
        System.out.println("这是新添加的默认方法");
    }

}
