import Polymorphism.*;
import Statistic.*;

public class App {
    public static void main(String[] args) {
        System.out.println("=== 统计工具类演示 ===");
        int a = 10, b = 20, c = 30;
        int[] numbers = {5, 15, 25, 35, 45};
        
        System.out.println("两个数 " + a + " 和 " + b + " 的统计:");
        System.out.println("最大值: " + StatisticUtils.max(a, b));
        System.out.println("求和: " + StatisticUtils.sum(a, b));
        System.out.println("平均值: " + String.format("%.2f", StatisticUtils.mean(a, b)));
        System.out.println();
        
        System.out.println("三个数 " + a + ", " + b + " 和 " + c + " 的统计:");
        System.out.println("最大值: " + StatisticUtils.max(a, b, c));
        System.out.println("求和: " + StatisticUtils.sum(a, b, c));
        System.out.println("平均值: " + String.format("%.2f", StatisticUtils.mean(a, b, c)));
        System.out.println();
        
        System.out.print("数组 ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) System.out.print(", ");
        }
        System.out.println(" 的统计:");
        System.out.println("最大值: " + StatisticUtils.max(numbers));
        System.out.println("求和: " + StatisticUtils.sum(numbers));
        System.out.println("平均值: " + String.format("%.2f", StatisticUtils.mean(numbers)));
        System.out.println();
        
        System.out.println("=== 多态性演示 ===");
        Shape circle = new Circle("圆形", 5.0);
        Shape rectangle = new Rectangle("矩形", 4.0, 6.0);
        Shape triangle = new Triangle("三角形", 3.0, 4.0);
        
        Shape[] shapes = {circle, rectangle, triangle};
        
        System.out.println("计算各个图形的面积：");
        for (Shape shape : shapes) {
            shape.area();
        }
    }
}