package com.example;

import com.example.domain.Employee;

public class EmployeeTest {
    public static void main(String[] args) {

        Employee masik = new Employee();
        masik.setEmpId(12);
        masik.setName("Великая Мария");
        masik.setSsn("00040834-434-23231-21");
        masik.setSalary(6666.5);

        System.out.println(masik);
        System.out.println(masik.info());


        System.out.println("Идентификатор: " + masik.getEmpId());
        System.out.println("Имя: " + masik.getName());
        System.out.println("СНИЛС: " + masik.getSsn());
        System.out.printf("Зарплата: %.2f%n", masik.getSalary());


    }
}
