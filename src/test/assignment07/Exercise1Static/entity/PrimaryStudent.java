package test.assignment07.Exercise1Static.entity;

public class PrimaryStudent extends Student {
    private static int primaryStudentCounter = 0;
    private int id;
    public PrimaryStudent(String name) {
        super(name);
        if (counter > 7) return;
        this.id = ++primaryStudentCounter;
    }

    public static int getprimaryStudentCounter() {
        return primaryStudentCounter;
    }

    @Override
    public String toString() {
        return "PrimaryStudent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
