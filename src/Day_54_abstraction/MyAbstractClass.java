package Day_54_abstraction;

public abstract class MyAbstractClass {
    int num = 55;

    public void learn() {
        System.out.println("Learning...");
    }

    public abstract void close();

}

class Sub extends MyAbstractClass {
   public void close(){
       System.out.println("Close - abstract method implementation");
   }

}


class MyObject {
    public static void main(String[] args) {
//      MyAbstractClass myAbstractClass = new MyAbstractClass(); Abstract classes are meant to be extended by sub classes
        // we cannot create objects from abstract classes we can extend them into a sub class and create an object from that
        // sub class

        Sub sub = new Sub();
        System.out.println("sub.num = " + sub.num);
        sub.learn();
        sub.close();


    }
}
