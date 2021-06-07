package Day_50_inheritence;

public class Person {
    String name;
    int age;

    public void walk (){
        System.out.println("person is walking");
    }

    public void talk(){
        System.out.println( name + " is taking");
    }

    public void work(String job){
        System.out.println("Person works as " + job);
    }

}
