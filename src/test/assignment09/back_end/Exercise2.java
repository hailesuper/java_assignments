package test.assignment09.back_end;

import test.assignment09.entity.Student;

import java.time.LocalDateTime;
import java.util.Date;

public class Exercise2 {
    public void question1() {
        @SuppressWarnings("deprecation")
        Date date = new Date(18,5,2020);
    }

    public void question2() {
        var student = new Student("Hải");
        System.out.println(student.toString());
        System.out.println(student.getId());
        System.out.println(student.getStudentID());
    }
}
