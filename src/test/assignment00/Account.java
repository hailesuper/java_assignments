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

