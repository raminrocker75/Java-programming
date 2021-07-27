package Day_57_Absteraction_Polymorphism.polymorphism;

public class Square extends Shape{
    @Override
    public void draw(){
        System.out.println(" ___");
        System.out.println("|   |");
        System.out.println(" ---");
    }
}
