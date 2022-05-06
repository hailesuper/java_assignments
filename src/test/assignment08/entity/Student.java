package test.assignment08.entity;

public class Student {
    private static int counter;
    private int id;
    private String name;

    public Student(String name) {
        id = ++counter;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
