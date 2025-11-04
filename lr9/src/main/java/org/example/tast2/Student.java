package org.example.tast2;

import java.util.Arrays;

public class Student {
    private final String name;
    private final String group;
    private int course;
    private final int[] grades;

    public Student(String name, String group, int course, int[] grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = Arrays.copyOf(grades, grades.length);
    }

    public String getName() { return name; }
    public String getGroup() { return group; }
    public int getCourse() { return course; }
    public void setCourse(int course) { this.course = course; }

    public double getAverageGrade() {
        if (grades.length == 0) return 0.0;
        int sum = 0;
        for (int g : grades) sum += g;
        return (double) sum / grades.length;
    }
}
