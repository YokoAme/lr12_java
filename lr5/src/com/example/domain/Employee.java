package com.example.domain;

public class Employee {

    private int empId;
    private String name;
    private String ssn;
    private double salary;

    public Employee() {}

    public int getEmpId() { return empId; }
    public void setEmpId(int empId) { this.empId = empId; }

    public String getName() { return name; }
    public void setName(String name) {
        this.name = (name == null || name.isBlank()) ? "UNKNOWN" : name;
    }

    public String getSsn() { return ssn; }
    public void setSsn(String ssn) { this.ssn = ssn; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) {
        if (salary < 0) throw new IllegalArgumentException("salary < 0");
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Employee id=" + empId +
                ", name='" + name  +
                ", ssn='" + ssn  +
                ", salary=" + String.format("%.2f", salary) ;
    }

    public String info() {
        return "Сотрудник id=" + empId + ", имя='" + name + "', СНИЛС='" + ssn +
                "', зарплата=" + String.format("%.2f", salary);
    }
}
