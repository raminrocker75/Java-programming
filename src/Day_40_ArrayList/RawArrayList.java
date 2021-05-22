package Day_40_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class RawArrayList {
    public static void main(String[] args) {
        ArrayList arr =new ArrayList<>();
        List list2 = new ArrayList(); //polly morphy

        arr.add("java");
        arr.add("apples");
        arr.add("coffee");
        arr.add(1234);
        arr.add(55.2);
        arr.add(true);
        arr.add("wooden spoon");
        System.out.println(arr);
        System.out.println("arr size = " + arr.size());
        // Raw ArrayList -> is arraylist that can store objects of any TYPE.
        // It is not recommended to use like this, unless in certain cases.

        ArrayList list = new ArrayList();
        list.add("hi");
        list.add(15);
        list.add(true);

        // as you can see - the above data list is RAW type and allows any type of data. it is not recommended.
        // Instead we need to ise Restricted Type that only allows certain type of data.

        //ex:
        ArrayList<Integer> nums = new ArrayList<>(); // Restricted
        ArrayList num = new ArrayList(); // not recommended
    }
}
