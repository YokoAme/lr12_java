package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Алексей");

        // пример корректного вызова статического метода из другого класса
        Tester.sayHello();

        // демонстрация цепочки конструкторов this(...)
        Tester t1 = new Tester();
        Tester t2 = new Tester("Алексей", "Навальный");
        Tester t3 = new Tester("Алексей", "Навальный", 5);

        t3.setEnglishLevel("B2");
        t3.setSalary(1500);

        // три перегруженных метода (одинаковое имя, разные сигнатуры)
        t3.increaseSalary(200);          // + сумма
        t3.increaseSalary(100, 50);      // + сумма и бонус
        t3.increaseSalary(10);           // + % от текущей зарплаты

        t3.showInfo();
        t3.showInfo(true);
        t3.showInfo(">> ");
    }
}
