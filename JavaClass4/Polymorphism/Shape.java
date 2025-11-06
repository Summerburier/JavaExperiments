package Polymorphism;

public class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public void area() {
        System.out.println("面积不可计算");
    }

    public String getName() {
        return name;
    }
}