package test.assignment05.Exercise2Polymorphism.Question2.front_end;

import test.assignment05.Exercise2Polymorphism.Question2.entity.Person;
import test.assignment05.Exercise2Polymorphism.Question2.entity.Student;

public class Main {
    public static void main(String[] args) {
        Person student = new Student();
        student.inputInfo();
        ((Student) student).isQualifiedForScholarship();
        student.showInfo();
    }
}
