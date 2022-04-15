package test.assignment05.Exercise1Interface.Question2Optional.entity;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

enum Subject {MATH, PHYSICS, CHEMISTRY, BIOLOGY,
    LITERATURE, HISTORY, GEOGRAPHY};

public class Student {
    public static final ExamComposition examCompositionA =
            new ExamComposition("A", new Subject[]{Subject.MATH, Subject.PHYSICS, Subject.CHEMISTRY});
    public static final ExamComposition examCompositionB =
            new ExamComposition("B", new Subject[]{Subject.MATH, Subject.CHEMISTRY, Subject.BIOLOGY});
    public static final ExamComposition examCompositionC =
            new ExamComposition("C", new Subject[]{Subject.LITERATURE, Subject.HISTORY, Subject.GEOGRAPHY});
    private int ID;
    private String name;
    private String address;
    private byte priorityLevel;
    private ExamComposition examComposition;
    float[] scores = new float[3];

    public Student(int ID, String name, String address, byte priorityLevel, ExamComposition examComposition) {
        this.ID = ID;
        this.name = name;
        this.address = address;
        this.priorityLevel = priorityLevel;
        this.examComposition = examComposition;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", priorityLevel=" + priorityLevel +
                ", examComposition=" + examComposition.getName()
                + " " + examComposition.getSubjects() +
                ", scores=" + Arrays.toString(scores) +
                '}';
    }

    public int getID() {
        return ID;
    }
}
