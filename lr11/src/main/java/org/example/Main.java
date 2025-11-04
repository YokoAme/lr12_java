package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Лабораторная работа: работа с файлами ===");

        AboutMeIO.run();          // Задание 1
        TempWriter15.run();       // Задание 2.1
        TempAverageCalc.run();    // Задание 2.2
        RandomSplitFloats.run();  // Задание 3

        System.out.println("=== Конец программы ===");
    }
}
