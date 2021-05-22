package Day_11_comparison_operators;

public class PrepostIncrementDecrementOperators {
    public static void main(String[] args) {
//        pre-Increment
        int num1 = 10;
        int num2 = ++num1; // added 1 because off ++ before the var name
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
//        post-Increment
        int num3 = 4;
//        int num4 = num3
//        num3++ adds up
        int num4 = num3;
        num3++;
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);

        int apples = 5;
        int basket = ++apples;

        System.out.println("apples = " + apples);
        System.out.println("Apples in the Basket = " + basket);


        int kiwi = 15;
        int kiwiBasket = kiwi++;
        System.out.println("kiwi = " + kiwi);
        System.out.println("kiwiBasket = " + kiwiBasket);


        int cars = 5;
        System.out.println("cars = " + ++cars);

        int sedans = 10;
        System.out.println("sedans = " + sedans++);
        System.out.println("sedans = " + sedans);

        int myNumber = 44;
        myNumber++;
        System.out.println("myNumber = " + myNumber);//45
        ++myNumber;                                               // this is adding up because...
        System.out.println("myNumber = " + myNumber);//46


        myNumber = 20;
        System.out.println("myNumber = "+ ++ myNumber);


        int a = 50;
        int b = 22;
        int c = a++ + ++b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);







    }
}
