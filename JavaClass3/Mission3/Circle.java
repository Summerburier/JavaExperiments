package Mission3;

public class Circle {
    private double radius;
    private static final double PI = 3.1415926;
    public Circle(){}
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return radius * radius * PI;
    }
    public double getCircumference() {
        return 2 * PI * radius;
    }

}
