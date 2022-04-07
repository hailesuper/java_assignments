package test.assignment04.Exercise5Inheritance.question1_question2.entity;

public class OfficeStaff extends Employee {
    private String duty;
    public OfficeStaff(String fullName, int age, Gender gender, String address, String duty) {
        super(fullName, age, gender, address);
        this.duty = duty;
    }

    public OfficeStaff(String fullName, int age, Gender gender, String duty) {
        super(fullName, age, gender);
        this.duty = duty;
    }

    @Override
    public String toString() {
        return "OfficeStaff{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", address='" + address + '\'' +
                ", duty='" + duty + '\'' +
                '}';
    }
}
