package PracticeSession;

public class PreIncrementAndPostIncrement {
    public static void main(String[] args) {
        int num1 = 5;
        num1++;
        ++num1;
        System.out.println(num1);
        --num1;
        System.out.println(num1);

        int num2 = num1++ + num1;
        System.out.println(num2);
        System.out.println(num2);
        System.out.println(num1);

        int a = 20;
        a++; // 21
        ++a;// 22

        int b = a++ + 10 + ++a + a++ / a;
            //a = 22 +1 + 1
            //b = 22 + 10 + 24 + 24 + 25


        System.out.println(b);


    }
}
