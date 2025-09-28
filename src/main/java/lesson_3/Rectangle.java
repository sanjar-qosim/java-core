package lesson_3;

public class Rectangle {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateSquare() {
        return length * width;
    }

    public double calculatePerimeter() {
        return (length + width) * 2;
    }
}
