package Day_27_Loops;

public class IndexOf {
    public static void main(String[] args) {

        String word = "github";
        char letter = 'h';
        int index = -1;

        for (int n = 0; n < word.length(); n++) {
            //System.out.println(n +" - " + word.charAt(n));

            if (word.charAt(n) == letter) {  //<= this means:  is word n matching letter?
                index = n;                   // this will give us the number of the character index.
                System.out.println(letter + " is found at index " + index);
                break;
            }
        }

        if (index == -1) {
            System.out.println(letter + " is not present");
        }else{
            System.out.println(letter + " is found at index " + index);
        }


    }
}
