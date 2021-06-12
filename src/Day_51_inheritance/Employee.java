package Day_51_inheritance;

public class Employee extends Object {
    String jobTitle;
    double annualSalary;
    public double calculateSalary(double hourlyRate){

        return 52 * 40 * hourlyRate * 1.1;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "jobTitle='" + jobTitle + '\'' +
                ", annualSalary=" + annualSalary +
                '}';
    }
}
