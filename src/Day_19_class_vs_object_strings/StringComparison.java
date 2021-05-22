package Day_19_class_vs_object_strings;

public class StringComparison {
    public static void main(String[] args) {
        String city = "Saint Louis";
//        Equals()method- CASE SENSITIVE COMPARISON.
        System.out.println(city.equals("Saint Louis"));
        System.out.println(city.equals("saint louis"));
        System.out.println(city.equals("Saint louis"));
        System.out.println(city.equals("saintlouis"));

//        EQUALINGONORCASE() METHOD - CASE INSENSITIVE COMPARISON
        System.out.println(city.equalsIgnoreCase("SAint louis"));
        System.out.println(city.equalsIgnoreCase("saint louis"));
        System.out.println(city.equalsIgnoreCase("Saint Louis"));
        System.out.println(city.equalsIgnoreCase("SAInt LoUiS"));


        if(city.equals("Saint louis")){       // case sensitive**
            System.out.println("equals() true");
        }else {
            System.out.println("equals() false");
        }
        if(city.equalsIgnoreCase("saint lOuis")){
            System.out.println("equals() true");
        }else {
            System.out.println("equals() false");
        }

    }
}
