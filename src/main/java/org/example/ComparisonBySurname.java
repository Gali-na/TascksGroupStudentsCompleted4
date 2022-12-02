package org.example;

import java.util.Comparator;

public class ComparisonBySurname implements Comparator<Student> {
    public int compare(Student student1, Student student2) {
        int rezult = (student1.getSurname()).compareTo(student2.getSurname());
        if (rezult != 0) {
            return rezult;
        }
        return rezult = student1.getName().compareTo(student2.getName());

    }
}
