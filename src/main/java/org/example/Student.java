package org.example;

import java.util.Objects;

public class Student extends Human {
    int averageRating;

    public Student() {
        super();
    }

    public int getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(int averageRating) {
        if (averageRating <= 5 && averageRating >= 1) {
            this.averageRating = averageRating;
        } else {
            System.out.println("Rating entered incorrectly");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return getAverageRating() == student.getAverageRating();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getAverageRating());
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(super.toString());
        stringBuilder.append(this.averageRating);
        return stringBuilder.toString();
    }
}
