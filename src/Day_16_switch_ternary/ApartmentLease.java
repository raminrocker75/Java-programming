package Day_16_switch_ternary;

public class ApartmentLease {
    public static void main(String[] args) {
        int numberOfBedrooms = 2;
        double startingPrice = 0;

        switch (numberOfBedrooms){
            case 0:
                startingPrice = 1454;
                System.out.println("Studio apartments selected. Starting price: $" + startingPrice);
                break;
            case 1:
                startingPrice = 1725;
                System.out.println("One bedroom apartments selected. Starting price: $" + startingPrice);
                break;
            case 2:
                startingPrice = 2899;
                System.out.println("Two bedroom apartments selected. Starting price: $" + startingPrice);
                break;

            default:
                System.out.println(numberOfBedrooms + " bedrooms currently unavailable");
        }
    }
}
