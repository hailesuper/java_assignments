package test.assignment00;

import java.time.LocalDate;
import java.util.Arrays;

public class Group {
    public int groupID;
    public String groupName;
    public Account creator;
    public LocalDate createDate;
    public Account[] accounts;

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
