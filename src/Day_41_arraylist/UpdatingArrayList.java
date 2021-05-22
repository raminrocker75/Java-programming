package Day_41_arraylist;

import java.util.ArrayList;

public class UpdatingArrayList {
    public static void main(String[] args) {
        // cars list
        ArrayList<String> myCars = new ArrayList<>();
        myCars.add("toyota");
        myCars.add("mazda");
        myCars.add("ford");
        myCars.add("moskvich");
        myCars.add("tesla");
        myCars.add(0,"jeep");
        myCars.add(1,"lada");
        myCars.add(2,"yougo");

        //jeep , lada , yougo , Toyota , mazda , ford , moskovich , tesla
        System.out.println(myCars);
        System.out.println(myCars.toString());

        String allCarsIn1St = myCars.toString();
        System.out.println("allCarsIn1St = " + allCarsIn1St);

        //change index 0 to lamborghini
        myCars.set(0, "lamborghini");
        System.out.println("After set = " + myCars.toString());

        // change 4 to honda
        myCars.set(4 , "Honda");
        System.out.println("After set honda = " + myCars); // mazda is change to honda cause mazda was at index 4

        /**
         * How would you do that if my cars was array
         * myCars[4] = "Honda;
         */

        //find the index number of for
        /**
         * String str = "java;
         * str.indexOf("v") ==>2
         */

        // find the index number of "ford"
        System.out.println("index of ford = " + myCars.indexOf("ford"));
        int moskvich = myCars.indexOf("moskvich");
        System.out.println("index of moskvich = " + moskvich);

        // change moskvich to jiguli
        myCars.set(moskvich , "jiguli");
        System.out.println("after set to jiguli = " + myCars);

        myCars.set(myCars.indexOf("ford") , "trabant");
        System.out.println("After setting for to trabant = " +myCars);

        // change lada to bugatti
        if(myCars.contains("lada")){
            myCars.set(myCars.indexOf("lada"),"bugatti");
            System.out.println("new list with bugatti = " + myCars);
        }else {
            System.out.println("lada is not found");
        }

        /**
         * lamorghini -> prius
         * lada -> lexus
         * trabant -> audi
         */

        for (int i = 0; i <myCars.size(); i++) {
            if(myCars.get(i).equals("lamborghini")){
                myCars.set(i,"prius");

            }else if(myCars.get(i).equals("lada")){
                myCars.set(i,"prius");



            }else if(myCars.get(i).equals("trabant")){

                myCars.set(i,"audi");

            }
        }

        System.out.println("after loop = " + myCars);
    }
}
