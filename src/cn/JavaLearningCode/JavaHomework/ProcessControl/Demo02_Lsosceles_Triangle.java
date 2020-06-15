package cn.JavaLearningCode.JavaHomework.ProcessControl;
/**************************************************
 * 给定一个数字输出等腰三角形
 * 例如输入4
 * 输出的图形应该为下图                 *
 *                                     ***
 *                                    *****
 *                                   *******
 *  *************************************************/

import java.util.Scanner;


public class Demo02_Lsosceles_Triangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 从键盘接收数据
        int str1 = scan.nextInt();
        for (int Line_number = 0; Line_number < str1; Line_number++) {   //控制行数
            for (int k = 0; k < str1-Line_number; k++) {      //控制空格
                System.out.print(" ");
            }
            for (int j = 0; j < Line_number+1; j++) {       //控制*号
                System.out.print("* ");
            }
            System.out.println( );
        }
    }
}
