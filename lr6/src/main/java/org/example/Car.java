package org.example;




public class Car {
    private String brand;
    private Engine engine;
    private Wheel[] wheel;

    public Car(String brand, Engine engine, Wheel[] wheel) {
        this.brand = brand;
        this.engine = engine;
        this.wheel = wheel;
    }

    public void drive() {
        System.out.println(brand + " едет вперёд 🚗");
    }

    public void refuel() {
        System.out.println(brand + " заправляется топливом ⛽");
    }

    public void changeWheel() {
        System.out.println("Колесо заменено! Тип колеса: " + wheel[0].getType());
    }


    public void showBrand() {
        System.out.println("Марка автомобиля: " + brand);
    }
}
