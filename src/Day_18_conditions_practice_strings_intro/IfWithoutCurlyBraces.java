package Day_18_conditions_practice_strings_intro;

public class IfWithoutCurlyBraces {
    public static void main(String[] args) {
        String todayClass = "python";

        if(todayClass.equals("java"))
            System.out.println(" Java is fun");
//            System.out.println("java is fun again");
        else
            System.out.println("It is not Java. it is " + todayClass);
    /*
          Sometimes we can skip using curly braces only if if have one statement but if it is more than one statement
          we must use curly braces and there's difference/benefits using above method!
     */

        int score = 1;

        if (score == 1) {
            System.out.println("lowest score is " + score);
        }else if (score == 2 ) {
            System.out.println("Score is " + score);
        }else if (score == 3) {
            System.out.println("Score is " + score);
        }else {
            System.out.println("Invalid score");
        }

        int a = 10;
        if (a == 1)
            System.out.println("a is 1");
            System.out.println("1 is a"); // this run because it is independent



    }
}
