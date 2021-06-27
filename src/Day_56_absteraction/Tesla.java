package Day_56_absteraction;

public class Tesla extends Transportation implements SelfDrivable {

    @Override
    public void transportPassengers(){
        System.out.println("Tesla is transporting people on the roads");
    }

    @Override
    public void cost(int mile){
        System.out.println("Tesla cost " +(mile*0.10)+" to drive " + mile + " miles");
    }


    @Override
    public void autoPiloting() {
        System.out.println("Tesla has autoPilote mode");
    }
}
