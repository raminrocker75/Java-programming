package OfficeHours.Practice_06_08_2021;

public class Square extends Shape {
    double side;

    @Override
    public void calculatedArea() {
        area = side*side;
    }

    @Override
    public void calculatePerimeter() {
        perimeter = side *4;
    }
}
