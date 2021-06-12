package Day_51_inheritance.super_keyword;

public class LyftRides {
    public static void main(String[] args) {
        Lyft lyft = new Lyft();
        System.out.println("lyft.calculateRates(3) = " + Math.round(lyft.calculateRates(5)));
        LyftXL lyftXL = new LyftXL();
        System.out.println("lyftXL.calculateRates(5) = " + Math.round(lyftXL.calculateRates(5)));
        LyftLux lyftLux = new LyftLux();
        System.out.println("lyftLux.calculateRates(2) = " + Math.round(lyftLux.calculateRates(2)));

    }
}
