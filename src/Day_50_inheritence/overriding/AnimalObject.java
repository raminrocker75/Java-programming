package Day_50_inheritence.overriding;

public class AnimalObject {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.name = "Gray";
        animal.type = "pitbul";
        animal.speak();

        Cat cat = new Cat();
        cat.speak();


        Dog dog = new Dog();
        dog.speak();
    }
}
