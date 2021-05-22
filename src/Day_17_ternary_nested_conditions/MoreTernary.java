package Day_17_ternary_nested_conditions;

public class MoreTernary {
    public static void main(String[] args) {
        int hourlyRate = 50;
        String reply = (hourlyRate>45) ? "Accept" : "Reject";
        System.out.println("reply = " + reply);

        String todaySClass = "java";
        String teacher= (todaySClass.equals("java")) ? "Murodil" : "Nadir";
        System.out.println("teacher = " + teacher);



        boolean isEligibleToDrive = true;
        String driving = (isEligibleToDrive) ? "can drive" : "can not drive";
        System.out.println("driving = " + driving);

    }
}
