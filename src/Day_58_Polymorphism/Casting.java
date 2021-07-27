package Day_58_Polymorphism;

public class Casting {
    public static void main(String[] args) {
        //variable of worker and object of superMan
        Worker worker = new Superman();
        worker.work("QA Manager");
        worker.getPaid();

        ((Father) worker).raiseKid();
        ((Superman) worker).playWithKid();

        //DOWNCASTING FROM WORKER TO SUPERMAN
        Superman superMan = (Superman) worker;
        superMan.feedKid();
        superMan.work("java dev");
    }
}
