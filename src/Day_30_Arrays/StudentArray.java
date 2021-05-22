package Day_30_Arrays;

public class StudentArray {
    public static void main(String[] args) {
        String[] student = {"Ramin", "Dadari", "batch 22", "314-337-7928"};
        int s = student.length;
        System.out.println(s);
        System.out.println("First name: " + student[0]);
        System.out.println("Last name : " + student[1]);
        System.out.println("batch number: " + student[2]);
        System.out.println("Phone number: " + student[3]);

        System.out.println("\n");

        String[] student2 = new String[5];
        student2[0] = "AD1234";
        student2[1] = "Adam";
        student2[2] = "Smith";
        student2[3] = "B22";
        student2[4] = "201_123-2156";
        System.out.println("Student2 id =" + student2[0]);
        System.out.println("Student2 first name =" + student2[1]);
        System.out.println("Student2 Last name =" + student2[2]);
        System.out.println("Student2 Batch number =" + student2[3]);
        System.out.println("Student2 Phone number =" + student2[4]);

        System.out.println("\n");
        if (student2.length==5){
            System.out.println("pass: data array has correct length.");
        }else {
            System.out.println("Fail: data array has incorrect length.");
        }

        System.out.println("\n");
        if (student.length == student2.length) {
            System.out.println("pas: data array has correct length");
        }else {
            System.out.println("Fail: data array has incorrect length");
        }

        String [] firstNameAndLastName ={student2[1] , student2[2]};

        System.out.println(firstNameAndLastName[0].toUpperCase() +"\s" + firstNameAndLastName[1].toUpperCase());

    }
}
