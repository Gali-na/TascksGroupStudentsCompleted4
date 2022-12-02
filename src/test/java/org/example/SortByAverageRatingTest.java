package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortByAverageRatingTest {
    static SortByAverageRating sortByAverageRating;

    @BeforeAll
    public static void init() {

        sortByAverageRating = new SortByAverageRating();
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
        student2.setAverageRating(2);
        return student2;
    }

    @Test
    void compare_FirstArgumentGreaterThanSecond() {
        int expectedRezult = createStudent1().averageRating - createStudent2().getAverageRating();
        int actualRezult = sortByAverageRating.compare(createStudent1(), createStudent2());
        assertEquals(expectedRezult, actualRezult);
    }

    @Test
    void compare_SecondArgumentGreaterThanFirst() {
        int expectedRezult = createStudent2().averageRating - createStudent1().getAverageRating();
        int actualRezult = sortByAverageRating.compare(createStudent2(), createStudent1());
        assertEquals(expectedRezult, actualRezult);
    }

    @Test
    void compare_SecondArgumentIsSameGFirst() {
        createStudent1().setAverageRating(5);
        createStudent2().setAverageRating(5);
        int expectedRezult = createStudent2().averageRating - createStudent1().getAverageRating();
        int actualRezult = sortByAverageRating.compare(createStudent2(), createStudent1());
        assertEquals(expectedRezult, actualRezult);
    }
}