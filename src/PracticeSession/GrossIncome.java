package PracticeSession;
import java.util .Scanner;
public class GrossIncome {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("How many work hours per week: ");
        double workHour = scan.nextDouble();
        System.out.println("How much is the hourly rate: ");
        double hourlyRate = scan.nextDouble();
        double overTimeRate = 1.5 * hourlyRate ;
        System.out.println("Over time rate: " + overTimeRate );
        double overTime = 0;
        if (workHour<=40) {
            double timeHour = workHour;

        } else{
           overTime = workHour - 40;
        }
        double overTime1 = overTimeRate * overTime;
        double totalIncome = workHour * hourlyRate;
        double federalTax = 0.07 , socialTax = 0.06 , medicare = 0.01;
        double totalTax = federalTax + socialTax + medicare;
        System.out.println("Total tax rate: " + totalTax);
        System.out.println("Total income before tax: " + totalIncome);
        System.out.println("Total tax: " +(totalIncome * totalTax) );
        System.out.println("Total income after tax: " + (totalIncome - totalTax));



    }
}
