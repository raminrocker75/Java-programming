package Day_18_conditions_practice_strings_intro;

public class SwitchSeasonFinder {
    public static void main(String[] args) {
        int month=6;

        if(month==1 || month == 2 || month == 12) {
            System.out.println(month + " Winter");
        }

        switch (month){
            case 12:
                System.out.println("winter");
                break;
            case 1:
                System.out.println("Winter");
                break;
            case 2:
                System.out.println("Winter");
                break;
        }
        switch (month){
            case 12: case 2: case 1:
                System.out.println("Winter");
                break;

            case 3: case 4: case 5:
                System.out.println("Spring");
                break;

            case 6 : case 7: case 8:
                System.out.println("Summer");
                break;

            case 9: case 10: case 11:
                System.out.println("Fall");
                break;

                default:
                System.out.println("Invalid month");
        }
    }
}
