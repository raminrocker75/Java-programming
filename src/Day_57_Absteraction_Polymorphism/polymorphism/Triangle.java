package Day_57_Absteraction_Polymorphism.polymorphism;

public class Triangle extends Shape {

    @Override
    public void draw(){
        for (int outer = 1 ; outer<= 5 ; outer++){
            for (int inner = 1 ; inner<=outer ; inner++){
                System.out.print("* ");
            }
            System.out.println(); // go to new line each time
        }
    }
}
