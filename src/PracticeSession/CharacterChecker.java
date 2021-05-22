package PracticeSession;

public class CharacterChecker {
    public static void main(String[] args) {
        char letter1 = 'b' , letter2 = 'G' , letter3 = 'O';

        if(letter1==98 ){
            System.out.println("lowerCase");
        }else if(letter1==66){
            System.out.println("upper case");
        }else{
            System.out.println("invalid letter");
        }
        if(letter2==71){
            System.out.println("upper case");
        }else if(letter2 == 103){
            System.out.println("lower case");
        }else{
            System.out.println("invalid number");
        }
        if(letter3==79){
            System.out.println("upper case");
        }else if(letter3 == 111){
            System.out.println("lowe case");
        }else{
            System.out.println("invalid");
        }

    }
}
