package Day_19_class_vs_object_strings;

public class StringLength {
    public static void main(String[] args) {
        String length = "Ramin Dadari";
        System.out.println("length = " + length.length() + " Letters");
        System.out.println("count: " + length.length());
        System.out.println("wooden spoon".length()); // respect the space between the wooden(SPACE)spoon!!!! that's why it shows 12.

        String firstName = "Nadir";
        System.out.println(firstName+ "-" + firstName.length()); // it wont count the dash in the middle cause it is not in our variable value!

        int count = firstName.length();       // so this way we stored a string value to int using string manipulations!
        System.out.println("count = " + count);


        String password = "abc123";
        if( password.length() >= 6) {
            System.out.println("password accepted");
        }else {
            System.out.println("haven't met minimum requirement");
        }


    }
}
