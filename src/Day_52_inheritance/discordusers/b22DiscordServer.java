package Day_52_inheritance.discordusers;

public class b22DiscordServer {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setId(1234);
        user1.setName("Ramin");
        user1.setRole("Student");

        Admin admin1 = new Admin();
        admin1.setId(4315);
        admin1.setName("Burak Kara");
        admin1.setRole("Admin");

        System.out.println(user1);
        System.out.println(admin1);
    }
}
