package Day_25_loops;

public class ForLoopFirst {
    public static void main(String[] args) {
        /**
         * Below is infinite loop with for loop like : while (true) { }
         * for (;;) {
         *     System.out.println("Java is fun!");
         * }
         */
        for(int i = 0; i<=5 ; i++){
            System.out.println("Hello world " +i);
        }
//           1)         2)      4)
        for(int a = 1 ; a<=10; a++ ){
            System.out.println(a); //3)
        }

        for(int stars = 1; stars<=15; stars++){
            System.out.print("\uD83C\uDF1F");
        }

        System.out.println();// we are putting this here cause last statement was print and not println.

        String myStars = ""; // this can not be inside the loop cause loop will repeat the same variable multiple times and java won't do tha!

        for (int i = 1; i<=5 ; i++){
            myStars +="* "; // so += this is concatenating the String variable (Adding)
        }
        System.out.println("my stars: " + myStars.trim());




    }
}
