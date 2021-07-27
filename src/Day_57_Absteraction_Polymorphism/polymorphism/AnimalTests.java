package Day_57_Absteraction_Polymorphism.polymorphism;

import java.util.ArrayList;
import java.util.List;

public class AnimalTests {
    public static void main(String []args){
        Animal a1=new Animal(); //not polymorphic, data type and object type are same
        a1.makeNoise();

        //polymorphic way (polymorphism)
        //parent type = new child type
        Animal animal  = new Dog();
        Animal animal1 = new Horse();
        Animal animal2 = new Cat();
        //List list = new ArrayList();
        animal.makeNoise();
        animal1.makeNoise();
        animal2.makeNoise();

        //Polymorphic list of objects. List data type is Parent class
        //objects are any of child classes.
        List<Animal>listofAnimals = new ArrayList<>();
        listofAnimals.add(new Dog());
        listofAnimals.add(new Dog());
        listofAnimals.add(new Cat());
        listofAnimals.add(new Horse());

        for (Animal each : listofAnimals){
            each.makeNoise();
        }

    }
}
