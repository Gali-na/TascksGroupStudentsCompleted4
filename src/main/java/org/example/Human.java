package org.example;

import java.util.Objects;
import java.util.regex.Pattern;

public class Human {
    private int age;
    private String name;
    private String surname;
    private Gender gender;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 17 || age > 120) {
            System.out.println("Age is incorrect");
            return;
        }
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Human human = (Human) o;
        return getAge() == human.getAge()
                && getName().equals(human.getName())
                && getSurname().equals(human.getSurname())
                && getGender() == human.getGender();
    }

    @Override
    public int hashCode() {

        return Objects.hash(getAge(), getName(), getSurname(), getGender());
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        Pattern p = Pattern.compile("[A-Z]{1}[a-z]{1,12}");
        if (name != null && p.matcher(name).matches()) {
            this.name = name;
        } else {
            System.out.println("Name is incorrect");
        }
    }

    public String getSurname() {

        return surname;
    }

    public void setSurname(String surname) {
        Pattern p = Pattern.compile("[A-Z]{1}[a-z]{1,12}");
        if (p.matcher(surname).matches()) {
            this.surname = surname;
        } else {
            System.out.println("Surname is incorrect");
        }
    }

    public Gender getGender() {

        return gender;
    }

    public void setGender(Gender gender) {

        this.gender = gender;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.surname + " ");
        stringBuilder.append(this.name + " ");
        stringBuilder.append(this.gender + " ");
        stringBuilder.append(this.age + " ");
        return stringBuilder.toString();
    }
}
