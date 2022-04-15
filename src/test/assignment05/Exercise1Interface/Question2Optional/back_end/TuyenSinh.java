package test.assignment05.Exercise1Interface.Question2Optional.back_end;

import test.assignment05.Exercise1Interface.Question2Optional.entity.ExamComposition;
import test.assignment05.Exercise1Interface.Question2Optional.entity.ITuyenSinh;
import test.assignment05.Exercise1Interface.Question2Optional.entity.Student;

import java.util.ArrayList;
import java.util.List;

import static test.assignment05.Exercise1Interface.Question2Optional.back_end.Utilities.*;
import static test.assignment05.Exercise1Interface.Question2Optional.entity.Student.*;

public class TuyenSinh implements ITuyenSinh {
    private List<Student> students = new ArrayList<>();

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public void addStudent() {
        var student = new Student(inputID(),inputName(),inputAddress(),
                inputPriorityLevel(), inputExamComposition());
        students.add(student);
    }

    @Override
    public void showStudentInfo() {
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }

    @Override
    public void searchByID() {
        System.out.print("MSSV thí sinh: ");
        int searchingID = scanIntIn();
        boolean isFound = false;
        for (Student student : students) {
            if (student.getID() == searchingID) {
                System.out.println("Thông tin thí sinh");
                System.out.println(student.toString());
                isFound = true;
                break;
            }
        }
        if (!isFound)
            System.out.println("Không có thí sinh " + searchingID);
    }

    @Override
    public void exit() {
        System.exit(0);
    }

    // Sub-methods
    private static int inputID() {
        System.out.print("ID: ");
        return scanIntIn();
    }

    private static String inputName() {
        System.out.print("Họ tên: ");
        return scanner.nextLine();
    }

    private static String inputAddress() {
        System.out.print("Địa chỉ: ");
        return scanner.nextLine();
    }

    private static byte inputPriorityLevel() {
        System.out.print("Mức ưu tiên: ");
        return scanByteIn();
    }

    private static ExamComposition inputExamComposition() {
        String select;
        while (true) {
            System.out.println("Khối thi (A, B, C): ");
            select = scanner.nextLine().trim().toLowerCase();
            if (select.equals("a"))
                return examCompositionA;
            else if (select.equals("b"))
                return examCompositionB;
            else if (select.equals("c"))
                return examCompositionC;
            else
                System.out.println("Tuyển sinh đủ mệt rồi. Đừng nhây.");
        }
    }
}
