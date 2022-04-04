package test.assignment00;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Group {
    public int groupID;
    public String groupName;
    public Account creator;
    public LocalDate createDate;
    public Account[] accounts;

    public Group() {
    }

    public Group(String groupName, Account creator, LocalDate createDate, Account[] accounts) {
        this.groupName = groupName;
        this.creator = creator;
        this.createDate = createDate;
        this.accounts = accounts;
    }

    public Group(String groupName, Account creator, LocalDate createDate, String[] usernames) {
        this.groupName = groupName;
        this.creator = creator;
        this.createDate = createDate;
        List<Account> accountList = new ArrayList<>();
        for (String username : usernames) {
            Account account = new Account();
            account.username = username;
            accountList.add(account);
        }
        Account[] accounts = new Account[accountList.size()];
        accounts = accountList.toArray(accounts);
        this.accounts = accounts;
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupID=" + groupID +
                ", groupName='" + groupName + '\'' +
                ", creator=" + creator +
                ", createDate=" + createDate +
                ", accounts=" + Arrays.toString(accounts) +
                '}';
    }
}
