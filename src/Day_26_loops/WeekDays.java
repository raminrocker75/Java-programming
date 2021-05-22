package Day_26_loops;

public class WeekDays {
    public static void main(String[] args) {
        int day ;

        for ( day = 1 ; day<=10 ; day++){
            switch(day){
                case 1:
                    System.out.println("Monday - " + day);
                    break;
                case 2:
                    System.out.println("Tuesday - " + day);
                    break;
                case 3:
                    System.out.println("Wednesday - " + day);
                    break;
                case 4:
                    System.out.println("thursday - " + day);
                    break;
                case 5:
                    System.out.println("Friday - " + day);
                    break;
                case 6:
                    System.out.println("Saturday - " + day);
                    break;
                case 7:
                    System.out.println("Sunday - " + day);
                    break;
                default:
                    System.out.println("no such day, it is java day - " + day);
                    break;
            }
        }


    }
}
