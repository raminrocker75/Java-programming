package PracticeSession;
import java.util.*;
public class SwitchElement {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        int [] arr = {in.nextInt(),in.nextInt(),in.nextInt(),in.nextInt()};
        Arrays.toString(do_switch(arr));
        System.out.println(Arrays.toString(arr));
    }


    public static int[] do_switch(int[] i){
        int reserve = i[0];
        i[0] = i[i.length-1];
        i[i.length-1] = reserve;
        return i;
    }
}