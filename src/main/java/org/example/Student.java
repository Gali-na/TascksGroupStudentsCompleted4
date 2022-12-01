package org.example;

public class Student extends Human {
   int averageRating;

    public Student() {
       super();
    }

    public int getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(int averageRating) {
         if(averageRating<=5 && averageRating>=1) {
             this.averageRating = averageRating;
         }else {
             System.out.println("Rating entered incorrectly");
         }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder( super.toString());
        stringBuilder.append(" "+averageRating);
        return stringBuilder.toString();
    }
}
