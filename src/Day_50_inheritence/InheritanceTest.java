package Day_50_inheritence;

public class InheritanceTest {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Bakyt";
        person1.age = 30;
        person1.talk();
        person1.walk();
        person1.work("SDET");

        Teacher t1 = new Teacher();
        t1.teacherID = 1234;
        t1.name = "Murodil";
        t1.age = 48;
        t1.talk();
        t1.teach("Java" );


        Student student = new Student();
        student.age = 25;
        student.name = "Ramin";
        student.student();


    }
}
