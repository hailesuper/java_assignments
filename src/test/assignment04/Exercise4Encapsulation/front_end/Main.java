package test.assignment04.Exercise4Encapsulation.front_end;

import test.assignment04.Exercise4Encapsulation.entity.Student;

public class Main {
    public static void main(String[] args) {
        Student hai = new Student("Lê Văn Hải", "Vũng Tàu");
        hai.setGPA(90);
        hai.plusGPA(10);
        hai.printStudentInfo();
    }

}
