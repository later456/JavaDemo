package cn.JavaLearningCode.day01.demo07;
//定义一个新手机
public class NewPhone extends Phone {
    @Override
    public void show(){
        super.show(); //把父类的show方法拿过来重复利用
//        System.out.println("显示号码");
        System.out.println("显示姓名");
        System.out.println("显示头像");
    }
}
