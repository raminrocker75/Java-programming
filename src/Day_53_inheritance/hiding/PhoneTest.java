package Day_53_inheritance.hiding;

public class PhoneTest {
    public static void main(String[] args) {
        Phone phone = new Phone();
        Mobile mobile= new Mobile();

        Phone.use();
        phone.call();
        mobile.text();
        mobile.call();
    }
}
