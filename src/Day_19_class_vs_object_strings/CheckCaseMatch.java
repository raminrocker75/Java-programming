package Day_19_class_vs_object_strings;

public class CheckCaseMatch {
    public static void main(String[] args) {
        String countryCode = "USA";

        if (countryCode.equals(countryCode.toUpperCase())){    // so this one is matching with the value in the String. have to make sure they are the exact match or it'll go to the else block!
            System.out.println("Pass - case is correct");
        }else {
            System.out.println("Fail- case is incorrect");
        }

        String word = "java";
        String uWord= word.toUpperCase();
        System.out.println(word);
        System.out.println(uWord);

        if(word.equals(uWord)){           // runs the else block cause it isn't matching with Word!
            System.out.println("case match");
        }else {
            System.out.println("case doesn't match");
        }



    }
}
