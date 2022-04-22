package test.assignment07.Exercise5FileIOStream.Quesion1.back_end;

import test.assignment07.Exercise5FileIOStream.Quesion1.entity.Student;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Exercise5 {
    public void run() {

    }
    public void question1() throws IOException {
        List<Student> students = new ArrayList<>();
        for (int i=0; i<3; i++) {
            var student = new Student("Lê Văn Hải " + i);
            students.add(student);
            System.out.println(student.toString());
        }
        System.out.println("Write to file as Objects");
        String objectFilePath = "C:\\Users\\La Van Hai\\Desktop\\Java\\VTI Java Assignments\\src\\test\\assignment07\\Exercise5FileIOStream\\Quesion1\\Data\\output.txt";
        var fileOutputStream = new FileOutputStream(objectFilePath);
        var objectOutputStream = new ObjectOutputStream(fileOutputStream);
        for (Student student : students) {
            objectOutputStream.writeObject(student);
        }
        objectOutputStream.close();
        System.out.println("-----Done-----");

        System.out.println("Write to file as Strings");
        String asStringFilePath = "C:\\Users\\La Van Hai\\Desktop\\Java\\VTI Java Assignments\\src\\test\\assignment07\\Exercise5FileIOStream\\Quesion1\\Data\\outputAsString.txt";
        fileOutputStream = new FileOutputStream(asStringFilePath);
        for (Student student : students) {
            fileOutputStream.write(student.toStringForWriting().getBytes());
            fileOutputStream.write("\n".getBytes());

        }

    }
}
