package Day_15_logicalops_switch_ternary;

public class ORLogicalOperator {
    public static void main(String[] args) {
        System.out.println("true || true = " +  (true || true));
        System.out.println("true || false = " + (true || false)); // this is just || table like what the results of each statement going to be like true or true is true etc.
        System.out.println("false || true = " +(false || true));
        System.out.println("false || fasle = " + (false || false));

        int apples = 5;
        int oranges = 7;
        System.out.println(apples >3 || oranges>4); // true

        if ( apples > 3 || oranges>4) {               // true
            System.out.println("no need to buy any fruits today"); // this prints out cause its true
        }else {
            System.out.println("need to get some fruit");
        }
                            // ture or false = true
        System.out.println(apples>2 || oranges>10);
                            // true and false = false
        System.out.println(apples>2 && oranges>10);

        if(apples>2 || oranges>10){
            System.out.println("looks like we are good with fruit");
        }else {
            System.out.println("need to but some fruit");
        }

        System.out.println(apples == 0 || oranges==0);

        if(apples == 0 || oranges == 0) {                      // apples and oranges they are both depended on the variables we have declared up top!
            System.out.println("We need to purchase some fruit");
        }else {
            System.out.println("We are good with fruit");
        }


    }
}
