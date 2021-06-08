package OfficeHours.Practice_06_07_2021;

import java.util.ArrayList;

public class WalmartTest {
    public static void main(String[] args) {
        WalmartStore walmartStore1 = new WalmartStore("VA");
        System.out.println(walmartStore1);
        Item pen = new Item("pen" , 1.4, 10);
        Item hat = new Item("hat",3.5,20);
        ArrayList<Item>allItems = new ArrayList<>();
        allItems.add(pen);
        allItems.add(hat);

        WalmartStore walmartStore2 = new WalmartStore("IL", allItems);
        System.out.println(walmartStore2);

    }

}
