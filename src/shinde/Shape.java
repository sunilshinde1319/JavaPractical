package shinde;

import java.util.Scanner;

public class Shape {

    // Data members
    private double side;       // for square
    private double length;     // for rectangle
    private double breadth;    // for rectangle
    private double radius;     // for circle

    // Constructors
    public Shape(double side) {  // for square
        this.side = side;
    }

    public Shape(double length, double breadth) { // for rectangle
        this.length = length;
        this.breadth = breadth;
    }

    public Shape(double radius, char c) {  // for circle, 'c' is just a placeholder to differentiate constructors
        this.radius = radius;
    }

    // Area method for square
    public double area() {
        return side * side;
    }

    // Area method for rectangle
    public double area(double length, double breadth) {
        return length * breadth;
    }

    // Area method for circle
    public double area(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the shape (square/rectangle/circle):");
        String shapeType = scanner.nextLine().toLowerCase();

        Shape shape;

        switch (shapeType) {
            case "square":
                System.out.println("Enter side of the square:");
                double side = scanner.nextDouble();
                shape = new Shape(side);
                System.out.println("Area of square: " + shape.area());
                break;

            case "rectangle":
                System.out.println("Enter length of the rectangle:");
                double length = scanner.nextDouble();
                System.out.println("Enter breadth of the rectangle:");
                double breadth = scanner.nextDouble();
                shape = new Shape(length, breadth);
                System.out.println("Area of rectangle: " + shape.area(length, breadth));
                break;

            case "circle":
                System.out.println("Enter radius of the circle:");
                double radius = scanner.nextDouble();
                shape = new Shape(radius, 'c');
                System.out.println("Area of circle: " + shape.area(radius));
                break;

            default:
                System.out.println("Invalid shape type.");
                break;
        }

        scanner.close();
    }
}

