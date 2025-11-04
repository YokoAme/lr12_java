package org.example.shapes.interf;


public class Main {
    public static void main(String[] args) {
        Shape1 c = new Circle1(5);
        Shape1 r = new Rectangle1(4, 6);

        System.out.println("Площадь круга: " + c.calculateArea());
        System.out.println("Площадь прямоугольника: " + r.calculateArea());
    }
}
