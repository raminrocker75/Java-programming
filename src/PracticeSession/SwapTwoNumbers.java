package PracticeSession;

public class SwapTwoNumbers {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int temp = b; // storing value of b =20
        b=a;
        a=temp;
        System.out.println("After swap a is: " + a + " and b is: " + b);

        // 2nd way of Swapping numbers

        int a1 = 20;
        int b1 = 10;
        a1 = a1 + b1; //30
        b1 = a1 - b1 ; // 20
        a1 = a1 - b1; // this is basically 30 - 20 = 10
        System.out.println("After swap a is:" + a1 + " and b1 is:" + b1);











    }
}
