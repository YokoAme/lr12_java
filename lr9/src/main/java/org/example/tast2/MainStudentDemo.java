package org.example.tast2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainStudentDemo {

    public static void processStudents(List<Student> students) {
        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            if (s.getAverageGrade() < 3.0) {
                it.remove();
            } else {
                s.setCourse(s.getCourse() + 1);
            }
        }
    }

    public static void printStudents(List<Student> students, int course) {
        System.out.println("Студенты " + course + "-го курса:");
        for (Student s : students) {
            if (s.getCourse() == course) {
                System.out.println(s.getName());
            }
        }
    }

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Великая Мария", "т-318", 1, new int[]{5,4,4,5}));
        list.add(new Student("Пытькова Ольга", "т-318", 1, new int[]{2,3,2,3}));
        list.add(new Student("Какойто Чел", "т-319", 2, new int[]{3,3,4,4}));
        list.add(new Student("Еще Челик", "т-319", 2, new int[]{5,5,5,5}));
        list.add(new Student("Корженевский Кирилл", "т-318", 1, new int[]{2,2,2,2}));

        System.out.println("Всего студентов: " + list.size());
        processStudents(list);
        System.out.println("После обработки: " + list.size());

        printStudents(list, 2);
    }
}
