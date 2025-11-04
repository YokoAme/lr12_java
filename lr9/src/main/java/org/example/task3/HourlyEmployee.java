package org.example.task3;


public class HourlyEmployee extends Employee {
    private final double hourlyRate;

    public HourlyEmployee(int id, String fullname, double hourlyRate) {
        super(id, fullname);
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calcAverageSalary() {
        return hourlyRate * 21 * 8;
    }
}

