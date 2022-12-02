package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComparisonBySurnameTest {
    static ComparisonBySurnameTest comparisonBySurnameTest;

    @BeforeAll
    public static void init() {
        comparisonBySurnameTest = new ComparisonBySurnameTest();
    }

    private Student createStudent1() {
        Student student1 = new Student();
        student1.setSurname("Zolotareva");
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
    void compare() {

        int rezult = (createStudent1().getSurname()).compareTo(createStudent2().getSurname());
        if (rezult == 0) {
            rezult = (createStudent1().getName()).compareTo(createStudent2().getName());
        }
        ComparisonBySurname comparisonBySurname2 = new ComparisonBySurname();
        assertEquals(rezult, comparisonBySurname2.compare(createStudent1(), createStudent2()));
    }
}