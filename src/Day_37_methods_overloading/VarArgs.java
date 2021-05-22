
package Day_37_methods_overloading;

public class VarArgs {
    public static void main(String[] args) {
        addNumber(10,5);
        addNumber(100,200,300);
        addNumber(23,52,84,95,46,2,56,48,78,546,8453);
        addNumber();
    }
    public static void addNumber(int... nums) {
        int sum = 0;
        for (int n : nums) {
            sum +=n;
        }
        System.out.println("sum = " + sum);
    }

}



