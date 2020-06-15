package cn.JavaLearningCode.day01.demo05;

public class Demo01 {
    public static void main(String[] args) {
        //创建了一个子类对象
        Teacher teacher = new Teacher();
        teacher.method();

        //创建另外一个子类助教的对象
        Assistant assistant = new Assistant();
        assistant.method();
    }
}
