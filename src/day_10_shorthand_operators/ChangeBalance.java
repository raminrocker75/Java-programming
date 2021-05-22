package day_10_shorthand_operators;

public class ChangeBalance {
    public static void main(String[] args) {
        double balance = 1230.55;
        System.out.println("balance = " + balance);

        double baklava = 22.50;
        System.out.println("baklava = " + baklava);
        balance = balance - baklava;
        System.out.println("baklava = " + balance);

        double kenafa = 44.45;
        System.out.println("kenafa = " + kenafa);
        balance = balance - kenafa;
        System.out.println("balance = " + balance);
//       second kenafa is 50% off
        kenafa = kenafa / 2;
        System.out.println("kenafa = " + kenafa);
//       buy it and decrease balanace with kenafe price
        balance = balance - kenafa;
        System.out.println("balance after second kenafa= " + balance);

        double plove = 7.99;
        System.out.println("plove = " + plove);
        balance = balance - plove;
        System.out.println("balance after plov = " + balance);

        double iceTea = 3.00;
        System.out.println("iceTea = " + iceTea);
        balance = balance - iceTea * 4;
        System.out.println("balance after 4 ice teas = " + balance);

//        return baklava.
        System.out.println("Returning baklava = " + baklava);
        balance = balance + baklava;
        System.out.println("balance after returning baklava is = " + balance);


    }
}
