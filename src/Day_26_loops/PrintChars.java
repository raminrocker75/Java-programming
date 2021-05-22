package Day_26_loops;


public class PrintChars{
    public static void main(String[] args) {

        String word = "Break Till 9:18 PM EST";
        for (int i = 0 ; i<word.length() ; i++){
            System.out.print(word.charAt(i));
        }
        System.out.println();

        for(int i = word.length()-1 ; i>=0 ; i--){
            System.out.print(word.charAt(i));
        }



        /**
         * word.length is a number of how many letter we have.
         * like "java" has 4 letters and 0-3 index is the index of each letter.
         */



    }
}
