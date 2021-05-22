package Day_15_logicalops_switch_ternary;

public class GradeEvaluator {
    public static void main(String[] args) {
        char grade = 'A';
        if (grade == 'A' || grade == 'B' || grade == 'C') {
            System.out.println("passed with Grade - " + grade);
        } else if (grade == 'D') {
            System.out.println("Quality for retake Grade - " + grade);
        } else if (grade == 'E') {
            System.out.println("fail. Grade - " + grade);
        } else {
            System.out.println("invalid grade - " + grade);
        }
    }
}
