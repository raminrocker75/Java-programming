package Day_44_custom_classes;

public class AnimalObjects {
    public static void main(String[] args) {
        Animal obj = new Animal();
        System.out.println(obj.type);
        obj.eat();
        obj.speak();

        Animal cheetahObj = new Animal();
        cheetahObj.type = "cheetah";
        System.out.println(cheetahObj.type);
        cheetahObj.eat();
        cheetahObj.speak();
    }
}
