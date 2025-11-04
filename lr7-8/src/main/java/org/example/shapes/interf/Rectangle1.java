package org.example.shapes.interf;

public class Rectangle1 implements Shape1 {
    private final double width;
    private final double height;

    public Rectangle1(double width, double height) {
        this.width  = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}
