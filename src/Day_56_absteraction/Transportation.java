package Day_56_absteraction;

public abstract class Transportation {
    public abstract void transportPassengers();
    public abstract void cost(int mile);
    public void start(){
        System.out.println("Start the engine");
    }
    public void stop(){
        System.out.println("Shut off the engine");
    }
}
