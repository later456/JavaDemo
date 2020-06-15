package cn.JavaLearningCode.day01.demo03;

import java.util.ArrayList;

public class Demo04ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);
        //向集合中添加元素
        boolean success = list.add("later");
        System.out.println(list);
        System.out.println("添加的动作是否成功：" +success);
        list.add("gaoyuanyaun");
        list.add("zhaoyouting");
        list.add("lixiaolu");
        list.add("jianailiang");
        //从集合中获取元素  从0号元素开始
        System.out.println(list);
        String name = list.get(2);
        System.out.println("第二号索引位置:"+name);
        System.out.println("==============");
        String whoRemoved = list.remove(3);
        System.out.println("被删除的人是："+whoRemoved);
        System.out.println(list);
        System.out.println("==============");
        int  size = list.size();
        System.out.println(size);

    }
}
