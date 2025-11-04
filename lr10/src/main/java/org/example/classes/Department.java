package org.example.classes;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private final List<Employee> employees = new ArrayList<>();

    public Department(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Название отдела не может быть пустым");
        }
        this.name = name;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public void addEmployee(Employee e) { employees.add(e); }
    public List<Employee> getEmployees() { return employees; }
    public int getEmployeeCount() { return employees.size(); }
}
