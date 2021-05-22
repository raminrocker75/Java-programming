package day_09_scanner_practice;

public class SpeedCheck_v1 {
    public static void main(String[] args) {
        int speedLimit = 55;
        int currentSpeed = 70;
        int overTheLimit = currentSpeed - speedLimit;
        System.out.println("You are driving " + overTheLimit + " mph over the speed limit. Slow down!");

    }
}
