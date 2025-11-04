package org.example.shapes;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        System.out.println("Площадь круга: " + circle.calculateArea());
        System.out.println("Площадь прямоугольника: " + rectangle.calculateArea());
    }
}
