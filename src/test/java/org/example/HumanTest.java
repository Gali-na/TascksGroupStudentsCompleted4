package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {
    private Human createHuman() {
        Human human;
        human = new Human();
        human.setName("Natalia");
        human.setSurname("Zolotareva");
        human.setAge(18);
        human.setGender(Gender.WOMAN);
        return human;
    }

    @Test
    void getAge() {

        assertEquals(18, createHuman().getAge());
    }

    @Test
    void setAge_ArgumentIs0_DoseNotSetUpAge() {
        Human human = new Human();
        String cousoleOutputStream = "";
        String result = "Age is incorrect\r\n";

        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream(200);
            PrintStream capture = new PrintStream(outputStream);
            System.setOut(capture);
            human.setAge(0);
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
    void setAge_ArgumentIsLessThan18_DoseNotSetUpAge() {
        Human human = new Human();
        String cousoleOutputStream = "";
        String result = "Age is incorrect\r\n";

        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream(200);
            PrintStream capture = new PrintStream(outputStream);
            System.setOut(capture);
            human.setAge(17);
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
    void setAge_ArgumentIsMoreThan120_DoseNotSetUpAge() {
        Human human = new Human();
        String cousoleOutputStream = "";
        String result = "Age is incorrect\r\n";

        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream(200);
            PrintStream capture = new PrintStream(outputStream);
            System.setOut(capture);
            human.setAge(121);
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
    void setAge_ArgumentIsBetween18and120_SetUpAge() {
        Human human = new Human();
        human.setAge(19);
        assertEquals(19, human.getAge());
    }

    @Test
    void getName() {
        assertEquals("Natalia", createHuman().getName());
    }

    @Test
    void setName_ArgumentIsNULL_DoesNotSetUpName() {
        Human human = new Human();
        human.setName(null);
        String cousoleOutputStream = "";
        String result = "Name is incorrect\r\n";

        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream(200);
            PrintStream capture = new PrintStream(outputStream);
            System.setOut(capture);
            human.setName(null);
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
    void setName_ArgumentWithNumbersAndLetters_DoesNotSetUpName() {
        Human human = new Human();
        human.setName("123wfwef");
        String cousoleOutputStream = "";
        String result = "Name is incorrect\r\n";

        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream(200);
            PrintStream capture = new PrintStream(outputStream);
            System.setOut(capture);
            human.setName(null);
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
    void setName_WhenAreMoreThan12letters_DoesNotSetUpName() {
        Human human = new Human();
        human.setName("Asdfsgfegwewegegwgwgewg");
        String cousoleOutputStream = "";
        String result = "Name is incorrect\r\n";

        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream(200);
            PrintStream capture = new PrintStream(outputStream);
            System.setOut(capture);
            human.setName(null);
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
    void setName_WhenBeginningТameSmallLetter_DoesNotSetUpName() {
        Human human = new Human();
        human.setName("wgwgewg");
        String cousoleOutputStream = "";
        String result = "Name is incorrect\r\n";

        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream(200);
            PrintStream capture = new PrintStream(outputStream);
            System.setOut(capture);
            human.setName(null);
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
    void setName_ArgumentPositive_NotSetUpName() {
        Human human = new Human();
        human.setName("Agwgewg");
        assertEquals("Agwgewg", human.getName());
    }

    @Test
    void getSurname() {
        assertEquals("Zolotareva", createHuman().getSurname());
    }

    @Test
    void setSurname_ArgumentPositive_NotSetUpSurname() {
        Human human = new Human();
        human.setSurname("Agwgewg");
        assertEquals("Agwgewg", human.getSurname());
    }

    @Test
    void setName_ArgumentIsNULL_DoesNotSetUpSurname() {
        Human human = new Human();
        String cousoleOutputStream = "";
        String result = "Name is incorrect\r\n";

        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream(200);
            PrintStream capture = new PrintStream(outputStream);
            System.setOut(capture);
            human.setSurname(null);
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
    void setName_ArgumentWithNumbersAndLetters_DoesNotSetUpSurname() {
        Human human = new Human();

        String cousoleOutputStream = "";
        String result = "Name is incorrect\r\n";

        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream(200);
            PrintStream capture = new PrintStream(outputStream);
            System.setOut(capture);
            human.setName("123wfwef");
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
    void setName_WhenAreMoreThan12letters_DoesNotSetUpSurname() {
        Human human = new Human();
        human.setName("Asdfsgfegwewegegwgwgewg");
        String cousoleOutputStream = "";
        String result = "Name is incorrect\r\n";

        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream(200);
            PrintStream capture = new PrintStream(outputStream);
            System.setOut(capture);
            human.setName(null);
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
    void setName_WhenBeginningТameSmallLetter_DoesNotSetUpSurname() {
        Human human = new Human();
        String cousoleOutputStream = "";
        String result = "Name is incorrect\r\n";

        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream(200);
            PrintStream capture = new PrintStream(outputStream);
            System.setOut(capture);
            human.setName("wgwgewg");
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
    void getGender() {
        assertEquals(Gender.WOMAN, createHuman().getGender());
    }

    @Test
    void setGender() {
        Human human = new Human();
        human.setGender(Gender.MAN);
        assertEquals(Gender.MAN, human.getGender());
    }

    @Test
    void testToString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(createHuman().getSurname() + " ");
        stringBuilder.append(createHuman().getName() + " ");
        stringBuilder.append(createHuman().getGender() + " ");
        stringBuilder.append(createHuman().getAge());
        assertEquals(stringBuilder.toString(), createHuman().toString());
    }
}