package Day_53_inheritance.Tesla;

public class CarObjects {
    public static void main(String[] args) {
        ElectricCar ec1 = new ElectricCar("Tesla","Model Y",48190.0,2021,326);
        ec1.drive(50);
        System.out.println(ec1.toString());
        System.out.println(ec1.getMake());
        System.out.println(ec1.getModel());
        System.out.println(ec1.getYear());
        System.out.println(ec1.getPrice());
        System.out.println(ec1.getRange());

        if (ec1.getPrice() >10000){
            System.out.println(ec1.getMake() +" - "+ec1.getModel() + " is out of my budget");
        }else {
            System.out.println("Purchasing " + ec1.toString());
        }
        System.out.println(ElectricCar.getCount());

        ElectricCar ec2 = new ElectricCar("Tesla" , "CyberTruck" , 59900,2022,300);
        System.out.println(ec2.toString());
        System.out.println("Count = " + ec2.getCount());//call the object method
        System.out.println("Count = " + ElectricCar.getCount());//call static method using classname

        Roadster roadster = new Roadster("Roadster",20000,2022,620);
        System.out.println(roadster.toString());
        roadster.drive(1000);
        roadster.drive(600);
        System.out.println(roadster.getCount()); // static method is inherited

        ModelX modelX = new ModelX("Tesla","Model X" , 89990.0,2021,360);
        System.out.println(modelX.toString());
        modelX.drive(10);
        System.out.println("Having lunch");
        modelX.drive(10);
        System.out.println("Range remaining = " + modelX.getRange());
        System.out.println("Total electric cars count = " + ElectricCar.getCount());
    }
}
