package Day04_Variables_intro;

public class VariablesPractice {
    public static void main(String[] args){
//        Declare variable students that stores number
        int students; // Declare ONCE.
        students=50; // Assign 50
        System.out.println(students);
        System.out.println(students);
        students=70;
        System.out.println(students);
        students=111; // this one is not gonna be printed cause the system runs form top to bottom and hast be called for printing!
        students=125;
        System.out.println(students);

        int teachers;
        teachers=2;
        int mentors;
        mentors=25;
        System.out.print("The number of teachers:");
        System.out.println(teachers);
        System.out.print("The number of mentors:");
        System.out.println(mentors);
        System.out.println(students);
        students=250;
        System.out.print("The number of students: ");
        System.out.println(students);




    }
}
