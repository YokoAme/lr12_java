package com.example.domain;

public class StudentTest {
    public static void main(String[] args) {

        Student s = new Student(0, "Тест Студент");
        System.out.println("Базовый Student через геттеры: id=" + s.getId() + ", name=" + s.getName());
        System.out.println("Базовый Student toString(): " + s);

        Undergraduate u = new Undergraduate(1, "Ольга Пытькова", "Программирование");
        Graduate g = new Graduate(2, "Кирилл Корженевский", "Искусственный интеллект");


        System.out.println("Студент1: " + u);
        System.out.println("Студент2: " + g);


        s.setName("Обновлённое имя");
        System.out.println("После setName(): " + s.getName());
    }
}
