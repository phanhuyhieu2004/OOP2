//package bai1;
//
//public class Circle {
//
//    private double radius;
//    private String color;
//
//    public Circle() {
//        radius = 1.0;
//        color = "red";
//    }
//
//    public Circle(double radius) {
//        this.radius = radius;
//        color = "red";
//    }
//
//    public Circle(double radius, String color) {
//        this.radius = radius;
//        this.color = color;
//    }
//
//    public double getRadius() {
//        return radius;
//    }
//
//    public void setRadius(double radius) {
//        this.radius = radius;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//bai2    }
//
//    public double getArea() {
//        return Math.PI * radius * radius;
//    }
//
//    @Override
//    public String toString() {qa
//        return "Circle (radius=" + radius + ",color=" + color + ")";
//    }
//}
//class CircleTest {
//    public static void main(String[] args) {
//        Circle c1 = new Circle();
//        System.out.println("Circle 1: " + c1.toString());
//        System.out.println("Area: " + c1.getArea());
//
//        Circle c2 = new Circle(2.0);
//        System.out.println("Circle 2: " + c2.toString());
//        System.out.println("Radius: " + c2.getRadius());
//        c2.setColor("blue");
//        System.out.println("Color: " + c2.getColor());
//
//        Circle c3 = new Circle(3.0, "green");
//        System.out.println("Circle 3: " + c3.toString());
//        System.out.println("Area: " + c3.getArea());
//        c3.setRadius(4.0);
//        System.out.println("New radius: " + c3.getRadius());
//    }
//}
//class Cylinder extends Circle {
//    private double height;
//
//    public Cylinder() {
//        super();
//        height = 1.0;
//    }
//
//    public Cylinder(double radius, double height) {
//        super(radius);
//        this.height = height;
//    }
//
//    public Cylinder(double radius, double height, String color) {
//        super(radius, color);
//        this.height = height;
//    }
//
//    public double getHeight() {
//        return height;
//    }
//
//    public void setHeight(double height) {
//        this.height = height;
//    }
//
//    public double getVolume() {
//        return super.getArea() * height;
//    }
//
//    @Override
//    public String toString() {
//        return "Cylinder[" + super.toString() + ",height=" + height + "]";
//    }
//
//}
