package Day_50_inheritence.overriding;

public class Dog extends Animal {
    public void run(){
        System.out.println("Dog is running ...");
    }
    @Override
    public void speak(){
        System.out.println("dog is saying bark bark");
    }
}
