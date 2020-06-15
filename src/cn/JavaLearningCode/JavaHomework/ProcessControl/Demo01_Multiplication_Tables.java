package cn.JavaLearningCode.JavaHomework.ProcessControl;
/*
*       1*1=1
*       2*1=2,2*2=4
*       3*1=3,3*2=6,3*3=9
*       .........
*       9*1=9    9*2=18  ......... 9*9=81
* */
public class Demo01_Multiplication_Tables {
    public static void main(String[] args) {
        int number = 0;
        for (int multiplier = 0; multiplier < 10; multiplier++) {
            for (int multiplicand = 1; multiplicand < multiplier+1; multiplicand++) {
                number = multiplicand*multiplier;
                System.out.print ( multiplicand +"*" +multiplier +"=" + number +" " );
            }
            System.out.println("");
        }
    }
}
