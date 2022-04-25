package test.assignment09.entity;

public class Student {
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

    public String getStudentID() {
        return "MSSV" + id;
    }

    /**
     * @deprecated and replaced by {@link #getStudentID()}
     */
    @Deprecated
    public int getId() {
        return id;
    }
}
