package Day_61_exception_collection;

public class ElementaryStudentTest {
    public static void main(String[] args) {
        try {
            ElementaryStudent student = new ElementaryStudent();
            student.setName("Bob");
            student.setAge(1);
            System.out.println(student.toString());

        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("--- EXECUTION COMPLETED ---");
    }
}
