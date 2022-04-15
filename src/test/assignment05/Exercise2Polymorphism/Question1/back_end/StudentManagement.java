package test.assignment05.Exercise2Polymorphism.Question1.back_end;

import test.assignment05.Exercise2Polymorphism.Question1.entity.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class StudentManagement {
    public static List<Student> students = new ArrayList<>();
    public static void printInstruction() {
        System.out.println("---------- BẮT ĐẦU ----------");
        System.out.println("1. Tạo 10 học sinh, chia thành 3 nhóm.");
        System.out.println("2. Kêu gọi cả lớp điểm danh.");
        System.out.println("3. Gọi nhóm 1 đi học bài");
        System.out.println("4. Gọi nhóm 2 đi dọn vệ sinh");
        System.out.println("5. Kết thúc chương trình");
        System.out.println("-----------------------------");
    }

    public static void createStudents(int amount) throws FileNotFoundException {
        for (int i=0; i<amount; i++) {
            int randomGroup = (int) (Math.random() * 3 + 1);
            Student student = new Student(generateRandomName(),randomGroup);
            System.out.println(student.toString()); // test
            students.add(student);
        }
    }

    public static String generateRandomName() throws FileNotFoundException {
        Scanner scannerFile = new Scanner(new File("src/Data/names.txt"));
        List<String> nameList = new ArrayList<>();
        while (scannerFile.hasNext()) {
            nameList.add(scannerFile.nextLine());
        }
        return nameList.get((int) (Math.random() * nameList.size()));
    }
}
