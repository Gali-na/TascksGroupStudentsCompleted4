package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortBySurnameTest {
    static SortBySurname sortBySurname;

    @BeforeAll
    public static void init() {
        sortBySurname = new SortBySurname();
    }

    private Student createStudent1() {
        Student student1 = new Student();
        student1.setSurname("Aolotareva");
        student1.setName("Natalia");
        student1.setAge(19);
        student1.setGender(Gender.WOMAN);
        student1.setAverageRating(3);
        return student1;
    }

    private Student createStudent2() {
        Student student2 = new Student();
        student2.setSurname("Zolotareva");
        student2.setName("Aria");
        student2.setAge(20);
        student2.setGender(Gender.WOMAN);
        student2.setAverageRating(3);
        return student2;
    }

    @Test
    void compare_FirstArgumentGreaterThanSecond() {
        int rezultCompare = sortBySurname.compare(createStudent1(), createStudent2());
        assertEquals(createStudent1().getSurname().compareTo(createStudent2().getSurname()), rezultCompare);
    }

    @Test
    void compare_SecondArgumentGreaterThanFirst() {
        int rezultCompare = sortBySurname.compare(createStudent2(), createStudent1());
        assertEquals(createStudent2().getSurname().compareTo(createStudent1().getSurname()), rezultCompare);
    }
}