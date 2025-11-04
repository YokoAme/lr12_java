package org.example.task3;

public abstract class Employee implements Comparable<Employee> {
    protected final int id;
    protected final String fullname;

    public Employee(int id, String fullname) {
        this.id = id;
        this.fullname = fullname;
    }

    public int getId() { return id; }
    public String getFullname() { return fullname; }

    public abstract double calcAverageSalary();

    @Override
    public int compareTo(Employee other) {
        double diff = other.calcAverageSalary() - this.calcAverageSalary();
        if (diff == 0) {
            return this.fullname.compareToIgnoreCase(other.fullname);
        }
        return diff > 0 ? 1 : -1;
    }
}
