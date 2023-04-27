package bai2.shape;

public class Shape {
    private String color;
    private boolean filled;

    public Shape() {
        this.color = "red";
        this.filled = true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString() {
        return "Shape[color=" + color + "," + "filled=" + filled + "]";
    }

}
 class Circle extends Shape {

    // TODO Auto-generated method stub
    private double radius;


    public Circle() {
        this.radius = 1.0;

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color,filled);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "Circle[Shape" + "[color=" + getColor() + "," + "filled=" + isFilled() + "]," + "radius=" + radius + "]";
    }

}
 class Rectangle extends Shape {

    private double length;
    private double width;

    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }

    public Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth()
    {
        return this.width;
    }

    public void setWidth(double width)
    {
        this.width = width;
    }

    public double getLength()
    {
        return this.length;
    }

    public void setLength(double length)
    {
        this.length = length;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2*length + 2*width;
    }

    public String toString() {
        return "Rectangle[Shape" + "[color=" + getColor() + "," + "filled=" + isFilled() + "]," + "width=" + width + "," + "length=" + length + "]";
    }

}
class Square extends Rectangle {

    private double side;

    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setWidth(double side) {
        super.setWidth(getWidth());
    }

    public void setLength(double side) {
        super.setLength(getLength());
    }

    public String toString() {
        return "Square[Rectangle" + "[" + "Shape" + "[" + "color=" + getColor() + "," + "filled=" + isFilled() + "]," + "width=" + getWidth() + "," + "length=" + getLength() + "]";
    }
}
 class TestMain {
    public static void main(String[] args) {
        /* Test Shape class */
        // Test constructors and toString()
        Shape s1 = new Shape();
        System.out.println(s1);  // toString()
        Shape s2 = new Shape("green", false);
        System.out.println(s2);  // toString()
        // Test Setters and Getters
        s1.setColor("blue");
        s1.setFilled(true);
        System.out.println(s1);  // toString()
        System.out.println("Color is: " + s1.getColor());
        System.out.println("Filled is: " + s1.isFilled());

        /* Test Circle class */
        // Test constructors and toString()
        Circle c1 = new Circle();
        System.out.println(c1);
        Circle c2 = new Circle(1.1);
        System.out.println(c2);
        Circle c3 = new Circle(2.2, "green", false);
        System.out.println(c3);
        // Test Setters and Getters
        c1.setColor("orange");  // superclass
        c1.setFilled(true);     // superclass
        c1.setRadius(8.8);
        System.out.println(c1);
        System.out.println("Color is: " + c1.getColor());  // superclass
        System.out.println("Filled is: " + c1.isFilled()); // superclass
        System.out.println("Radius is: " + c1.getRadius());
        System.out.printf("Area is: %.2f%n", c1.getArea());
        System.out.printf("Perimeter is: %.2f%n", c1.getPerimeter());

        /* Test Rectangle class */
        // Test constructors and toString()
        Rectangle r1 = new Rectangle();
        System.out.println(r1);
        Rectangle r2 = new Rectangle(1.1, 2.2);
        System.out.println(r2);
        Rectangle r3 = new Rectangle(3.3, 4.4, "green", false);
        System.out.println(r3);
        // Test setters and getters
        r1.setWidth(5.5);
        r1.setLength(6.6);
        r1.setColor("orange");  // superclass
        r1.setFilled(true);     // superclass
        System.out.println(r1);
        System.out.println("Color is: " + r1.getColor());  // superclass
        System.out.println("Filled is: " + r1.isFilled()); // superclass
        System.out.println("Length is: " + r1.getLength());
        System.out.println("Width is: " + r1.getWidth());
        System.out.printf("Area is: %.2f%n", r1.getArea());
        System.out.printf("Perimeter is: %.2f%n", r1.getPerimeter());

        /* Test Square class */
        // Test constructor and toString()
        Square sq1 = new Square();
        System.out.println(sq1);
        Square sq2 = new Square(1.1);
        System.out.println(sq2);
        Square sq3 = new Square(2.2, "green", false);
        System.out.println(sq3);
        // Test Setters and Getters
        sq1.setSide(3.3);
        sq1.setColor("orange");  // superclass
        sq1.setFilled(false);    // superclass
        System.out.println(sq1);
        System.out.println("Color is: " + sq1.getColor());   // superclass
        System.out.println("Filled is: " + sq1.isFilled());  // superclass
        System.out.println("Side is: " + sq1.getSide());

        sq1.setWidth(4.4);  // overridden
        System.out.println(sq1);
        System.out.println("Width is: " + sq1.getWidth());   // superclass
        sq1.setLength(5.5);  // overridden
        System.out.println(sq1);
        System.out.println("Length is: " + sq1.getLength()); // superclass

        System.out.printf("Area is: %.2f%n", sq1.getArea());
        System.out.printf("Perimeter is: %.2f%n", sq1.getPerimeter());


    }
}


