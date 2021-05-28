package Day_47_Constructors;

public class ReadAddress {
    public static void main(String[] args) {
        Address address = new Address();
        address.setStreet("12617 Sauterne drive");
        address.setCity("Saint Louis");
        address.setState("Mo");
        address.setZipcode("63146");

        System.out.println(address.toString());
    }
}
