public class Rectangle implements Shape,Knowledge {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }
    @Override
    public String areaFormula() {
        return "Area = length * width";
    }

    @Override
    public String perimeterFormula() {
        return "Perimeter = 2 * (length + width)";
    }
    
}
