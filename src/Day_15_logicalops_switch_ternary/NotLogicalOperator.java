package Day_15_logicalops_switch_ternary;

public class NotLogicalOperator {
    public static void main(String[] args) {
//        not (!) table
        System.out.println("!true = " + (!true));
        System.out.println("!false = " + (!false));

        int age = 20;
        if( !(age > 7)) {
            System.out.println("needs to sit in the car sit, age = " + age);
        }else {
            System.out.println("Can sit in passenger sit. age = " + age);
        }

        boolean isSmokingAllowed = false; // when put ! it reverses the result so like if false gets ! will be true and the first statement will print out.
        if (!isSmokingAllowed){
            System.out.println("Smoking is not allowed here. Exit." );
        }else {
            System.out.println("Smoking is allowed");
        }

        boolean isAffordable = true;
        if(!isAffordable){
            System.out.println("Item is not affordable");
        }

        String env= "qa";
        if(!env.equals("qa")){
            System.out.println("In wrong environment for QA testing");
        }

        String carModel = "Tesla";
        if (!carModel.equals("Tesla")){
            System.out.println("Not interested");
        }

        String secretPassword = "abc123";
        String inputPassword = "abc321";
        if(!inputPassword.equals("abc123")){
            System.out.println("Incorrect password");
        }

        if(!inputPassword.equals(secretPassword)){
            System.out.println("incorrect password");
        }
        if (inputPassword.equals("abc123")) {
            System.out.println("correct password");
        }else {
            System.out.println("incorrect password");
        }









    }

}
