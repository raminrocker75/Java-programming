package Day_43_list_custom_classes;

public class Person {
// data -> variables
    String firstName;
    int age;
    char gender;
// behavior
    public void speak(){
        System.out.println("person is speaking");
    }
}

class People {
    public static void main(String[] args) {
        // create object of person class - Instantiation Person class
        Person person1 = new Person();
        person1.firstName = "Bob";
        person1.age = 33;
        person1.gender= 'M';
        person1.speak();

        System.out.println("Person1 first name = " + person1.firstName);
        System.out.println("person1 age = "+person1.age);
        System.out.println("person1 gender = " + person1.gender);

        Person person2 = new Person();
        person2.firstName = "Mike";
        person2.age = 29;
        person2.gender = 'M';
        person2.speak();
        System.out.println("person2 first name = " + person2.firstName);
        System.out.println("person2  age = " + person2.age);
        System.out.println("person2 gender = " + person2.gender);



    }
}