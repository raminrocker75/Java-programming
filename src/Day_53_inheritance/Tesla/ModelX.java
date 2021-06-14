package Day_53_inheritance.Tesla;

import Day_53_inheritance.Tesla.ElectricCar;

public class ModelX extends ElectricCar {

    public ModelX(String model, String make, double price, int year, int range) {
        super(model, make, price, year, range);
        System.out.println("Welcome to model X");
    }
}
