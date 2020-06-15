package cn.JavaLearningCode.day01.demo06;
//局部变量:
//本类的成员变量： this.成员变量
//父类的成员变量    super.成员变量

//重写 :override
//概念：在继承关系当中，方法的名称一样，参数列表一样

//重写：override ：方法名称一样，参数列表【也一样】。覆盖、覆写
//重载：overload：方法的名称一样。参数列表【不一样】
//方法的覆盖重写特点：创建的是子类对象，优先使用的子类方法
public class Demo01ExtendsField {
    public static void main(String[] args) {
       /* Zi zi = new Zi();
        zi.method();*/
        Zi zi = new Zi();
        zi.methodZi();
        zi.methodFu();

        zi.method();
    }
}
