package test.assignment04.Exercise5Inheritance.entity;

public class Engineer extends Employee {
    private String specialization;
    public Engineer(String fullName, int age, Gender gender, String address, String specialization) {
        super(fullName, age, gender, address);
        this.specialization = specialization;
    }

    public Engineer(String fullName, int age, Gender gender, String specialization) {
        super(fullName, age, gender);
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", address='" + address + '\'' +
                ", specialization='" + specialization + '\'' +
                '}';
    }
}
