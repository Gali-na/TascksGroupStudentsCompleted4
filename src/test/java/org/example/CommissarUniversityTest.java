package org.example;

import org.junit.jupiter.api.Test;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CommissarUniversityTest {

    private Student student6() {
        Student student6 = new Student();
        student6.setSurname("Ostapenko");
        student6.setName("Sergey");
        student6.setAge(19);
        student6.setGender(Gender.MAN);
        student6.setAverageRating(4);
        return student6;
    }

    private Student student7() {
        Student student7 = new Student();
        student7.setSurname("Zolotarev");
        student7.setName("Yriy");
        student7.setAge(19);
        student7.setGender(Gender.MAN);
        student7.setAverageRating(4);
        return student7;
    }

    private Student student8() {
        Student student8 = new Student();
        student8.setSurname("Petriv");
        student8.setName("Andrey");
        student8.setAge(20);
        student8.setGender(Gender.MAN);
        student8.setAverageRating(5);
        return student8;
    }

    private Group createGroup() {
        Group group = new Group();
        group.setName("TTT");
        group.addStudent(student6());
        group.addStudent(student7());
        group.addStudent(student8());
        return group;
    }

    @Test
    void listManAfter18() {
        MilitaryCommissar militaryCommissar = new CommissarUniversity();
        ArrayList<Student> actualRezult = (ArrayList<Student>) militaryCommissar.listManAfter18(createGroup());
        actualRezult.trimToSize();
        ArrayList<Student> expectedRezult = new ArrayList<>();
        expectedRezult.add(student6());
        expectedRezult.add(student7());
        expectedRezult.add(student8());
        expectedRezult.trimToSize();
        assertEquals(expectedRezult.size(), actualRezult.size());
        assertEquals(true, actualRezult.contains(expectedRezult.get(0)));
        assertEquals(true, actualRezult.contains(expectedRezult.get(1)));
        assertEquals(true, actualRezult.contains(expectedRezult.get(2)));
    }
}