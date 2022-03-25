package test.assignment01;

import java.time.LocalDate;
import java.util.Arrays;

public class Account {
    int accountID;
    String email;
    String username;
    String fullName;
    Department department;
    Position position;
    LocalDate createDate;
    Group[] groups;

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

