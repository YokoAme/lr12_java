package org.example.task3;


public class FixedEmployee extends Employee {
    private final double monthlySalary;

    public FixedEmployee(int id, String fullname, double monthlySalary) {
        super(id, fullname);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calcAverageSalary() {
        return monthlySalary;
    }
}


