public class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }
    @Override
    public double area() {
        return super.area(); 
    }
    @Override
    public double perimeter() {
        return super.perimeter();
    }
    @Override
    public String areaFormula() {
        return "Area = side^2";

    }
    @Override
    public String perimeterFormula() {
        return "Perimeter = 4 * side";
    }
}
