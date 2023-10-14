package shinde;


class Box {
protected double length, width;

public Box(double length, double width) {
   this.length = length;
   this.width = width;
}

public double area() {
   return length * width;
}
}

//Derived class
class Manual3 extends Box {
private double height;

public Manual3(double length, double width, double height) {
   super(length, width);
   this.height = height;
}

// Override the area() method to compute the surface area of the box
@Override
public double area() {
   return 2 * (length * width) + 2 * (length * height) + 2 * (width * height);
}
}

//Main class to demonstrate
public class MainMethodClass {
public static void main(String[] args) {
   Box box1 = new Box(5, 4);
   System.out.println("Box area: " + box1.area());

   Manual3 manual3Box = new Manual3(5, 4, 3);
   System.out.println("Manual3 box surface area: " + manual3Box.area());
}
}
