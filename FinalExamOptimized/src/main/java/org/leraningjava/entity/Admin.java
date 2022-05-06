package org.leraningjava.entity;

public class Admin extends User {
    private byte expInYear;
    public Admin(int ID, String fullName, String email) {
        super(ID, fullName, email);
        this.role = Role.ADMIN;
    }

    public Admin(int ID, String fullName, String email, int expInYear) {
        super(ID, fullName, email);
        this.expInYear = (byte) expInYear;
        this.role = Role.ADMIN;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "ID=" + ID +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", role=" + role +
                ", expInYear=" + expInYear +
                '}';
    }
}
