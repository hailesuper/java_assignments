package test.assignment00;

import java.time.LocalDate;
import java.util.Arrays;

public class Account {
    public int accountID;
    public String email;
    public String username;
    public String fullName;
    public Department department;
    public Position position;
    public LocalDate createDate;
    public Group[] groups;
    public float salary;

    public Account() {
    }

    public Account(int accountID, String email, String username, String firstName, String lastName) {
        this.accountID = accountID;
        this.email = email;
        this.username = username;
        this.fullName = firstName + " " + lastName;
    }

    public Account(int accountID, String email, String username, String firstName, String lastName, Position position) {
        this.accountID = accountID;
        this.email = email;
        this.username = username;
        this.fullName = firstName + " " + lastName;
        this.position = position;
        this.createDate = LocalDate.now();
    }

    public Account(int accountID, String email, String username, String firstName, String lastName, Position position, LocalDate createDate) {
        this.accountID = accountID;
        this.email = email;
        this.username = username;
        this.fullName = firstName + " " + lastName;
        this.position = position;
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountID=" + accountID +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", fullName='" + fullName + '\'' +
                ", department=" + department +
                ", position=" + position +
                ", createDate=" + createDate +
                ", groups=" + Arrays.toString(groups) +
                '}';
    }
}

