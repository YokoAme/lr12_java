package org.example;

public class Tester {
    private String name;
    private String surname;
    private int expirienceInYears;
    private String englishLevel;
    private double salary;

    // ---------- 3 конструктора с последовательным вызовом this(...) ----------
    public Tester() {
        this("Noname", "Unknown");
    }

    public Tester(String name, String surname) {
        this(name, surname, 0);
    }

    public Tester(String name, String surname, int expirienceInYears) {
        this.name = name;
        this.surname = surname;
        this.expirienceInYears = expirienceInYears;
        this.englishLevel = "A1";
        this.salary = 0.0;
    }

    // ---------- 3 перегруженных метода ----------
    public void increaseSalary(double amount) {
        this.salary += amount;
    }

    public void increaseSalary(double amount, double bonus) {
        this.salary += amount + bonus;
    }

    public void increaseSalary(int percent) {
        this.salary += this.salary * (percent / 100.0);
    }

    // ---------- статический метод ----------
    public static void sayHello() {
        System.out.println("Привет от класса Tester");
    }

    public void showInfo() {
        System.out.println(name + " " + surname);
    }

    public void showInfo(boolean full) {
        if (full) {
            System.out.println("Имя: " + name +
                    ", Фамилия: " + surname +
                    ", Опыт: " + expirienceInYears + " лет" +
                    ", Английский: " + englishLevel +
                    ", Зарплата: " + salary);
        } else {
            showInfo();
        }
    }

    public void showInfo(String prefix) {
        System.out.println(prefix + name + " " + surname +
                " | ENG=" + englishLevel + " | зарплата=" + salary);
    }

    public void setEnglishLevel(String englishLevel) { this.englishLevel = englishLevel; }
    public void setSalary(double salary) { this.salary = salary; }
}
