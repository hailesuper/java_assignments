package test.assignment02;

import java.time.LocalDate;

public class Exercise1 {
    public static void main(String[] args) {
        // Departments
        Department department1 = new Department();
        department1.departmentID = 1;
        department1.departmentName = "Ban giám đốc";

        Department department2 = new Department();
        department1.departmentID = 2;
        department1.departmentName = "Marketing";

        Department department3 = new Department();
        department1.departmentID = 3;
        department1.departmentName = "Sales";


        // Positions
        Position position1 = new Position();
        Position position2 = new Position();
        Position position3 = new Position();
        Position position4 = new Position();

        position1.positionID = 1;
        position2.positionID = 2;
        position3.positionID = 3;
        position4.positionID = 4;

        position1.positionName = "Dev";
        position2.positionName = "Test";
        position3.positionName = "Scrum Master";
        position4.positionName = "PM";

        // Accounts
        Account account1 = new Account();
        Account account2 = new Account();
        Account account3 = new Account();
        Account account4 = new Account();

        account1.accountID = 1;
        account1.accountID = 2;
        account1.accountID = 3;
        account1.accountID = 4;

        account1.createDate = LocalDate.of(2020,03,22);
        account2.createDate = LocalDate.of(2021,11,2);
        account3.createDate = LocalDate.of(2022,03,06);
        account4.createDate = LocalDate.now();

        account1.department = department1;
        account2.department = department1;
        account3.department = department2;
        account4.department = department3;

        account1.email = "kattie.corkery@yahoo.com";
        account2.email = "aleen57@hotmail.com";
        account3.email = "grimes.alek@hotmail.com";
        account4.email = "cleveland.schneider@williamson.com";

        account1.fullName = "Phạm Thiên An";
        account2.fullName = "Trần Ngọc Bảo";
        account3.fullName = "Hoàng Nguyễn Phúc Nguyên Chương";
        account4.fullName = "Nguyễn Thanh Danh";

        account1.position = position1;
        account2.position = position2;
        account3.position = position1;
        account4.position = position4;

        account1.username = "dutyhungarian";
        account1.username = "toupeeaustralian";
        account1.username = "bowyangslovakian";
        account1.username = "rickshawliberian";

        // Groups
        Group group1 = new Group();
        group1.groupID = 1;
        group1.groupName = "Dumbledore' Army.";
        group1.creator = account1;
        group1.createDate = LocalDate.of(2022,9,12);
        group1.accounts = new Account[] {account1, account2};

        Group group2 = new Group();
        group2.groupID = 2;
        group2.groupName = "The Nerd Herd   1";
        group2.creator = account2;
        group2.createDate = LocalDate.now();
        group2.accounts = new Account[] {account1, account3};


        Group group3 = new Group();
        group3.groupID = 3;
        group3.groupName = "Fantastic Four";
        group3.creator = account1;
        group3.createDate = LocalDate.of(2021,7,12);
        group3.accounts = new Account[] {account3};

        // Run methods
        System.out.println("--QUESTION 1 --");
        checkDepartment(account2);

        System.out.println("--QUESTION 3 --");
        checkDepartment2(account3);

        System.out.println("--QUESTION 4 --");
        checkDev(account1);

        System.out.println("--QUESTION 5 --");
        checkNumbersOfAccountsInGroup(group1);

        System.out.println("--QUESTION 6 --");


        System.out.println("--QUESTION 7 --");
        checkDev2(account1);
        checkDev2(account4);


        System.out.println("--QUESTION 8 --");

        System.out.println("--QUESTION 15 --");
        printEvenLessThan(20);





    }

    // Question 1
    public static void checkDepartment(Account account) {
        if (account.department.departmentName == null)
            System.out.println("Nhân viên này chưa có phòng ban");
        else
            System.out.println("Phòng ban của nhân viên này là " + account.department.departmentName);
    }

    // Question 2

    // Question 3
    public static void checkDepartment2(Account account) {
        String output;
        output = (account.department.departmentName == null) ? "Nhân viên này chưa có phòng ban" :
                "Phòng ban của nhân viên này là " + account.department.departmentName;
        System.out.println(output);
    }

    // Question 4
    public static void checkDev(Account account) {
        System.out.println(
                (account.position.positionName == "Dev") ?
                "Đây là Developer" :
                "Người này không phải Developer"
        );

    }

    // Question 5
    public static void checkNumbersOfAccountsInGroup(Group group) {
        switch (group.accounts.length) {
            case 1:
                System.out.println("Nhóm có 1 thành viên");
                break;
            case 2:
                System.out.println("Nhóm có 2 thành viên");
                break;
            case 3:
                System.out.println("Nhóm có 3 thành viên");
                break;
            default:
                System.out.println("Nhóm có nhiều thành viên");
        }
    }

    // Question 6


    // Question 7
    public static void checkDev2(Account account) {
        switch (account.position.positionName) {
            case "Dev":
                System.out.println("Developer là em");
                break;
            default:
                System.out.println("Ngấy code lắm rồi! " +
                        "Giờ em chuyển qua " + account.position.positionName);
        }
    }

    // Question 8: đang import library để join các object trong class

    // Question 9: đang import library để join các object trong class

    // Question 10: đang import library để join các object trong class

    // Question 11: đang import library để join các object trong class

    // Question 12: đang import library để join các object trong class

    // Question 13: đang import library để join các object trong class

    // Question 14: đang import library để join các object trong class

    // Question 15
    public static void printEvenLessThan(int number) {
        for (int i = 0; i <= number; i += 2) {
            System.out.print(i + " ");
        }
    }



    // Question 16


    // Question 17
}



