package OfficeHours.Practice_06_08_2021;

public class ShapeObjects {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.calculatedArea();

        Square square = new Square();
        square.side =5.5;
        square.calculatedArea();
        System.out.println(square.area);
    }
}
