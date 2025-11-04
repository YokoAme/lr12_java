package org.example.classes;

import org.example.ex.SalaryException;

public class ContractEmployee extends Employee {
    private int daysWorked;
    private double dailyRate;

    public ContractEmployee(String fullName, String position, double baseSalary,
                            int daysWorked, double dailyRate) throws SalaryException {
        super(fullName, position, baseSalary);
        this.daysWorked = daysWorked;
        this.dailyRate = dailyRate;
    }

    public int getDaysWorked() { return daysWorked; }
    public double getDailyRate() { return dailyRate; }
    public void setDaysWorked(int daysWorked) { this.daysWorked = daysWorked; }
    public void setDailyRate(double dailyRate) { this.dailyRate = dailyRate; }

    @Override
    public double calculateSalary() {
        try {
            if (daysWorked < 0 || dailyRate < 0) {
                throw new IllegalArgumentException("кол-во дней должно быть положительным");
            }
            return getBaseSalary() + daysWorked * dailyRate;
        } catch (Exception e) {
            System.out.println("Ошибка в расчете зп: " + e.getMessage());
            return 0.0;
        }
    }
}
