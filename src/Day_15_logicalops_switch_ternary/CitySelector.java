package Day_15_logicalops_switch_ternary;

public class CitySelector {
    public static void main(String[] args) {
        String city = "Tampa";
        // San Diego or LA
        if (city.equals("San diego ") || city.equals("LA")) {
            System.out.println("Willing to relocate to  " + city);
        } else {
            System.out.println("Not considering - " + city);
        }

        String teacher = "Saim";
//        Saim , Murodil -> it is a java class with Saim
//        otherwise -> Soft skill class with Nadir
        if (teacher.equals("Saim") || teacher.equals("Murodil")) {
            System.out.println("it is a java class with " + teacher);
        } else {
            System.out.println("Soft skill class with " + teacher);
        }

//        1- teacher is saim or murodil -> it is java class
//        2- teacher is nadir -> softSkill class with nadir
//        any other teacher -> Some class with Gurhan/Akbar
            teacher = "Murodil";
        if (teacher.equals("Saim") || teacher.equals("Murodil")) {
            System.out.println("it is a java class with" + teacher);
        } else if (teacher.equals("nadir")) {
            System.out.println("Soft skill class with" + teacher);
        } else {
            System.out.println("Some class with " + teacher);
        }


        String company = "google";
        double salary = 100_000;
        if (company.equals("google") || salary>= 100_000){
            System.out.println("Accept offer " + company);
        }else{
            System.out.println("Rejecting offer from " + company);
        }



    }
}
