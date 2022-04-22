package test.assignment07.Exercise1Static.back_end;

import test.assignment07.Exercise1Static.entity.*;

import java.util.ArrayList;
import java.util.List;

import static test.assignment07.Exercise1Static.back_end.Utilities.scanIntIn;

public class Exercise1 {
    public static List<Student> students = new ArrayList<>();
    public void question1() {
        add3Students();
        System.out.println("Đại học Bách Khoa");
        Student.setCollege("Đại học Bách Khoa");
        printStudentList();
        System.out.println("==========================");

        System.out.println("Đại học công nghệ");
        Student.setCollege("Đại học công nghệ");
        printStudentList();
    }

    public void question2() {
        for (Student student : students) {
            System.out.println(student.getName() + " nộp 100k");
            student.addGroupMoney(100_000);
        }

        System.out.println(students.get(0).getName() +
                "lấy 50k đi mua bim bim, kẹo về liên hoan");
        students.get(0).addGroupMoney(-50_000);

        System.out.println(students.get(1).getName() +
                "lấy 20k đi mua bánh mì");
        students.get(1).addGroupMoney(-20_000);

        System.out.println(students.get(2).getName() +
                "lấy 150k đi mua đồ dùng học tập cho nhóm");
        students.get(2).addGroupMoney(-150_000);

        for (Student student : students) {
            System.out.println(student.getName() + " nộp 50k");
            student.addGroupMoney(50_000);
        }
    }

    public void question3() {
        System.out.print("Số nguyên thứ 1: ");
        int a = scanIntIn();
        System.out.print("Số nguyên thứ 2: ");
        int b = scanIntIn();
        System.out.println("---------- BẮT ĐẦU ----------");
        System.out.println("1. max().");
        System.out.println("2. min().");
        System.out.println("3. sum().");
        System.out.println("-----------------------------");

        System.out.print("Lựa chọn: ");
        int select = scanIntIn();
        switch (select) {
            case 1 -> System.out.println("max = " + MyMath.max(a,b));
            case 2 -> System.out.println("min = " + MyMath.min(a,b));
            case 3 -> System.out.println("sum = " + MyMath.sum(a,b));
            default -> System.out.println("Tự chơi đi mày!");
        }
    }

    public void question6() {
        add6Students();
        System.out.println("Số lượng Primary Student: " +
                PrimaryStudent.getprimaryStudentCounter());
        for (Student student : students)
            if (student instanceof PrimaryStudent)
                System.out.println((PrimaryStudent)student);
        System.out.println("-----------------");
        System.out.println("Số lượng Secondary Student: " +
                SecondaryStudent.getSecondaryStudentCounter());
        for (Student student : students)
            if (student instanceof SecondaryStudent)
                System.out.println(student);
        System.out.println("-----------------");
        System.out.println("Số lượng Student: " +
                Student.getCounter());
    }

    public void question9() {
        var tron1 = new HinhTron(1.2);
        var tron2 = new HinhTron(2);
        for (int i = 0; i < Configs.SO_LUONG_TOI_DA + 1; i++)
           new HinhChuNhat(i+1, i);
    }

    public void add3Students() {
        var student1 = new Student("Nguyễn Văn A");
        var student2 = new Student("Nguyễn Văn B");
        var student3 = new Student("Nguyễn Văn C");
        students.add(student1);
        students.add(student2);
        students.add(student3);
    }

    public void add6Students() {
        Student student1 = new PrimaryStudent("Nguyễn Văn E");
        Student student2 = new PrimaryStudent("Nguyễn Văn F");
        Student student3 = new SecondaryStudent("Nguyễn Văn G");
        Student student4 = new SecondaryStudent("Nguyễn Văn H");
        Student student5 = new SecondaryStudent("Nguyễn Văn I");
        Student student6 = new SecondaryStudent("Nguyễn Văn K");
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

    }

    public void printStudentList() {
        for (Student student : students)
            System.out.println(student);
    }


}
