package Day_18_conditions_practice_strings_intro;

public class CarLeasingTest {
    public static void main(String[] args) {
        String make = "Audi";
        String model = "S4";
        double leasePrice = 0.0;

//        if(make.equals("Mercedes") && model.equals("E")){
//            leasePrice = 500.0;
//
//        }else if(make.equals("Mercedes") && make.equals("A")){
//            leasePrice = 400.0;
//        }


        if(make.equals("Mercedes")){
            if(model.equals("E")){
                leasePrice = 500.0;
            }else if (model.equals("A")){
                leasePrice = 400.0;
            }
        }

        if(make.equals("Audi")){
            if(model.equals("TTRS")){
                leasePrice = 500.0;
            }else if (model.equals("S4")){
                leasePrice = 400.0;
            }
        }
        System.out.println("make = " + make);
        System.out.println("model = " + model);
        System.out.println("leasePrice = " + leasePrice);



    }
}
