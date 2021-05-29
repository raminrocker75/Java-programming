package Day_48_constructors_static.static_Examples;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator.add(5,3); // static method can be called using class name. Calssname.staticMethodName;

        Calculator calculator = new Calculator();
        calculator.multiply(3,6);
        // Calculator.multiply by itself will give us an error because it's none static. need object to call it.
        //multiply is instance method, and we are creating object the calling it
        Calculator calculatorObject = new Calculator();
        calculatorObject.multiply(2,4);

        calculatorObject.add(5,45);

    }
}
