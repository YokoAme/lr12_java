package org.example.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainEmployeeDemo {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new FixedEmployee(1, "Иванов И.И.", 50000));
        employees.add(new HourlyEmployee(2, "Петров П.П.", 300));
        employees.add(new FixedEmployee(3, "Сидоров С.С.", 40000));
        employees.add(new HourlyEmployee(4, "Абрамов А.А.", 400));
        employees.add(new FixedEmployee(5, "Кузнецова Е.В.", 50000));
        employees.add(new HourlyEmployee(6, "Борисов Б.Б.", 250));
        employees.add(new FixedEmployee(7, "Иванова Г.А.", 60000));


        Collections.sort(employees);

        Report.generateReport(employees);

        System.out.println("Первые 5 сотрудников:");
        for (int i = 0; i < Math.min(5, employees.size()); i++) {
            System.out.println(employees.get(i).getFullname());
        }

        System.out.println("\nПоследние 3 ID сотрудников:");
        for (int i = Math.max(0, employees.size() - 3); i < employees.size(); i++) {
            System.out.println(employees.get(i).getId());
        }
    }
}
