package Day_14_multi_branch_if_statements;

public class IfWithoutElse {
    public static void main(String[] args) {
        int year = 2020;
        if (year == 2020) {
            System.out.println("covid pandemic year");
            System.out.println("Wear mask and keep distance");
        }

        System.out.println("Keep coding java"); // this line always prints cause it outside of the if and else curly braces!

        String country = "USA";
        if (country.equals("USA")) {
            System.out.println("I love USA and ill die for it if need be");
            System.out.println("Washington DC is the capital");
            System.out.println("White house is on Pennsylvania ave");
        }


        System.out.println("Welcome to " + country);


    }
}
