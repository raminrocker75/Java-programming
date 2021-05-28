package Day_47_Constructors;

public class Student {
    // no - args constructor
    public Student(){
        System.out.println("No - args constructor");
    }

    public Student(String name){
        System.out.println("name param constructor | name = " + name);
    }

    // constructor with age
    public Student(int age){
        System.out.println("Age param constructor | age = " + age);
    }

    // constructor with name and age
    public Student (String name , int age){
        System.out.println("name and age param constructor | name= "+ name+ " age= "+ age);
    }
}
