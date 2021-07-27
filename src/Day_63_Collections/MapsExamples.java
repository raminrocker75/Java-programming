package Day_63_Collections;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class MapsExamples {
    public static void main(String[] args) {
        //id , names
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "James");
        map.put(2, "Anna");
        map.put(2, "Daria");
        map.put(100, "Maxim");
        map.put(101, "Maxim");
        System.out.println(map); // printing the whole map
        System.out.println(map.get(100)); // it's gonna get me that value
        System.out.println(map.get(50)); // null

        map.remove(1);
        System.out.println(map);
        map.put(1, "Kinga");
        System.out.println(map);
        map.remove("Maxim");

        System.out.println(map.containsKey(1));
        System.out.println(map.containsValue("Anna"));

        for (Integer each : map.keySet()) {
            System.out.println(each + " - " + map.get(each));

            if (map.get(each).equals("Daria")) {
                System.out.println("This is our key" + each);
            }
        }


    }
}
