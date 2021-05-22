package Day_37_methods_overloading;

public class DaySelector {
    public static void main(String[] args) {
        System.out.println(getDayName(1));
        System.out.println(getDayName(5));
        for (int i = 0; i <= 8; i++) {
            System.out.println(getDayName(i) +" " +i);
        }

        System.out.println(getDayNameV2(5));
    }

    public static String getDayName(int day) {
        String result = "";
        switch (day) {
            case 1:
                result = "Monday";
               break;
            case 2:
                result = "Tuesday";
                break;
            case 3:
                result = "Wednesday";
                break;
            case 4:
                result = "Thursday";
                break;
            case 5:
                result = "Friday";
                break;
            case 6:
                result = "Saturday";
                break;
            case 7:
                result = "Sunday";
                break;
            default:
                result = "Invalid day";


        }
        return result;
    }

    public static String getDayNameV2(int day){
        String dayName;
        switch (day){
            case 1: dayName = "Monday";
            break;
            case 2:dayName  = "Tuesday";
            break;
            case 3: dayName = "Wednesday";
            break;
            case 4: dayName = "Thursday";
            break;
            case 5: dayName = "Friday";
            break;
            case 6: dayName = "Saturday";
            break;
            case 7: dayName = "Sunday";
            break;
            default:
                System.out.println("Invalid day - " + day);
                dayName = null;
        }
        return dayName;
    }



}
