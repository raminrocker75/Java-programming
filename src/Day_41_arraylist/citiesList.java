package Day_41_arraylist;


import OfficeHours.Practice_03_08_2021.Casting;

import java.util.ArrayList;
import java.util.Arrays;

public class citiesList {
    public static void main(String[] args) {
        //declare arraylist.alt/option + enter
        ArrayList<String> cities = new ArrayList<>();
        // add cities to arraylist -> add methods
        cities.add("Washington DC"); // 0
        cities.add("Saint Louis"); // 1
        cities.add("Vienna"); // 2
        cities.add("San Diego"); // 3
        cities.add("LA"); // 4
        // add Ashgabat to 0 index.
        cities.add(0,"Ashgabat");
        //print all values in the same line
        System.out.println(cities);
        // print first and last cities
        System.out.println("first city = " + cities.get(0));
        System.out.println("last city = " +cities.get(5));
        // find the last index using size()-1
        System.out.println("last city = " + cities.get(cities.size()-1));
        // print count of items in arraylist
        System.out.println("count of items = " + cities.size());

        int size = cities.size();
        System.out.println("there are " + size + " cities in the list");
        System.out.println();
        for (int i = 0; i < cities.size(); i++) {
            System.out.print(cities.get(i) + " ");
        }
        System.out.println();
        System.out.println();

        for (String each : cities) {
            System.out.print(each + " ");
        }

        // delete item from the arraylist
        // delete using index
        System.out.println();

        cities.remove(3);
        // delete using object/value
        cities.remove("Ashgabat");

        System.out.println("after removing = " + cities);

        // delete/ remove all values from list
        cities.clear();
        System.out.println(cities);

        // using isEmpty
        if(cities.isEmpty()){
            System.out.println("List is empty");
        }

        // check size() == 0
        if(cities.size()==0){
            System.out.println("List is empty");
        }
    }
}
