package Day_30_Arrays;

public class ForEachLoopArray {
    public static void main(String[] args) {
        int[] data = {80, 200, 900, 12, 5456, 235, 75654, 4454, 258, 3753, 753, 159, 456987123,};

        for (int each : data) {
            System.out.print(each + "\s");
        }
        System.out.println("\n");
        for (int n : data) {
            System.out.println(n);
        }

        System.out.println();

        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }

        System.out.println("\n=========lastValue========");
        System.out.println("last value= " + data[data.length - 7]);

        System.out.println("=========reverse==========");

        for (int idx = data.length -1 ; idx >= 0 ; idx--){
            System.out.println(data[idx]);
        }


    }
}
