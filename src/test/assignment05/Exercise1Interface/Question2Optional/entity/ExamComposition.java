package test.assignment05.Exercise1Interface.Question2Optional.entity;

import java.util.Arrays;

public class ExamComposition {
    private String name;
    Subject[] subjects;

    public ExamComposition(String name, Subject[] subjects) {
        this.name = name;
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public String getSubjects() {
        return Arrays.toString(this.subjects);
    }
}
