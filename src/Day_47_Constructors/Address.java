package Day_47_Constructors;

public class Address {
       private String street ;
       private String city ;
       private String state;
       private String zipcode ;
       private String country = "USA";

        // constructor - automatically called
        public Address(){
            System.out.println("Address constructor");
            street = "123 unknown st";
            city = "java St";
            state = "WS";
            zipcode= "0000";
        }

        // second constructor, overloaded constructor -> provides shortcut to initialize variables
    // in same statement: ex address ad = new Address ("12203 Dorsett Rd", "Maryland Heights", "MO", "63043");
        public Address(String street, String city , String state , String zipcode){
            this.street = street;
            this.state = state;
            this.city = city;
            this.zipcode = zipcode;
            setStreet(street);
        }

    @Override
    public String toString() {
        return street + ", " + city + ", " + state + ", " + zipcode + ", " + country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
            if (street.isEmpty() || street.length() > 50){
                System.out.println("Error: Invalid Street");
            }else {
                this.street = street;
            }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
