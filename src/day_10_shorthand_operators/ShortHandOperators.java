package day_10_shorthand_operators;

public class ShortHandOperators {
    public static void main(String[] args) {
        int cars = 10;
        System.out.println("cars = " + cars);
        cars = cars+2;
        System.out.println("cars = " + cars);
        cars += 5; // if we changed the order for ex: cars=+5 is just gonna show us 5. gotta make sure we have the right order.
        System.out.println("cars = " + cars);

        cars -=8; // longer way is gonna be like this for ex: cars = cars - 8. short hand is better.
        System.out.println("cars = " + cars);
//        if we did like this cars =- 8 its gonna show us -8 cause its thinking were just declaring a number for it not doing the math actions on it.

        cars = cars - 1;
//                         these two are getting decreased from the result.
        cars -= 1;
        System.out.println("cars = " + cars);

        int electricCars = 13;
        electricCars = electricCars + 52;
        System.out.println("electricCars = " + electricCars);
        electricCars -= 25;
        cars += electricCars;
        System.out.println("electricCars = " + cars);


        String word = "java";
        System.out.println("word = " + word);

        word= word+" programming";
        System.out.println("word = " + word);

        word +=" is fun.";
        System.out.println("word = " + word);

        String selenium = " but \"selenium \"  is more fun.";
        word += selenium;
        System.out.println("Word = " + word);
        word += 12345;
        System.out.println("word = " + word);


        char letters = 'A';
        System.out.println("Letter = " + letters);
        letters += 3;
        System.out.println("letters = " + letters);
        letters += 6;
        System.out.println("letters = " + letters);

        double parkingFee = 7.50;
        System.out.println("Normal parkingFee = " + parkingFee);
//        EarlyBird parking fee 50% off.
        parkingFee /=2;
        System.out.println("Early bird parkingFee = " + parkingFee);
        parkingFee -= parkingFee;
        System.out.println("Weekend parkingFee = " + parkingFee);



























    }
}
