package Day_36_Methods_With_Return;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(add(10,20));
        System.out.println(multiply(5,50));
        System.out.println(minus(10,10));
        System.out.println(divide(50,40));

    }
    public static double add(double num1 , double num2){

        double result = num1 + num2;
        return result;
    }
    public static double multiply(double num1 , double num2){
        double result = num1 * num2;
        return result;
    }
    public static double minus (double num1 , double num2){
        double result = num1 - num2;
        return result;
    }
    public static double divide (double num1 , double num2){
        double result = num1 / num2;
        return  result;
    }
}
