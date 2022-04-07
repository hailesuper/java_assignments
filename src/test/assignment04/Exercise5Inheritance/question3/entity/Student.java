package test.assignment04.Exercise5Inheritance.question3.entity;

public abstract class Student extends Person {
    protected int id;

    public Student(int id, String name) {
        super(name);
        this.id = id;
    }
}
