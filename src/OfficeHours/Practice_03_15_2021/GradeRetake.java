package OfficeHours.Practice_03_15_2021;

public class GradeRetake {
    public static void main(String[] args) {

        int baseGrade = 90;
        int numberOfAttempts = 1;
        int retakePenalty = 0;
        if(numberOfAttempts == 1){
            retakePenalty = (int)(baseGrade*.10);
        }
        if(numberOfAttempts == 2){
            retakePenalty = (int)(baseGrade*.20);
        }
        if(numberOfAttempts == 3){
            retakePenalty = (int)(baseGrade*.30);
        }

        System.out.println("Your grade after retake attempt " + numberOfAttempts + " was " + (baseGrade - retakePenalty));
    }
}
