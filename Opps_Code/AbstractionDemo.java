package Opps_Code;

abstract class Shape {
    abstract void draw(); // abstract method
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle");
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw(); // only essential behavior exposed
    }
}
