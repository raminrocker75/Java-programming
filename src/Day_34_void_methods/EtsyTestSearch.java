package Day_34_void_methods;

import java.sql.SQLOutput;

public class EtsyTestSearch {
    public static void main(String[] args) {
        System.out.println("--Starting Etsy Search Smoke Test--");
        openBrowser();
        navigateToEtsyUrl();
        searchForWoodenSpoon();
        v ();
        System.out.println("--Etsy Search Smoke test Completed - pass -");
    }

    public static void openBrowser(){
        System.out.println("Lunching Chrome browser");
    }
    public static void navigateToEtsyUrl(){
        System.out.println("Navigating to https://www.Etsy.com/");
    }
    public static void searchForWoodenSpoon(){
        System.out.println("Pass: verify Etsy home page is displayed");
        System.out.println("Type 'Wooden Spoon' in search field and click search");
    }

    public static void v (){
        System.out.println("Pass: Search results are successfully displayed");
    }
}
