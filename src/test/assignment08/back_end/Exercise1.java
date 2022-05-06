package test.assignment08.back_end;

import test.assignment08.entity.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static test.assignment08.back_end.Utilities.scanIntIn;
import static test.assignment08.back_end.Utilities.scanner;

public class Exercise1 {
    public void question1() {
        Student[] students = new Student[5];
        students[0] = new Student("Hai 1");
        students[1] = new Student("Hai 1");
        students[2] = new Student("Hai 1");
        students[3] = new Student("Hai 2");
        students[4] = new Student("Hai 3");

        List<Student> studentList = new ArrayList<>();
        studentList = new ArrayList<>(Arrays.asList(students)) ;


        System.out.println("Tổng số student " + studentList.size());
        System.out.println("Student thứ 4: " + studentList.get(3));
        System.out.println("Student đầu: " + studentList.get(0) + "\n" +
                "Student cuối: " + studentList.get(students.length - 1));
        var firstStudent = new Student("Hải Đầu");
        studentList.add(0,firstStudent);
        var lastStudent = new Student("Hải Cuối");
        studentList.add(lastStudent);
        System.out.println("-----------------------------");
        printList(studentList);
        System.out.println("-----------------------------");
        System.out.println("Đảo ngược");
        Collections.reverse(studentList);
        printList(studentList);
        System.out.println("-----------------------------");
        System.out.print("ID Student muốn tìm: ");
        var findStudent = findStudentByID(studentList, scanIntIn());
        if (findStudent != null)
            System.out.println(findStudent);
        else
            System.out.println("Không tìm thấy student");
        System.out.println("-----------------------------");
        System.out.print("Tên Student muốn tìm: ");
        var findStudents = findStudentByName(studentList, scanner.nextLine());
        if (findStudents.size() != 0)
            printList(findStudents);
        else
            System.out.println("Không tìm thấy student");

    }

    public Student findStudentByID(List<Student> students, int searchID) {
        for (Student student : students)
            if (student.getId() == searchID)
                return student;
        return null;
    }

    public List<Student> findStudentByName(List<Student> students, String searchName) {
        List<Student> findStudents = new ArrayList<>();
        for (Student student : students)
            if (student.getName().equals(searchName))
                findStudents.add(student);
        return findStudents;
    }

    public

    private <E> void printList(List<E> list) {
        for (E e : list) {
            System.out.println(e);
        }
    }
}
