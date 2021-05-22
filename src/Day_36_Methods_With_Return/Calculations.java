package Day_36_Methods_With_Return;

public class Calculations {
    public static void main(String[] args) {
        System.out.println("add 10 + 45 = " + Calculator.add(10,45));
        System.out.println("100 - 40 = " + Calculator.minus(100,40));
        System.out.println("10 * 20 = " + Calculator.multiply(10,20));
        System.out.println("40 / 20 = " + Calculator.divide(40,20));

        double d1 = 345.0;
        double d2 = 456.0;
        double result = Calculator.multiply(d1,d2);
        System.out.println("result = " + result);
    }
}
