package Day_25_loops;

public class WhileHungry {
    public static void main(String[] args) {
        boolean isHungry = true;
        int bananas = 0;
        int countFull = 3;
        while(isHungry){
            bananas++;                             // when we put increment above println()  it won't start counting from 0
            System.out.println("Eat banana: " + bananas );
            if(bananas == countFull){
              isHungry= false;

            }

        }
        System.out.println("lets get back to studying");


    }
}

