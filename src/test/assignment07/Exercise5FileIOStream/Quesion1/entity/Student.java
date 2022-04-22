package test.assignment07.Exercise5FileIOStream.Quesion1.entity;

import java.io.Serializable;

public class Student implements Serializable {
    private static int counter = 0;
    private int id;
    private String name;

    public Student(String name) {
        this.id = ++counter;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public String toStringForWriting() {
        return "Student " + id + ": \n" +
                "         ID: " + id + "\n" +
                "         Họ tên: " + name;
    }
}
