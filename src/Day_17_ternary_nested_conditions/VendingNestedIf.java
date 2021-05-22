package Day_17_ternary_nested_conditions;

public class VendingNestedIf {
    public static void main(String[] args) {

        String selection = "snack";
        String drinkItem = "coke";
        String snackItem = "chips";

        if(selection.equals("Drink")) {
            System.out.println("Drink option is selected");
            if(drinkItem.equals("tea")){
                System.out.println("Tea is item selected");
            }else {
                System.out.println("coke item is selected");
            }
        }else if (selection.equals("snack")) {
            System.out.println("snack option is selected");
            if (snackItem.equals("chips")) {
                System.out.println("chips option is selected");
            }else {
                System.out.println("Candy option is selected");
            }
        }


    }
}

