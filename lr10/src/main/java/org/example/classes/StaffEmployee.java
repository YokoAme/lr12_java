package org.example.classes;

import org.example.ex.BonusException;
import org.example.ex.SalaryException;

public class StaffEmployee extends Employee {
    private double bonus;

    public StaffEmployee(String fullName, String position, double baseSalary, double bonus)
            throws SalaryException {
        super(fullName, position, baseSalary);
        this.bonus = bonus;
    }

    public double getBonus() { return bonus; }
    public void setBonus(double bonus) { this.bonus = bonus; }

    @Override
    public double calculateSalary() {
        try {
            if (bonus < 0) {
                throw new BonusException("Премия не может быть отриц: " + bonus);
            }
            return getBaseSalary() + bonus;
        } catch (BonusException be) {
            System.out.println("Ошибка премии: " + be.getMessage());
            return getBaseSalary();
        } catch (Exception e) {
            System.out.println("Ошибка при продсчете зп(штатник): " + e.getMessage());
            return 0.0;
        }
    }
}
