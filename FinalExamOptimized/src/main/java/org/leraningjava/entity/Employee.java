package org.leraningjava.entity;

public class Employee extends User {
    private String proSkill;
    public Employee(int ID, String fullName, String email) {
        super(ID, fullName, email);
        this.role = Role.EMPLOYEE;
    }

    public Employee(int ID, String fullName, String email, String proSkill) {
        super(ID, fullName, email);
        this.proSkill = proSkill;
        this.role = Role.EMPLOYEE;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ID=" + ID +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", role=" + role +
                ", proSkill='" + proSkill + '\'' +
                '}';
    }

}
