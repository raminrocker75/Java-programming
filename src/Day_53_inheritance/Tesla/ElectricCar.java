package Day_53_inheritance.Tesla;

public class ElectricCar extends Object{
    private String model;
    private String make;
    private double price;
    private int year;
    private int range;
    private static int count; // all objects will share this variable

    public ElectricCar(String model, String make, double price, int year, int range) {
        this.model = model;
        setMake(make); // reuse the code in the setter condition
        this.price = price;
        this.year = year;
        this.range = range;
        count++; // increase count by 1 every time a new car is created
    }

    @Override
    public String toString() {

        return "ElectricCar{" +
                "model='" + model + '\'' +
                ", make='" + make + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", range=" + range +
                '}';
    }

    public ElectricCar(int range) {
        this.range = range;
    }

    protected void drive(int miles){
        if (range==0 || range - miles < 0){
            System.out.println("Error: Cannot drive that far, need to charge.");
        }else {
            range -= miles;
            System.out.println("Driving " + miles + " miles....");
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        if(make.isEmpty()){
            System.out.println("Error: make cannot blank");
        }else {
            this.make = make;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        ElectricCar.count = count;
    }
}
