package Day_30_Arrays;

public class ArrayLoopWithConditions {
    public static void main(String[] args) {
        double[] prices = {22.9, 12.4, 43.12, 65.0, 100.4, 543.23, 98.32, 533.43, 34.23, 124.9, 234.23};
        String[] countries = {"Brazil", "China", "Cuba", "Sweden", "France", "Vietnam", "Albania", "Brazil", "Portugal", "China", "Philippines", "Philippines", "China", "Philippines", "China", "Armenia", "Philippines", "China", "Colombia", "Philippines", "Honduras", "Indonesia", "Brazil", "China", "United States", "Russia"};

        System.out.println("========Prices more than 100====");
       for (double eachPrice : prices){
           if(eachPrice>=100){
               System.out.print("Price = " +eachPrice + "\s ");
           }
       }


        System.out.println("\n------ price between 10 and 70-------");
       for (double n : prices){
           if(n>10 && n<70){
               System.out.print("price = " + n + "\s ");
           }
       }

        System.out.println("\n=====count of the prices more than 50========");

       int count = 1;
       for (double d : prices){
           if (d>50){
               System.out.print ("count= " + count++ + " ");
           }
       }

        System.out.println("\n========= countries with name length more than7 - inclusive =========");
       for (String eachCountry : countries){
           if(eachCountry.length()>=7){
               System.out.println("Country name= " +eachCountry);
           }
       }



    }
}
