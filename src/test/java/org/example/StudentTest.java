package org.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    private Student createStudent() {
        Student student = new Student();
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

        assertEquals(5, createStudent().getAverageRating());
    }

    @Test
    void setAverageRating_ArgumentPositive_SetUpAverageRating() {
        assertEquals(5, createStudent().getAverageRating());
    }

    @Test
    void setAverageRating_ArgumentIs0_NotSetUpAverageRating() {
        Student student = new Student();

        String cousoleOutputStream = "";
        String result = "Rating entered incorrectly\r\n";
        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream(200);
            PrintStream capture = new PrintStream(outputStream);
            System.setOut(capture);
            student.setAverageRating(0);
            capture.flush();
            cousoleOutputStream = outputStream.toString();
            PrintStream originalOut = System.out;
            System.setOut(originalOut);
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertEquals(result, cousoleOutputStream);
    }

    @Test
    void setAverageRating_ArgumenIsBelow0_NotSetUpAverageRating() {
        Student student = new Student();

        String cousoleOutputStream = "";
        String result = "Rating entered incorrectly\r\n";
        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream(200);
            PrintStream capture = new PrintStream(outputStream);
            System.setOut(capture);
            student.setAverageRating(-1);
            capture.flush();
            cousoleOutputStream = outputStream.toString();
            PrintStream originalOut = System.out;
            System.setOut(originalOut);
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertEquals(result, cousoleOutputStream);
    }

    @Test
    void setAverageRating_ArgumenIsMore5_NotSetUpAverageRating() {
        Student student = new Student();

        String cousoleOutputStream = "";
        String result = "Rating entered incorrectly\r\n";
        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream(200);
            PrintStream capture = new PrintStream(outputStream);
            System.setOut(capture);
            student.setAverageRating(10);
            capture.flush();
            cousoleOutputStream = outputStream.toString();
            PrintStream originalOut = System.out;
            System.setOut(originalOut);
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertEquals(result, cousoleOutputStream);
    }

    @Test
    void testToString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(createStudent().getSurname() + " ");
        stringBuilder.append(createStudent().getName() + " ");
        stringBuilder.append(createStudent().getGender() + " ");
        stringBuilder.append(createStudent().getAge() + " ");
        stringBuilder.append(createStudent().getAverageRating());
        assertEquals(stringBuilder.toString(), createStudent().toString());
    }
}