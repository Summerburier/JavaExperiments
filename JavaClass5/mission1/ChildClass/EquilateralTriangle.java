public class EquilateralTriangle extends Triangle{
    public EquilateralTriangle(double side){
        super(side, side, side);
    }
    @Override
    public String areaFormula(){
        return "Area = (sqrt(3)/4) * side^2";
    }
    @Override
    public String perimeterFormula(){
        return "Perimeter = 3 * side";
    }
    @Override
    public double area(){
        return (Math.sqrt(3)/4) * Math.pow(getSide()[0], 2);
    }
    @Override
    public double perimeter(){
        return 3 * getSide()[0];
    }

}
