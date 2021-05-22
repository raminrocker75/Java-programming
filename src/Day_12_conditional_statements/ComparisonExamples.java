package Day_12_conditional_statements;

public class ComparisonExamples {
    public static void main(String[] args) {
        int currentSpeed = 45;
        int speedLimit = 55;


//        System.out.println("Are you speeding? - " + isSpeeding);

        System.out.println("are you speeding? " + (currentSpeed==speedLimit));
        System.out.println(currentSpeed>speedLimit);
        System.out.println(currentSpeed<speedLimit);

        boolean isSpeeding = currentSpeed<speedLimit;
        System.out.println("Are you speeding? " + isSpeeding);
        System.out.println("currentSpeed = " + currentSpeed +" MPH ");
        System.out.println("speedLimit = " + speedLimit + " MPH");

        currentSpeed +=120;
        isSpeeding = currentSpeed > currentSpeed;
        System.out.println();
        System.out.println("Are you speeding? " + isSpeeding);
        System.out.println("currentSpeed = " + currentSpeed +" MPH ");
        System.out.println("speedLimit = " + speedLimit + " MPH");

        System.out.println();

        double accountBalance = 250.25;
        double itemPrice = 200.99;
        System.out.println("can i afford? " + (accountBalance>=itemPrice));

        boolean canAfford = accountBalance>=itemPrice;
        System.out.println("canAfford = " + canAfford);

        accountBalance = accountBalance - itemPrice;
        accountBalance -= itemPrice;

        boolean isBroke = accountBalance <=0;
        System.out.println("isBroke? " + isBroke);




    }
}
