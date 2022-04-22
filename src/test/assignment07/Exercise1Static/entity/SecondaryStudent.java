package test.assignment07.Exercise1Static.entity;

public class SecondaryStudent extends Student {
    private static int secondaryStudentCounter = 0;
    private int id;
    public SecondaryStudent(String name) {
        super(name);
//        if (counter > 7) return;
//        this.id = ++secondaryStudentCounter;
        if (counter > 7)
            return;
        else
            this.id = ++secondaryStudentCounter;
    }

    public static int getSecondaryStudentCounter() {
        return secondaryStudentCounter;
    }

    @Override
    public String toString() {
        return "SecondaryStudent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
