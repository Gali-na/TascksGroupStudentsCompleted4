package org.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class GroupTest {
    private Group creatGroup() {
        Group group = new Group();
        group.setName("FII-13");

        return group;
    }

    private Student student1() {
        Student student1 = new Student();
        student1.setSurname("Zolotareva");
        student1.setName("Natalia");
        student1.setAge(19);
        student1.setGender(Gender.WOMAN);
        student1.setAverageRating(3);
        return student1;
    }

    private Student student2() {
        Student student2 = new Student();
        student2.setSurname("Zolotareva");
        student2.setName("Aria");
        student2.setAge(20);
        student2.setGender(Gender.WOMAN);
        student2.setAverageRating(3);
        return student2;
    }

    private Student student3() {
        Student student3 = new Student();
        student3.setSurname("Tsivka");
        student3.setName("Galina");
        student3.setAge(20);
        student3.setGender(Gender.WOMAN);
        student3.setAverageRating(4);
        return student3;
    }

    private Student student4() {
        Student student4 = new Student();
        student4.setSurname("Tsivks");
        student4.setName("Anna");
        student4.setAge(20);
        student4.setGender(Gender.WOMAN);
        student4.setAverageRating(4);
        return student4;
    }

    private Student student5() {
        Student student5 = new Student();
        student5.setSurname("Ostapenko");
        student5.setName("Luba");
        student5.setAge(20);
        student5.setGender(Gender.WOMAN);
        student5.setAverageRating(5);
        return student5;
    }

    private Student student6() {
        Student student6 = new Student();
        student6.setSurname("Ostapenko");
        student6.setName("Sergey");
        student6.setAge(18);
        student6.setGender(Gender.MAN);
        student6.setAverageRating(4);
        return student6;
    }

    private Student student7() {
        Student student7 = new Student();
        student7.setSurname("Zolotarev");
        student7.setName("Yriy");
        student7.setAge(18);
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

    private Student student9() {
        Student student9 = new Student();
        student9.setSurname("Ivanov");
        student9.setName("Oleg");
        student9.setAge(20);
        student9.setGender(Gender.MAN);
        student9.setAverageRating(2);
        return student9;
    }

    private Student student10() {
        Student student10 = new Student();
        student10.setSurname("Sidorov");
        student10.setName("Pavel");
        student10.setAge(20);
        student10.setGender(Gender.MAN);
        student10.setAverageRating(4);
        return student10;
    }

    private Student student11() {
        Student student11 = new Student();
        student11.setSurname("Smirnov");
        student11.setName("Saha");
        student11.setAge(20);
        student11.setGender(Gender.MAN);
        student11.setAverageRating(3);
        return student11;
    }

    @Test
    void getStudentList() {
    }

    @Test
    void getName() {
        assertEquals("FII-13", creatGroup().getName());
    }

    @Test
    void setName_NameIsNotNull_SetUpName() {
        assertEquals("FII-13", creatGroup().getName());
    }

    @Test
    void setName_NameIsNull_DosentSetUpName() {

        Group group = new Group();
        String cousoleOutputStream = "";
        String result = "Name is incorrect\r\n";

        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream(200);
            PrintStream capture = new PrintStream(outputStream);
            System.setOut(capture);
            group.setName(null);
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
    void addStudent_NumberStudentsLessThan10_AddingAll() {
        Group group = new Group();
        group.setName("GGGGGG");
        assertEquals("Student successfully added", group.addStudent(student1()));
        assertEquals("Student successfully added", group.addStudent(student2()));
        assertEquals("Student successfully added", group.addStudent(student3()));
    }

    @Test
    void addStudent_StudentIsNull_MassageAboutWrongInformation() {
        Student student = null;
        assertEquals("The student's details are incorrect, the student was not added to the group", creatGroup().addStudent(student));
    }

    @Test
    void addStudent_GroupHasNotName_MassageAboutWrongInformation() {
        Group group = new Group();
        assertEquals("Group created without naming, student cannot be added", group.addStudent(student3()));
    }

    @Test
    void addStudent_AddingStudentWhenGroupHas10Students_MessaGeerrorMessage() {
        Group group = new Group();
        group.setName("FFF");
        group.addStudent(student1());
        group.addStudent(student2());
        group.addStudent(student3());
        group.addStudent(student4());
        group.addStudent(student5());
        group.addStudent(student6());
        group.addStudent(student7());
        group.addStudent(student8());
        group.addStudent(student9());
        group.addStudent(student10());
        assertEquals("Group is full", group.addStudent(student11()));
    }

    @Test
    void removeStudent_StudentIsNotInGroup_MessaGeerrorMessageAndStudentHasNotRemoved() {
        Group group = creatGroup();
        group.addStudent(student1());
        assertEquals("This student is not in the group", group.removeStudent(student2()));
    }

    @Test
    void removeStudent_StudentIsNull_MessaGeerrorMessageAndStudentHasNotRemoved() {
        Group group = creatGroup();
        group.addStudent(student1());
        assertEquals("Group created without naming, student cannot be removd", group.removeStudent(null));
    }

    @Test
    void searchStudentBySurname_GroupHasSrudent_GetStudents() {
        Group group = creatGroup();
        group.addStudent(student1());
        group.addStudent(student2());
        ArrayList<Student> expectedList = new ArrayList<>();
        expectedList.add(student1());
        expectedList.add(student2());
        assertEquals(expectedList.get(0).getSurname(), group.searchStudentBySurname("Zolotareva").get(0).getSurname());
        assertEquals(expectedList.get(1).getSurname(), group.searchStudentBySurname("Zolotareva").get(1).getSurname());
    }

    @Test
    void searchStudentBySurname_GroupHasNotSrudent_GetStudents() {
        Group group = creatGroup();
        group.addStudent(student1());
        group.addStudent(student2());
        ArrayList<Student> expectedList = new ArrayList<>();
        assertEquals(expectedList.get(0).getSurname(), group.searchStudentBySurname("Zolotareva").get(0).getSurname());
        assertEquals(expectedList.get(1).getSurname(), group.searchStudentBySurname("Zolotareva").get(1).getSurname());
    }

    @Test
    void testToString() {
        Group group = creatGroup();
        group.addStudent(student1());

        StringBuilder stringBuilder = new StringBuilder(student1().toString());
        stringBuilder.append("\r\n");
        stringBuilder.append(student2());
        stringBuilder.append("\r\n");
        String expexted = student1().getSurname() + " " + student1().getName() + " " + student1().getGender() + " " + student1().getAge() + " " + student1().getAverageRating() + "\n";
        assertEquals(expexted, group.toString());

    }
}