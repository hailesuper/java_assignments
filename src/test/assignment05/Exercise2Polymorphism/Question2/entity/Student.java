package test.assignment05.Exercise2Polymorphism.Question2.entity;

import static Utilities.Utilities.*;

public class Student extends Person {
    private int id;
    private float gpa;
    private String email;
    // Methods
    @Override
    public void inputInfo() {
        this.id = inputID();
        this.gpa = inputGPA();
        this.email = inputEmail();
        super.inputInfo();
    }

    @Override
    public void showInfo() {
        System.out.println(
                "Student{" +
                        "name='" + name + '\'' +
                        ", gender=" + gender +
                        ", birthDate=" + birthDate +
                        ", address='" + address + '\'' +
                        ", id=" + id +
                        ", gpa=" + gpa +
                        ", email='" + email + '\'' +
                        '}'
        );
    }

    public boolean isQualifiedForScholarship() {
        boolean isQualified = this.gpa >= 8;
        if (isQualified)
            System.out.println("Được học bổng");
        else
            System.out.println("Không học bổng");
        return isQualified;
    }

    // Sub-methods
    public static int inputID() {
        System.out.print("MSSV: ");
        return scanIntIn();
    }

    public static float inputGPA() {
        System.out.print("GPA: ");
        return (float) scanDoubleIn();
    }

    public static String inputEmail() {
        System.out.print("Email: ");
        return scanner.nextLine();
    }
}
