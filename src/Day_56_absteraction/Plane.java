package Day_56_absteraction;

public class Plane extends Transportation implements SelfDrivable, Greeting {

    @Override
    public void hi() {
        System.out.println("Welcome aboard");
    }

    @Override
    public void bye() {
        System.out.println("By passengers");
    }

    @Override
    public void transportPassengers() {

    }

    @Override
    public void autoPiloting() {

    }

    @Override
    public void cost(int mile) {
        System.out.println((mile*10)+"$");
    }

    public void land(){
        System.out.println("Plane is landing");
    }
}
