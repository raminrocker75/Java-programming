package Day_22_string_manipulation_while_loop;

public class FirstLoop {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        int apples = 0;
        while (apples <= 10) {
            System.out.println("apple -> " + apples);
            apples++;
        }
        System.out.println("apples= " + apples);

        //infinite loop
        while (true){
            System.out.println("hello world");
        }

    }
}
