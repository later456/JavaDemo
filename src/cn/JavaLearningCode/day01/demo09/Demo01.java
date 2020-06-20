package cn.JavaLearningCode.day01.demo09;

public class Demo01 {
    public static void main(String[] args) {
        //创建了实现类对象
        Demo01MyInterfaceStatlmpl impl = new Demo01MyInterfaceStatlmpl();
        //直接通过接口名称调用静态方法
        Demo01MyInterfaeStatic.methodStatic();
    }


}
