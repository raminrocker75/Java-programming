package Day_15_logicalops_switch_ternary;

public class AndOperatorPractice {
    public static void main(String[] args) {
        boolean onSale = true;
        boolean freeShipping = true;
        String itemName = "baklava";
        if (onSale && freeShipping) {
            System.out.println("Add " + itemName + " to cart");
        } else {
            System.out.println("Continue shopping for good deal on - " + itemName);
        }

        if (onSale&&freeShipping && itemName.equals("baklava")){
            System.out.println("add to cart " + itemName);
        }else {
            System.out.println("Continue shopping for good deal on - " + itemName);
        }

        String location = "Cali";
        int salary = 130000;
        boolean isRemote = true;
        boolean benefits = false;
        if(location.equals("Cali") && salary >= 130000 && isRemote && benefits) {
            System.out.println("i'll accept the job offer");
        }else {
            System.out.println("i'll think about it and give you a call");
        }


    }
}
