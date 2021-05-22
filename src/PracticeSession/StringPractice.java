package PracticeSession;

import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//
//        String name = "bananaa";
//        int index = name.indexOf("m");
//        System.out.println(index);
//
//        if(index==name.indexOf("m")){
//            System.out.println(name);
//        }
//
//
//        // .length()    (return int)
//        // .charAt()    (return int)
//        // .indexOF()   (you give the word to it like "m" and it'll give you the integer index number of that letter)
//        // .upperCase() (return String)
//        // .lowerCase() (return String)
//        // .subString() (return String using int numbers which we can get through .length()
//        // .replace(won't assign the new character it just prints it out until we decide to put =and assign it)
//
//        name="hello people";
//
//        if(name.length()% 2==1){
//            System.out.println("odd");
//            System.out.println(name.substring(name.length()/2 -1, name.length()/2+1));
//        }else{
//            System.out.println("even");
//            System.out.println(name.substring(name.length()/2, name.length()/2+1));
//        }
//


        String email = "Ramin_dadari@gamil.com";
        String last = email.substring(email.indexOf("_") + 1, email.indexOf("@")); // String last="Dadari"
        String first = email.substring(0, email.indexOf("_"));
        String domain = email.substring(email.indexOf("@"));

        /// TODO: work  on printing this later.


    }
}
