package Day_56_absteraction;

public class DrivableTest {
    public static void main(String[] args) {
        Tesla tesla = new Tesla();
        tesla.transportPassengers();
        tesla.autoPiloting();
        tesla.cost(25);
        tesla.start();
        tesla.stop();
        System.out.println("---------------");
        Plane plane = new Plane();
        plane.start();
        plane.hi();
        plane.autoPiloting();
        plane.cost(250);
        plane.land();
        plane.stop();

        //polymorphism : Will learn next Class
        SelfDrivable sd1 =new Plane();
        SelfDrivable sd2 = new Tesla();
    }
}
