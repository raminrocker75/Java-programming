package Day_20_string_manipulation;

public class StringContains {
    public static void main(String[] args) {
        String company = "Capital one";
        System.out.println(company.contains("i")); //true
        System.out.println(company.contains("ital")); // true
        System.out.println(company.contains("l o")); //true
        System.out.println(company.contains("j")); // false
        if(company.contains(" ")){
            System.out.println("multiple word company name");
        }else {
            System.out.println("single word company name");
        }

        String etsyTitle = "Wooden spoon | Etsy";
        if(etsyTitle.contains("|")){
            System.out.println("pass - Title check passed");
        }else {
            System.out.println("Fail - Title check failed");
        }

        String firstname = "ahmed";
        if(firstname.contains("a") && firstname.contains("e")){
            System.out.println("first name multiple words");
        }else {
            System.out.println("wrong name");
        }


        firstname = "Nadir";
        if(firstname.contains("a")||firstname.contains("i")){
            System.out.println("Nadir");
        }else {
            System.out.println("Wrong Name");
        }

        String email = "Raminrocker75@Gmail.com";
        if(email.contains("@") && email.endsWith(".com") && email.equalsIgnoreCase(email)){
            System.out.println(email);
        }else {
            System.out.println("invalid email address");
        }


    }
}
