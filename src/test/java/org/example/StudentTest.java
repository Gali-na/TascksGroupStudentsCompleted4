package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    private Student createStudent() {
        Student student= new Student();
        student = new Student();
        student.setName("Natalia");
        student.setSurname("Zolotareva");
        student.setAge(18);
        student.setGender(Gender.WOMAN);
        student.setAverageRating(5);
        return student;
    }
    @Test
    void getAverageRating() {
        assertEquals(5,createStudent().getAverageRating());
    }

    @Test
    void setAverageRating_ArgumentPositive_NotSetUpAverageRating() {
        assertEquals(5,createStudent().getAverageRating());
    }


    @Test
    void testToString() {
    }
}