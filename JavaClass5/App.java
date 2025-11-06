import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("-------mission1-------");
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Area: " + rectangle.area());
        System.out.println("Perimeter: " + rectangle.perimeter());
        System.out.println("Area Formula: " + rectangle.areaFormula());
        System.out.println("Perimeter Formula: " + rectangle.perimeterFormula());

        Square square = new Square(5);
        System.out.println("Area: " + square.area());
        System.out.println("Perimeter: " + square.perimeter());
        System.out.println("Area Formula: " + square.areaFormula());
        System.out.println("Perimeter Formula: " + square.perimeterFormula());

        Triangle triangle = new Triangle(9, 10, 15);
        System.out.println("Area: " + triangle.area());
        System.out.println("Perimeter: " + triangle.perimeter());
        System.out.println("Area Formula: " + triangle.areaFormula());
        System.out.println("Perimeter Formula: " + triangle.perimeterFormula());

        EquilateralTriangle equilateralTriangle = new EquilateralTriangle(5);
        System.out.println("Area: " + equilateralTriangle.area());
        System.out.println("Perimeter: " + equilateralTriangle.perimeter());
        System.out.println("Area Formula: " + equilateralTriangle.areaFormula());
        System.out.println("Perimeter Formula: " + equilateralTriangle.perimeterFormula());

        System.out.println("-------mission2-------");
        double xs[] = {1, 9, 3, 5, 6};
        double ys[] = {10, 11, 4, 7, 13};
        Rectangle rects[] = new Rectangle[5];
        for (int i = 0; i < rects.length; i++) {
            rects[i] = new Rectangle(xs[i], ys[i]);
        }
        SortRectangle.sortByArea(rects);
        for (int i = 0; i < rects.length; i++) {
            System.out.println(rects[i].area()+" ");
        }
        System.out.println("-------mission3-------");
        int col;
        int row;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter col: ");
        col = sc.nextInt();
        System.out.println("Enter row: ");
        row = sc.nextInt();
        System.out.println("col: "+col+" row: "+row);
        MyMatrix matrix = new MyMatrix(col, row);
        matrix.printMatrix();
        System.out.println("Max number in Matrix is"+matrix.maxNum());
        sc.close();

    }
}