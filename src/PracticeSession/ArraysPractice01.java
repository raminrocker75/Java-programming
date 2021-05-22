package PracticeSession;
import  java.util.*;
public class ArraysPractice01 {
    public static void main(String[] args) {

//        int [] num={1,2,5,7,80,10};
//        Arrays.sort(num);
//        System.out.println(Arrays.toString(num));
//
//        String[] listOFNames = {"Asel" , "Teddy" , "Ramin"};
//        Arrays.sort(listOFNames);
//        System.out.println(Arrays.toString(listOFNames));


//                     0 1 2 = index
         int [] num = {1,2};
//                     1 2 3 =length

        System.out.println(num.length);

        if(num.length<2){
            System.out.println("["+num[0]+"]");
        }else{
            System.out.print("[" + num[0] +", "+ num[1] + "]");
        }

    }
}
