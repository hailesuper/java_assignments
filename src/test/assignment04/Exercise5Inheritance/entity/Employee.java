package test.assignment04.Exercise5Inheritance.entity;


public class Employee {
    protected String fullName;
    protected byte age;
    public enum Gender {
        MALE,
        FEMALE,
        UNKNOWN
    }
    protected Gender gender;
    protected String address;

    public Employee(String fullName, int age, Gender gender, String address) {
        this.fullName = fullName;
        this.age = (byte) age;
        this.gender = gender;
        this.address = address;
    }

    public Employee(String fullName, int age, Gender gender) {
        this.fullName = fullName;
        this.age = (byte) age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", address='" + address + '\'' +
                '}';
    }
}
