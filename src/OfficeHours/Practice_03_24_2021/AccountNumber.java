package OfficeHours.Practice_03_24_2021;

public class AccountNumber {
    /*
    [Account Number]

Declare a variable account number (String). You will check if these account numbers are valid.
    - If the account number begins with a “2” the account number should be 7 characters long
        -> Print: "Valid 7 digit account number"
            Otherwise: "Invalid 7 digit account number"
    - If the account number begins with a “5” the account number should be 10 characters long
        -> Print: "Valid 5 digit account number"
            Otherwise: "Invalid 5 digit account number"
    — If the account number does not begin with a 2 or a 5
        -> Print "Invalid account number"
     */
    public static void main(String[] args) {

        String accountNumber = "5000000";

        if (accountNumber.startsWith("2")) {  //if(accountNumber.charAt(0) == "2")   this another way of doing it.
            if (accountNumber.length() == 7) {
                System.out.println("Valid 2 digit account number");
            } else {
                System.out.println("Not a valid 7 digit number");
            }

        } else if (accountNumber.startsWith("5")) {
            if (accountNumber.length() == 10) {
                System.out.println("Valid 10 digit account number");
            } else {
                System.out.println("Not a valid 10 digit number");
            }

        } else {
            System.out.println("Not a valid account number.");
        }


        /*
            Index

            java is
            0123456


            charAt(int) -> gives a char
            indexOf(char) -> gives a int (index)


         */

        String s = "java";
        //          0123
        // charAt(4) -> exception
        //  System.out.println(s.charAt(s.length())); // StringIndexOfOutBoundsException
        System.out.println(s.charAt(s.length()-1)); // a


//        System.out.println(s.charAt(0));
//        System.out.println(s.charAt(1));
//        System.out.println(s.charAt(2));
//        System.out.println(s.charAt(3));

        System.out.println(s.charAt(0) + "" + s.charAt(3));

        String upper = "" + s.toUpperCase().charAt(0) + s.toUpperCase().charAt(3);
        // JAVA
        System.out.println(upper);


    }
}
