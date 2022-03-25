package test.assignment02advanced;

import test.assignment00.*;

import java.util.SortedMap;

import static test.assignment00.Program.*;

public class Exercise1 {
    public static void main(String[] args) {
        System.out.println("----- Question 1 -----");
        System.out.println(accounts[1]);
        checkDepartment(accounts[1]); //

        System.out.println("----- Question 2 -----");

        System.out.println("----- Question 3 -----");
        System.out.println(accounts[1]);
        checkDepartment2(accounts[1]); // Question 3

        System.out.println("----- Question 4 -----");
        System.out.println(accounts[1].position);
        checkDev(accounts[1]); // Question 4

        System.out.println("----- Question 5 -----");
        Group[] groups = importGroup();
        for (int i=0; i < groups[0].accounts.length; i++)
            System.out.println(groups[0].accounts[i]);
        checkNumbersOfAccountsInGroup(groups[0]);

        System.out.println("----- Question 6 -----");

        System.out.println("----- Question 7 -----");
        System.out.println(accounts[1].position);
        checkDev2(accounts[1]);

        System.out.println("----- Question 8 -----");
//        printAccounts(); // NO child object -> NullPointerException

        System.out.println("----- Question 9 -----");
        printDepartments();

        System.out.println("----- Question 10 -----");
//        printAccountsUsingFor();

        System.out.println("----- Question 11 -----");
        printDepartmentsUsingFor();

        System.out.println("----- Question 12 -----");
//        printAccountsUsingForFirstTwo();

        System.out.println("----- Question 13 -----");
//        printAccountsUsingForExceptSecondOne();

        System.out.println("----- Question 14 -----");
        printEvenLessThan(20);
        System.out.println();

        System.out.println("----- Question 15 -----");








    }
    // Question 1
    public static void checkDepartment(Account account) {
        if (account.department == null)
            System.out.println("Nhân viên này chưa có phòng ban");
        else
            System.out.println("Phòng ban của nhân viên này là " + account.department.departmentName);
    }

    // Question 2
//    Kiểm tra account thứ 2
//    Nếu không có group thì sẽ in ra text "Nhân viên này chưa có group"
//    Nếu có mặt trong 1 hoặc 2 group thì sẽ in ra text "Group của nhân viên
//    này là Java Fresher, C# Fresher"
//    Nếu có mặt trong 3 Group thì sẽ in ra text "Nhân viên này là người
//    quan trọng, tham gia nhiều group"
//    Nếu có mặt trong 4 group trở lên thì sẽ in ra text "Nhân viên này là
//    người hóng chuyện, tham gia tất cả các group"


    // Question 3
//    Sử dụng toán tử ternary để làm Question 1
    public static void checkDepartment2(Account account) {
        String output;
        output = (account.department == null) ? "Nhân viên này chưa có phòng ban" :
                "Phòng ban của nhân viên này là " + account.department.departmentName;
        System.out.println(output);
    }

    // Question 4
//    Question 4:
//    Sử dụng toán tử ternary để làm yêu cầu sau:
//    Kiểm tra Position của account thứ 1
//    Nếu Position = Dev thì in ra text "Đây là Developer"
//    Nếu không phải thì in ra text "Người này không phải là Developer"
    public static void checkDev(Account account) {
        System.out.println(
                (account.position.positionName == Position.PositionName.DEV) ?
                "Đây là Developer" :
                "Người này không phải Developer"
        );

    }

    // Question 5
//    Lấy ra số lượng account trong nhóm thứ 1 và in ra theo format sau:
//    Nếu số lượng account = 1 thì in ra "Nhóm có một thành viên"
//    Nếu số lượng account = 2 thì in ra "Nhóm có hai thành viên"
//    Nếu số lượng account = 3 thì in ra "Nhóm có ba thành viên"
//    Còn lại in ra "Nhóm có nhiều thành viên"
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


    // Question 7 Sử dụng switch case để làm lại Question 4
    public static void checkDev2(Account account) {
        switch (account.position.positionName) {
            case DEV:
                System.out.println("Developer là em");
                break;
            default:
                System.out.println("Ngấy code lắm rồi! " +
                        "Giờ em chuyển qua " + account.position.positionName);
        }
    }

    // Question 8: đang import library để join các object trong class
//    Question 8:
//    In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của
//    họ

    public static void printAccounts() {
        for (Account account : accounts) {
            System.out.print(account.email + " "
                            + account.fullName + " "
                            + account.department.departmentName);
        }
    }
    // Question 9: đang import library để join các object trong class
//    In ra thông tin các phòng ban bao gồm: id và name
    public static void printDepartments() {
        for (Department department: departments) {
            System.out.println(department.departmentID +
                    " " + department.departmentName);
        }
    }
    // Question 10: đang import library để join các object trong class
//    Question 10:
//    In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của
//    họ theo định dạng như sau:
//    Thông tin account thứ 1 là:
//    Email: NguyenVanA@gmail.com
//    Full name: Nguyễn Văn A
//    Phòng ban: Sale
//    Thông tin account thứ 2 là:
//    Email: NguyenVanB@gmail.com
//    Full name: Nguyễn Văn B
//    Phòng ban: Marketting

    public static void printAccountsUsingFor() {
        for (int i=0; i<accounts.length; i++) {
            System.out.println("Thông tin account thứ " + (i+1) + " là: ");
            System.out.println("Email " + accounts[i].email);
            System.out.println("Full name " + accounts[i].fullName);
            System.out.println("Phòng ban " + accounts[i].department.departmentName);
        }
    }
    // Question 11: đang import library để join các object trong class
//    In ra thông tin các phòng ban bao gồm: id và name theo định dạng sau:
//    Thông tin department thứ 1 là:
//    Id: 1
//    Name: Sale
//    Thông tin department thứ 2 là:
//    Id: 2
//    Name: Marketing
    public static void printDepartmentsUsingFor() {
        for (int i=0; i<departments.length; i++) {
            System.out.println("Thông tin department thứ " + (i+1) + " là: ");
            System.out.println("    ID " + departments[i].departmentID);
            System.out.println("    Name " + departments[i].departmentName);
        }
    }
    // Question 12: đang import library để join các object trong class
//    Chỉ in ra thông tin 2 department đầu tiên theo định dạng như Question 10
    public static void printAccountsUsingForFirstTwo() {
        for (int i=0; i<accounts.length; i++) {
            if (i>1) break;
            System.out.println("Thông tin account thứ " + (i+1) + " là: ");
            System.out.println("Email " + accounts[i].email);
            System.out.println("Full name " + accounts[i].fullName);
            System.out.println("Phòng ban " + accounts[i].department.departmentName);
        }
    }
    // Question 13: đang import library để join các object trong class
//    In ra thông tin tất cả các account ngoại trừ account thứ 2
    public static void printAccountsUsingForExceptSecondOne() {
        for (int i=0; i<accounts.length; i++) {
            if (i==1) continue;
            System.out.println("Thông tin account thứ " + (i+1) + " là: ");
            System.out.println("Email " + accounts[i].email);
            System.out.println("Full name " + accounts[i].fullName);
            System.out.println("Phòng ban " + accounts[i].department.departmentName);
        }
    }
    // Question 14: đang import library để join các object trong class
//    In ra thông tin tất cả các account có id < 4
    public static void printAccountsUsingForIDLessThan4() {
        for (int i=0; i<accounts.length; i++) {
            if (accounts[i].accountID >= 4) continue;
            System.out.println("Thông tin account thứ " + (i+1) + " là: ");
            System.out.println("Email " + accounts[i].email);
            System.out.println("Full name " + accounts[i].fullName);
            System.out.println("Phòng ban " + accounts[i].department.departmentName);
        }
    }
    // Question 15
    public static void printEvenLessThan(int number) {
        for (int i = 0; i <= number; i += 2) {
            System.out.print(i + " ");
        }
    }



    // Question 16


    // Question 17
}

