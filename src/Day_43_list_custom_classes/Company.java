package Day_43_list_custom_classes;

public class Company {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.name = "Ramin Dadari";
        emp1.jobTitle = "SDET";
        emp1.work();
        System.out.println(emp1.name);
        System.out.println(emp1.jobTitle);


        Employee emp2 = new Employee();
        emp2.name = "Mary Barfield";
        emp2.jobTitle = "fullstack Software Developer";
        emp2.work();

        System.out.println(emp2.name);
        System.out.println(emp2.jobTitle);


        Employee emp3 = new Employee();
        emp3.name = "Mj Semati";
        emp3.jobTitle = "Murodil's java Assistant";
        emp3.work();


    }
}
