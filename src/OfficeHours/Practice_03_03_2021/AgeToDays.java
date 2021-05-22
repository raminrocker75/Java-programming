package OfficeHours.Practice_03_03_2021;

public class AgeToDays {
    public static void main(String[] args) {
        int age= 20;
        int ageInDays = 365;
        int howMany= (ageInDays*age);
        System.out.println(howMany + " days old");

        System.out.println();

        int age1 = 20;
        int ageInDays1= 365 * age1;
        System.out.println("You are " + age1 + " years old " +  // this plus sign is because we broke the passage to line below.
                "that means you are " + ageInDays1 + " days old");

    }
}
