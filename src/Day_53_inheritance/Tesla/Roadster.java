package Day_53_inheritance.Tesla;

import Day_53_inheritance.Tesla.ElectricCar;

public class Roadster extends ElectricCar {
//        Roadster roadster = new Roadster("Roadster",20000,2022,620);

    public Roadster(String model, double price, int year, int range) {
        super("Tesla", model, price, year, range);
        System.out.println("Welcome new Roadster!");
    }
}
