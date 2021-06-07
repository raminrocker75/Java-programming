package Day_50_inheritence;

public class Student extends Person{

    String study = "Software development engineer in test";
    String school = "Cybertek";

    public void student(){
        System.out.println(name + " is studying " + study + " at " + school + " and age is: " + age );
    }

}
