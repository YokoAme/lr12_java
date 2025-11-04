package org.example;

public class Hamster {
    private String name;
    public int age;
    protected double weight;
    String color;

    public Hamster(String name, int age, double weight, String color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public void eat() {
        System.out.println(name + " ест зернышки");
    }

    public void runInWheel() {
        System.out.println(name + " бегает в колесе!");
    }

    protected void sleep() {
        System.out.println(name + " сладко спит...");
    }

    private void squeak() {
        System.out.println(name + " пищит от радости!");
    }

    public void play() {
        squeak();
        System.out.println(name + " играет с опилками!");
    }

    public void showInfo() {
        System.out.println("Имя: " + name + ", Возраст: " + age + ", Вес: " + weight + " кг, Цвет: " + color);
    }
}
