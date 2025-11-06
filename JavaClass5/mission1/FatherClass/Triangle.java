import java.lang.Math;
public class Triangle implements Shape, Knowledge{
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        if(side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1){
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }
        else{
            throw new IllegalArgumentException("Invalid Triangle");
        }
    }
    

    @Override
    public double area() {
        double s = (side1 + side2 + side3)/2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }
    @Override
    public String areaFormula() {
        return "Area = (s(s-a)(s-b)(s-c))^0.5";
    }

    @Override
    public String perimeterFormula() {
        return "Perimeter = a + b + c";
    }
    public double[] getSide() {
        double sides[] = {side1, side2, side3};
        return sides;
    }

}


