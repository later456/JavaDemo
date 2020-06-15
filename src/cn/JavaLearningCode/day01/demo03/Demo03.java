package cn.JavaLearningCode.day01.demo03;

import javax.swing.plaf.TableHeaderUI;

public class Demo03 {
    public static void main(String[] args) {
        Person[] array = new Person[3];
        Person one = new Person("迪丽热巴",18);
        Person two = new Person("古力娜扎",28);
        Person three = new Person("玛尔扎哈",38);

        //将one当中的地址值复制到数组的0号元素位置
        array[0] = one;
        array[1] = two;
        array[2] = three;

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2].getAge());
        System.out.println(array[1].getName());

    }
}
