package Day_28_loops;

public class BreaksVsContinue {
    public static void main(String[] args) {
        for (int n = 1; n <= 5; n++) {
            System.out.print(n);
            if(n==3){
             break;
            }
        }
        System.out.println();
        for(int i = 1 ; i<= 5; i++){
            if(i == 2 || i == 4 ){
                continue;
            }
            System.out.print(i);
        }


    }
}
