package day05_primitives_concatanation;

public class CellPhone {
    public static void main(String[] args){
        String brand="**Iphone**";
        String model="12pro";
        String color="blue";
        double price=999.99;
        String storage="128Gb";
        boolean iscamera= true;
          System.out.println(brand);
          System.out.println(model);
          System.out.println(color);
          System.out.println(price);
          System.out.println(storage);
          System.out.println(iscamera);
//          WITH MESSAGE
        System.out.println("Brand is "+ brand);
        System.out.println("Model is " + model);
        System.out.println("Color is "+ color);
        System.out.println("Storage is "+ storage);
        System.out.println("Price is "+price);
        System.out.println("Has Camera - "+iscamera);
    }
}
