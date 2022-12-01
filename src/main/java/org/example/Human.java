package org.example;

import org.example.Gender;

import java.util.regex.Pattern;

public class Human {
    private  int age;
    private String name;
    private  String surname;
    private Gender gender;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<18 || age >120) {
            System.out.println("Age is incorrect");
            return;
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        Pattern p = Pattern.compile("[A-Z]{1}[a-z]{1,12}");
        if(p.matcher(name).matches()) {
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
        if(p.matcher(surname).matches()) {
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
        stringBuilder.append(this.surname+" ");
        stringBuilder.append(this.name+ " ");
        stringBuilder.append(this.gender+ " ");
        stringBuilder.append(this.age);
        return stringBuilder.toString();
    }
}
