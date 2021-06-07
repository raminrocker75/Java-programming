package Day_50_inheritence;

public class StaticBlockTest {
    public static void main(String[] args) {
        StaticBlockDemo blockDemo1 = new StaticBlockDemo();// static(10) > constructor(15)
        StaticBlockDemo blockDemo2 = new StaticBlockDemo();// constructor(20)
        StaticBlockDemo blockDemo3 = new StaticBlockDemo();// constructor(25)
        System.out.println(StaticBlockDemo.num); //25
        System.out.println(StaticBlockDemo.carModels);

    }
}
