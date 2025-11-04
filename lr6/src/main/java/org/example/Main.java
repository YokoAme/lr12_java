package org.example;

public class Main {
    public static void main(String[] args) {
        // Тест 1 — Хомячок
        Hamster h1 = new Hamster("Пушок", 2, 0.25, "бежевый");
        h1.showInfo();
        h1.eat();
        h1.runInWheel();
        h1.play();
        h1.sleep();

        System.out.println("\n----------------------\n");

        // Тест 2 — Автомобиль
        Engine engine = new Engine(120);
        Wheel[] wheels = {new Wheel("зимнее") };

        Car car = new Car("Toyota", engine, wheels);
       car.showBrand();
        car.drive();
       car.refuel();
        car.changeWheel();
    }
}
