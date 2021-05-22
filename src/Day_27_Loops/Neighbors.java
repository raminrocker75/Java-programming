package Day_27_Loops;

public class Neighbors {
    public static void main(String[] args) {

        String word = "jaava spoonn";

        for(int index = 0; index < word.length()-1 ; index++){
            System.out.print(word.charAt(index)); //charAt gives us the character
            System.out.println(word.charAt(index+1));
            if(word.charAt(index) == word.charAt(index+1)){
                System.out.println("beep - " + word.charAt(index));  // we are saying index in parenthesis cause index
                // has the word in it
            }

        }




    }
}
