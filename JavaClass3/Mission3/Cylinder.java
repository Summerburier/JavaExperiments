package Mission3;

public class Cylinder {
    private Circle circle;
    private double height;
    public Cylinder(){}
    public Cylinder(double radius, double height) {
        this.circle = new Circle(radius);
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public double getRadius() {
        return circle.getRadius();
    }
    public double getVol() {
        return circle.getArea() * height;
    }

}
