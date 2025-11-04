package org.example.task3;

import java.util.List;

public class Report {

    public static void generateReport(List<Employee> employees) {
        System.out.printf("%-5s %-15s %15s%n", "ID", "Фамилия", "Зарплата");
        System.out.println("---------------------------------------------");
        for (Employee e : employees) {
            System.out.printf("%-5d %-15s %15.2f%n",
                    e.getId(), e.getFullname(), e.calcAverageSalary());
        }
        System.out.println();
    }
}
