package test.assignment04.Exercise4Encapsulation.entity;

public class Student {
    private int id;
    private String name;
    private String homeTown;
    private byte gpa;

    public Student(String name, String homeTown) {
        this.name = name;
        this.homeTown = homeTown;
    }

    public void setGPA(int gpa) {
        this.gpa = (byte) gpa;
    }

    public void plusGPA(int extraPoint) {
        this.gpa += extraPoint;
    }

    public void printStudentInfo() {
        String gpaDescription;
        if (gpa < 4)
            gpaDescription = "Yếu";
        else if (gpa < 6)
            gpaDescription = "Trung bình";
        else if (gpa < 8)
            gpaDescription = "Khá";
        else gpaDescription = "Giỏi";
        System.out.println(
                "Student{" + '\n' +
                        "name='" + name + '\n' +
                        "GPA=" + gpa + '\n' +
                        "GPA description =" + gpaDescription + '\n' +

                        '}'
        );
    }
}
