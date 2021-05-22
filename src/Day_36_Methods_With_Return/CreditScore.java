package Day_36_Methods_With_Return;

public class CreditScore {
    public static void main(String[] args) {
        checkEligible(700);
        checkEligible(765);
        checkEligible(615);
//        System.out.println(checkEligible(45464)); Can not print void method!
        System.out.println(getCreditScore());
        System.out.println("CreditScore = " + getCreditScore());
        int score = getCreditScore(); // assigning
        System.out.println("score = " + score);
    }

    public static void checkEligible(int creditScore) {
        if (creditScore >= 700) {
            System.out.println("You are eligible for leasing this car");
        } else {
            System.out.println("Sorry, you are not eligible for leasing this car");
        }

    }

    public static int getCreditScore() {
        return 800;

    }
}