package Day_62_Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer>nums = new ArrayList<>();
        List<String>cities = new ArrayList<>();
        Collection<String>schools = new ArrayList<>();

        cities.add("Saint Louis");
        cities.add("Vienna");
        cities.add("NewYork");
        cities.add("NewYork");

        System.out.println(cities);

        System.out.println("First city" + cities.get(0));
        System.out.println("Count of cities " + cities.size());

    }
}
