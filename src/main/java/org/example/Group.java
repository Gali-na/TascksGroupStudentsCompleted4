package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Group {
    private String name;
    private Set<Student> studentList;
    private static int numberStudents = 0;

    public Group() {
        studentList = new HashSet<Student>(10);
    }

    public Set<Student> getStudentList() {
        return studentList;
    }

    public String getName() {
        return name;
    }



    public static void setNumberStudents(int numberStudents) {
        Group.numberStudents = numberStudents;
    }

    public void setName(String name) {
        this.name = name;
    }

    private boolean groupVerification() {
        if(this.getName()!=null){
            return true;
        }
        return false;
    }

    private boolean studentVerification(Student student) {
        if (student != null
                && student.getAge() != 0
                && student.getName() != null
                && student.getSurname() != null
                && student.getGender() != null
                &&(student.averageRating>1 )
                &&( student.averageRating<=5)) {
            return true;
        }
        return false;
    }

    public String addStudent(Student student) {
        String rezult = "The student's details are incorrect, the student was not added to the group";
         if (numberStudents == 10) {
            rezult = "Group is full";
        }
        if (studentVerification(student) == true
                && groupVerification()==true
                && numberStudents <10) {
            studentList.add(student);
          ++ numberStudents;
            rezult = "Student successfully added";
        }

        if(groupVerification()==false) {
            rezult="Group created without naming, student cannot be added";
        }
        return rezult;
    }

    public String removeStudent(Student student) {
        String rezult = "This student is not in the group";
        if (studentVerification(student) == true
            && groupVerification()==true){
            Iterator<Student> iterator = this.studentList.iterator();
            while (iterator.hasNext()) {
                if( iterator.next().equals(student)) {
                    iterator.remove();
                }
            }
            rezult = "Student successfully removed";
        }
        if( groupVerification()==false) {
           rezult= "Group created without naming, student cannot be removd";
        }
        return rezult;
    }
    public ArrayList<Student> searchStudentBySurname (String surname){
        ArrayList<Student> students = new ArrayList<Student>();
        Iterator<Student> iterator=this.studentList.iterator();
        while (iterator.hasNext()) {
           Student student1= iterator.next();
           if(student1.getSurname().equals(surname)){
               students.add(student1);
           }
        }
        return students;
    }

    @Override
    public String toString() {
        StringBuilder students= new StringBuilder();
        Iterator<Student> iterator=this.studentList.iterator();
        while (iterator.hasNext()) {
            Student student1 = iterator.next();
           students.append(student1.toString()+"\n");
        }
        return students.toString();
    }
}
