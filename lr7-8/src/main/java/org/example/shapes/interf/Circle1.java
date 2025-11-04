package org.example.shapes.interf;

public class Circle1 implements Shape1 {
    private final double radius;

    public Circle1(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
