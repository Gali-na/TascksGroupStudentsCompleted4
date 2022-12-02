package org.example;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setSurname("Zolotareva");
        student1.setName("Natalia");
        student1.setAge(19);
        student1.setGender(Gender.WOMAN);
        student1.setAverageRating(3);

        Student student2 = new Student();
        student2.setSurname("Zolotareva");
        student2.setName("Aria");
        student2.setAge(20);
        student2.setGender(Gender.WOMAN);
        student2.setAverageRating(3);

        Student student3 = new Student();
        student3.setSurname("Tsivka");
        student3.setName("Galina");
        student3.setAge(20);
        student3.setGender(Gender.WOMAN);
        student3.setAverageRating(4);

        Student student4 = new Student();
        student4.setSurname("Tsivks");
        student4.setName("Anna");
        student4.setAge(20);
        student4.setGender(Gender.WOMAN);
        student4.setAverageRating(4);

        Student student5 = new Student();
        student5.setSurname("Ostapenko");
        student5.setName("Luba");
        student5.setAge(20);
        student5.setGender(Gender.WOMAN);
        student5.setAverageRating(5);

        Student student6 = new Student();
        student6.setSurname("Ostapenko");
        student6.setName("Sergey");
        student6.setAge(18);
        student6.setGender(Gender.MAN);
        student6.setAverageRating(4);

        Student student7 = new Student();
        student7.setSurname("Zolotarev");
        student7.setName("Yriy");
        student7.setAge(18);
        student7.setGender(Gender.MAN);
        student7.setAverageRating(4);

        Student student8 = new Student();
        student8.setSurname("Petriv");
        student8.setName("Andrey");
        student8.setAge(20);
        student8.setGender(Gender.MAN);
        student8.setAverageRating(5);

        Student student9 = new Student();
        student9.setSurname("Ivanov");
        student9.setName("Oleg");
        student9.setAge(20);
        student9.setGender(Gender.MAN);
        student9.setAverageRating(2);

        Student student10 = new Student();
        student10.setSurname("Sidorov");
        student10.setName("Pavel");
        student10.setAge(20);
        student10.setGender(Gender.MAN);
        student10.setAverageRating(4);

        Student student11 = new Student();
        student11.setSurname("Smirnov");
        student11.setName("Saha");
        student11.setAge(20);
        student11.setGender(Gender.MAN);
        student11.setAverageRating(3);

        Group group = new Group();
        group.setName("GGG-1");

        System.out.println(group.addStudent(student1));
        System.out.println(group.addStudent(student2));
        System.out.println(group.addStudent(student3));
        System.out.println(group.addStudent(student4));
        System.out.println(group.addStudent(student5));
        System.out.println(group.addStudent(student6));
        System.out.println(group.addStudent(student7));
        System.out.println(group.addStudent(student8));
        System.out.println(group.addStudent(student9));
        System.out.println(group.addStudent(student10));
        System.out.println(group.addStudent(student11));


        System.out.println("*****************");
        System.out.println(group.toString());
        System.out.println(group.removeStudent(student5));
        System.out.println("*****************");
        System.out.println(group.toString());
        System.out.println("*****************");

        System.out.println(group.searchStudentBySurname("Zolotareva"));
        System.out.println("*****************");
        System.out.println("*****************");
        ArrayList<Student> students = new ArrayList<Student>(group.getStudentList());

        Collections.sort(students, new ComparisonBySurname());
        for (Student st : students) {
            System.out.println(st.toString());
        }
        System.out.println();
        System.out.println("*****************");
        Collections.sort(students, new SortBySurname());
        for (Student st : students) {
            System.out.println(st.toString());
        }
        System.out.println();
        System.out.println("*****************");
        Collections.sort(students, new SortByAverageRating());
        for (Student st : students) {
            System.out.println(st.toString());
        }
        MilitaryCommissar militaryCommissar = new CommissarUniversity();
        System.out.println(militaryCommissar.listManAfter18(group));
    }
}
