package test.assignment05.Exercise2Polymorphism.Question1.front_end;

import test.assignment05.Exercise2Polymorphism.Question1.entity.Student;

import java.io.FileNotFoundException;

import static Utilities.Utilities.scanIntIn;
import static Utilities.Utilities.scanner;
import static test.assignment05.Exercise2Polymorphism.Question1.back_end.StudentManagement.*;

public class Main {
     public static void main(String[] args) throws FileNotFoundException {
        boolean isDone = false;
        while (!isDone) {
            printInstruction();
            System.out.print("Lựa chọn: ");
            int select = scanIntIn();
            switch (select) {
                case 1:
                    createStudents(10);
                    break;
                case 2:
                    for (Student student : students)
                        student.diemDanh();
                    break;
                case 3:
                    for (Student student : students)
                        if (student.getGroup() == 1)
                            student.hocBai();
                    break;
                case 4:
                    for (Student student : students)
                        if (student.getGroup() == 2)
                            student.donVeSinh();
                    break;
                case 5:
                    isDone = true;
                    scanner.close();
                    System.out.println("---------- KẾT THÚC ----------");
                    break;
                default:
                    System.out.println("Mày đùa tao à?");
                    break;
            }
        }

    }
}
