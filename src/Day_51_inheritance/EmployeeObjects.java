package Day_51_inheritance;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee employee = new Employee();
        System.out.println("employee.calculateSalary(55.0) = " + employee.calculateSalary(55.0));
        double annualSalary = employee.calculateSalary(55.0);
        System.out.println("annualSalary = " + Math.round(annualSalary));
        employee.jobTitle = "Developer";
        System.out.println("employee.toString() = " + employee.toString());


        Contractor sdetContractor = new Contractor();
        System.out.println("sdetContractor.calculateSalary(65) = " + sdetContractor.calculateSalary(65));

    }
}
