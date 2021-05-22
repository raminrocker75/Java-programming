package PracticeSession;

public class Increment_Decrement {
    public static void main(String[] args) {
        int a = 3 , b =2;
        int c = (a-- + b) * 2/3%2;

        // a= 3 - 1 = 2
        // b= 2 = 2
        // c= (3 + 2) * 2 / 3 % 2;
        //        5  * 2 / 3 % 2;
        //          10  / 3 % 2 = 1
        //          10  / 3 = 3.33
        //          3.33 % 2 = 1

        int numOne = 10;
        int numTwo = numOne++ * 3 + ++numOne + numOne++ % 2;
        int biggest = numOne > numTwo ? numOne : numTwo;

        //numOne = 10 +1 +1 +1 = 13
        // numTwo = 10 * 3 + 12 + 12 % 2; = 0



    }
}
