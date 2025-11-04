package org.example.classes;

import org.example.ex.SalaryException;

public abstract class Employee {
    private final String fullName;
    private final String position;
    private double baseSalary;

    public Employee(String fullName, String position, double baseSalary) throws SalaryException {
        // имя не пустое
        if (fullName == null || fullName.trim().isEmpty()) {
            throw new IllegalArgumentException("Имя сотрудника не может быть пустым");
        }
        if (position == null || position.trim().isEmpty()) {
            throw new IllegalArgumentException("Должность не может быть пустой");
        }
        if (baseSalary < 0) {
            throw new SalaryException("Зп должна быть положительна", baseSalary);
        }

        this.fullName = fullName.trim();
        this.position = position.trim();
        this.baseSalary = baseSalary;
    }


    public String getFullName() { return fullName; }
    public String getPosition() { return position; }
    public double getBaseSalary() { return baseSalary; }

    public void setBaseSalary(double baseSalary) throws SalaryException {
        if (baseSalary < 0) {
            throw new SalaryException("Зп должна быть положительна", baseSalary);
        }
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();

    @Override
    public String toString() {
        return fullName + " (" + position + "), base=" + baseSalary;
    }
}

