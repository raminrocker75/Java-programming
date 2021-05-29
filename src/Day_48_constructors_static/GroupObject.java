package Day_48_constructors_static;

import java.util.ArrayList;
import java.util.Arrays;

public class GroupObject {
    public static void main(String[] args) {
        // dependency injection. Group object creation depends on String name
        Group group1 = new Group("CyberBugs");
        // print size of numbers
        System.out.println(group1.getMembers().size());
        group1.addMember("Berk");
        group1.addMember("Pavel");
        group1.addMember("Elvin");
        group1.addMember("Daud");
        group1.addMember("Parvin");
        group1.addMember("Rasim");
        group1.addMember("Ali");
        group1.addMember("Maria");
        System.out.println(group1.getMembers().size());
        System.out.println(group1.toString());

        Group group2 = new Group("CyberCats");
        group2.setMembers(new ArrayList<>(Arrays.asList("Stephan" , "Wakshum" ,"Akrem" , "Bulent" , "Andrea" , "Andrei")));

        //print all member. not toString();
        for (String eachj :
                group2.getMembers()) {
            System.out.println(eachj);
        }

        System.out.println("group2 members = " + group2.getMembers());
        //use if statement to check if Akrem is in group2
        if (group2.getMembers().contains("Akrem")) {
            System.out.println("Akrem is a member of group2");
        } else {
            System.out.println("Akrem is not in group2");
        }

        


    }
}
