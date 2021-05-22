package Day_16_switch_ternary;

public class FloorSelector {
    public static void main(String[] args) {
        int floorNum = 1;
        if (floorNum == 1) {
            System.out.println("Floor 1 selected. Companies: Lobby, Verizon , Starbucks");
        } else if (floorNum == 2) {
            System.out.println("Floor 2 selected. Companies: Cybertek , NASA , Intelsat");
        } else if (floorNum == 3) {
            System.out.println("Floor 3 selected. Companies: Lyft , Bofa , SteakHouse");
        } else {
            System.out.println("Invalid floor" + floorNum);
        }

        System.out.println("=================SWITCH STATEMENT VERSION================");

        floorNum = 2;
        switch (floorNum) {
            case 1:
                System.out.println("Floor 1 selected. Companies: Lobby, Verizon , Starbucks");
                break;
            case 2:
                System.out.println("Floor 2 selected. Companies: Cybertek , NASA , Intelsat");
                break; // exit the switch statement
            case 3:
                System.out.println("Floor 3 selected. Companies: Lyft , Bofa , SteakHouse");
                break;

            default:
                System.out.println("invalid floor " + floorNum);
                break; // optional you can use or not for default.

        }


        }
    }
