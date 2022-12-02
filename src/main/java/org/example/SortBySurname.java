package org.example;

import java.util.Comparator;

public class SortBySurname implements Comparator<Student> {
    public int compare(Student student1, Student student2) {
        int rezult = 0;
        if (student1 != null && student2 != null) {
            student1.getSurname().compareTo(student2.getSurname());
        }
        return rezult;
    }
}
