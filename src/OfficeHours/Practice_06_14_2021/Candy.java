package OfficeHours.Practice_06_14_2021;
/*
Create a class Candy [Parent class]

    * instance variables:
        - brand (String), quantity (int), contains peanuts (boolean),

    * static variables:
        - number of total candy (int)

    * constructor to set all variables
        - Also increments total candy every time an object is made

    * encapsulate
        - Add one set of logic for quantity [ given number cannot be less than 0, otherwise it is not assigned]

    * override toString
 */
public class Candy {
    private String brand;
    private int quantity;
    private boolean containsPeanuts;
    private static int totalNumberOfCandies;

    public Candy(String brand, int quantity, boolean containsPeanuts) {
        this.brand = brand;
        setQuantity(quantity);
        this.containsPeanuts = containsPeanuts;
        totalNumberOfCandies++;
    }



    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity>0){
            this.quantity = quantity;
        }
    }

    public boolean isContainsPeanuts() {
        return containsPeanuts;
    }

    public void setContainsPeanuts(boolean containsPeanuts) {
        this.containsPeanuts = containsPeanuts;
    }

    public static int getTotalNumberOfCandies() {
        return totalNumberOfCandies;
    }

    public static void setTotalNumberOfCandies(int totalNumberOfCandies) {
        Candy.totalNumberOfCandies = totalNumberOfCandies;
    }

    @Override
    public String toString() {
        return "Candy{" +
                "brand='" + brand + '\'' +
                ", quantity=" + quantity +
                ", containsPeanuts=" + containsPeanuts +
                '}';
    }
}
