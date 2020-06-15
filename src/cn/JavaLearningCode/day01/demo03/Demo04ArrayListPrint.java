package cn.JavaLearningCode.day01.demo03;

import org.w3c.dom.css.ElementCSSInlineStyle;

import java.lang.invoke.CallSite;
import java.util.ArrayList;

public class Demo04ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("zhangsanfeng");
        list.add("songyuanqiao");
        list.add("zhangwuji");
        list.add("zhangcuishan");
        System.out.println(list);
        printArrayList(list);
    }

    public static void printArrayList(ArrayList<String> list) {
        System.out.print ("{");
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            if (i == list.size() - 1) {
                System.out.println(name + "}");
            } else {
                System.out.print(name+"@");
            }
        }
    }
}
