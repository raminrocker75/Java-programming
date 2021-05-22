package Day_19_class_vs_object_strings;

public class StringStartsEndsWith {
    public static void main(String[] args) {
        String word = "intellij idea";

        System.out.println(word.startsWith("i"));
        System.out.println(word.startsWith("in"));
        System.out.println(word.startsWith("intellij idea"));
        System.out.println();
        System.out.println("java".startsWith("j"));
        System.out.println();
        System.out.println(word.startsWith("Int")); // false - case sensitive
        System.out.println();
        System.out.println(word.endsWith("idea")); // true cause it ends with idea
        System.out.println(word.endsWith("a"));

        System.out.println();
        /**
         * Mr. -> man
         * Dr. -> Doctor
         * Mrs.-> Married woman
         * Ms. -> Single woman
         * Sr. -> Senior
         */

        String firstName = "Dr.Nadir";

        if(firstName.startsWith("Mr")){
            System.out.println("Man");
        }else if (firstName.startsWith("Dr")){
            System.out.println("Doctor");
        }else if(firstName.startsWith("Mrs")){
            System.out.println("Married woman");
        }else if (firstName.startsWith("Ms")){
            System.out.println("Single Woman");
        }else if(firstName.startsWith("Sr")){
            System.out.println("Senior");
        }else {
            System.out.println("Normal name " + firstName);
        }

        System.out.println();

        /**
         * String url = "https://www.cybertek.com
         * .com -> "Commercial website
         * .ru -> "russian website"
         * .gov -> "Government website
         * .edu -> "Education website"
         * .org -> "organisation"
         */

        String url = "https://www.cybertek.com";
        if(url.endsWith(".com")){
            System.out.println("Commercial website");
        }else if(url.endsWith(".ru")){
            System.out.println("russian website");
        }else if(url.endsWith(".gov")){
            System.out.println("Government Website");
        }else if(url.endsWith(".edu")){
            System.out.println("Education website");
        }else if(url.endsWith(".org")){
            System.out.println("Organisation website");
        }else {
            System.out.println("not valid website");
        }

    }
}
