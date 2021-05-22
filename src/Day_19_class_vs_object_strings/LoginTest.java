package Day_19_class_vs_object_strings;

import java.time.Instant;

public class LoginTest {
    public static void main(String[] args) {
        String expUserName = "cybertek";
        String expPassword = "Abc123";

        String username = "Cybertek";
        String password = "Abc123";

        if (expUserName.equalsIgnoreCase(username) && expPassword.equals(password)){
            System.out.println("pass - user Logged in successfully " + Instant.now());   // Instant.now shows the current time on computer.

        }else {
            if (!expUserName.equalsIgnoreCase(username)) {
                System.out.println("Fail - username is incorrect");
            }else {
                System.out.println("Fail - password is incorrect");
            }
        }
    }
}
