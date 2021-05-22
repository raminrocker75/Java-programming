package Day_35_methods_with_parameters;

import java.util.Locale;

public class Email {
    public static void main(String[] args) {
        buildEmail("RaminRocker75" , "Gmail");
        buildEmail("John Ward III", "verizon");
    }
    public static void buildEmail(String name , String domain){
        name = name.replace(" ", "_").toLowerCase();
        domain = domain.toLowerCase();
        String email = name + "@" + domain + ".com";
        System.out.println(email);
    }

}
