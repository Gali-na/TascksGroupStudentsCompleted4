package org.example;

import java.util.Comparator;

public class SortByAverageRating implements Comparator<Student> {

    public int compare(Student student1, Student student2) {
        return (student1.getAverageRating()) - (student2.getAverageRating());
    }
}
