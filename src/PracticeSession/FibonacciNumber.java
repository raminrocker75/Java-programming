package PracticeSession;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        fib(num);
    }

    public static void fib(int num){
        //WRITE YOUR CODE HERE
        int [] arr = new int [num +1];
        arr[1] = 1;
        for(int i = 0 ; i<=arr.length-3 ;i++){
            // System.out.println(arr[i+2] + arr[i] + " " + arr[i + 1]);
            arr[i+2] = arr[i] + arr[i+1];
            //System.out.println(arr[i+2] +" = " + arr[i] + " + " + arr[i + 1]);
        }
        System.out.println(arr[arr.length-1]);

    }
}
