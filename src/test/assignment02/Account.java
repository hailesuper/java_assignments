package test.assignment02;

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

//    private static final Set<WeakReference<Account>> instances =
//            Sets.newSetFromMap(new IdentityHashMap<WeakReference<Account>>());
//
//    public Account() {
//        synchronized(Account.class) {
//            instances.add(new WeakReference(this));
//        }
//    }

// etc the same in all constructors

// etc the same in all constructors

}

