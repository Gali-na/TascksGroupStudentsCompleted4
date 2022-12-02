package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CommissarUniversity implements MilitaryCommissar {
    public List<Student> listManAfter18(Group group) {
        List<Student> listSrudent = new ArrayList<Student>();
        Iterator<Student> iteratorForSrudents = group.getStudentList().iterator();
        while (iteratorForSrudents.hasNext()) {
            Student student = iteratorForSrudents.next();
            if (student.getAge() > 18 && student.getGender() == Gender.MAN) {
                listSrudent.add(student);
            }
        }
        return listSrudent;
    }
}
