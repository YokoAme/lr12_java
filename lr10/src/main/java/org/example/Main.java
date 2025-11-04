package org.example;

import org.example.classes.*;
import org.example.ex.SalaryException;

public class Main {
    public static void main(String[] args) {

        try {
            Employee bad = new StaffEmployee("jyg", "", 1000, -500);
            System.out.println(bad);

        } catch (SalaryException se) {
            System.out.println("Невозможно создать сотрудника – указан отрицательный оклад: " + se.getBadSalary());

            try {
                throw new SalaryException("Повторное создание исключения", se.getBadSalary());
            } catch (SalaryException ignored) { }

        } catch (Exception e) {
            System.out.println("Непредвиденная ошибка при создании сотрудника: " + e.getMessage());
        }


        try {
            StaffEmployee staff = new StaffEmployee("Пытькова Ольга", "Разработчик", 1500, 300);
            ContractEmployee contr = new ContractEmployee("Корженевский Кирилл", "Тестировщик", 1200, 15, 40);

            Department dev = new Department("Разработка");
            dev.addEmployee(staff);
            dev.addEmployee(contr);

            Company firm = new Company("ООО Сухичи");
            firm.addDepartment(dev);

            System.out.println(staff + " => salary=" + staff.calculateSalary());
            System.out.println(contr + " => salary=" + contr.calculateSalary());

            staff.setBonus(-500);
            System.out.println("Повторный расчет (штатник, отрицательная премия): " + staff.calculateSalary());

        } catch (SalaryException se) {
            System.out.println("Ошибка оклада: " + se.getMessage());

        } catch (Exception e) {
            System.out.println("Непредвиденная ошибка во второй части программы: " + e.getMessage());
        }

        try {
            Department emptyDep = new Department("");
            System.out.println(emptyDep.getName());
        } catch (Exception e) {
            System.out.println("Ошибка при создании отдела: " + e.getMessage());
        }


        System.out.println("Конец программы.");
    }
}

