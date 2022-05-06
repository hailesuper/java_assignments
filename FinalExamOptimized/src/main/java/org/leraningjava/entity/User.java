package org.leraningjava.entity;

public class User {
    protected int ID;
    protected String fullName;
    protected String email;
    protected String password;
    public enum Role {ADMIN, EMPLOYEE};
    protected Role role;

    public User() {
    }

    public User(int ID, String fullName, String email) {
        this.ID = ID;
        this.fullName = fullName;
        this.email = email;
    }

    public int getID() {
        return ID;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public Role getRole() {
        return role;
    }
}
