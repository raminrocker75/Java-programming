package Day_47_Constructors;

public class ReadAddress {
    public static void main(String[] args) {
        Address address = new Address();
        address.setStreet("12617 Sauterne drive");
        address.setCity("Saint Louis");
        address.setState("Mo");
        address.setZipcode("63146");

        System.out.println(address.toString());

        Address newAddress = new Address();
        newAddress.setStreet("7921 Jones branch dr Suite 200");
        newAddress.setCity("McLean");
        newAddress.setState("VA");
        newAddress.setZipcode("22102");
        System.out.println(newAddress.toString());

        Address papajon= new Address("12203 Dorsett Rd", "Maryland Heights", "MO", "63043");
        System.out.println(papajon);
    }
}
