package Day_51_inheritance.super_keyword;

public class LyftXL extends Lyft {

    @Override
    public double calculateRates(double miles) {
        return super.calculateRates(miles) * 1.1;
    }
}
