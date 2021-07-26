package Day_58_Polymorphism;

public class SuperManTest {
    public static void main(String[] args) {
        Father spMan1 = new Superman();
        spMan1.playWithKid();
        spMan1.feedKid();
        spMan1.raiseKid();
        Worker spMan2 = new Superman();
        spMan2.work("Sdet");
        System.out.println("got paid" + spMan2.getPaid());

        Superman superman3 = new Superman();
        superman3.getPaid();
        superman3.work("ScrumMaster");
        superman3.feedKid();
        superman3.playWithKid();
        superman3.raiseKid();




    }
}
