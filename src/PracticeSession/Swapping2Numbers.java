package PracticeSession;

public class Swapping2Numbers {
    public static void main(String[] args) {
        int num1 =2;
        int num2 = 3;
        int swap = num1=num2;
        System.out.println(swap);

        int sum =0;
        sum += num1;
        sum +=num2;
        System.out.println(sum);
//==============================================================================================
        if(num1==num1){
            num2=num1;
            System.out.println(num2);
        }
        num1=2;
        System.out.println(num1);

//================================================================================================
        float first = 12.0f, second = 24.5f;

        System.out.println("--Before swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);

        first = first - second;
        second = first + second;
        first = second - first;

        System.out.println("--After swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);


//       same as the code above only with different variable names for ease of talking on  flipgrid
        int a = 10;
        int b = 20;
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println(a);
        System.out.println(b);


    }
}
