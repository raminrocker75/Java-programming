package day_10_shorthand_operators;

public class ChangeVariableValue {
    public static void main(String[] args) {
        int count = 50;
        System.out.println("count = " + count);
        count = count + 50;
        System.out.println("count = " + count);

        int apples = 5;
        System.out.println("apples = " + apples);
        apples = apples + 10;
        System.out.println("apples = " + apples);
        apples = apples - 3;
        System.out.println("apples = " + apples);

        int pizzaSlices = 8;
        System.out.println("pizzaSlices = " + pizzaSlices);
        pizzaSlices = 8/2;
        System.out.println("pizzaSlices = " + pizzaSlices);
        pizzaSlices = pizzaSlices + 6;
        System.out.println("pizzaSlices = " + pizzaSlices);

        int playes = 10;
        System.out.println("playes = " + playes);
        playes = playes * 2;
        System.out.println("playes = " + playes);

        int cents = 568;
        System.out.println("cents = " + cents);
        cents = cents % 100;
        System.out.println("remaining cents = " + cents); // keep the change.

    }
}
