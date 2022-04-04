package test.assignment04;

import test.assignment00.Account;
import test.assignment00.Department;
import test.assignment00.Group;

import java.time.LocalDate;
import java.util.Scanner;

import static test.assignment00.Program.*;

public class Exercise1 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean isNotDone = true;
        while (isNotDone) {
            printInstruction();
            int select = scanner.nextInt();
            scanner.nextLine();
            switch (select) {
                case 1:
                    question1();
                    break;
                case 2:
                    question2();
                    break;
                case 3:
                    question3();
                    break;
            }
            System.out.print("Bạn có muốn tiếp tục? Y/N: ");
            if (scanner.nextLine().toLowerCase().equals("n")) {
                isNotDone = false;
                System.out.println("-------- KẾT THÚC --------");
            }
        }

        scanner.close();
    }

    private static void printInstruction() {
        System.out.println("-------- BẮT ĐẦU --------");
        System.out.println("Nhập Question bạn muốn chạy: ");
        System.out.println("1. In lương số nguyên");
        System.out.println("2. Ngẫu nhiên số có 5 chữ số");
        System.out.println("21. Ngẫu nhiên số có 5 chữ số (String)");
        System.out.println("3. Lấy ra 2 số cuối");
        System.out.println("4. Kết quả phép chia");
        System.out.println("--------------------------");
        System.out.print("Lựa chọn: ");
    }
//    Question 1:
//    Tạo constructor cho department:
//    a) không có parameters
//    b) Có 1 parameter là nameDepartment và default id của
//    Department = 0
//    Khởi tạo 1 Object với mỗi constructor ở trên
    public static void question1() {
        Department department4 = new Department();
        Department department5 = new Department("Hot+ Department");
        System.out.println(department4);
        System.out.println(department5);
    }
//    Question 2:
//    Tạo constructor cho Account:
//    a) Không có parameters
//    b) Có các parameter là id, Email, Username, FirstName,
//    LastName (với FullName = FirstName + LastName)
//    c) Có các parameter là id, Email, Username, FirstName,
//    LastName (với FullName = FirstName + LastName) và
//    Position của User, default createDate = now
//    d) Có các parameter là id, Email, Username, FirstName,
//    LastName (với FullName = FirstName + LastName) và
//    Position của User, createDate
//    Khởi tạo 1 Object với mỗi constructor ở trên
    public static void question2() {
        var account2a = new Account();
        var account2b = new Account(22,"account2b@gmail.com", "account2b", "Hai", "2b");
        var account2c = new Account(22,"account2c@gmail.com", "account2c", "Hai", "2c", positions[1]);
        var account2d = new Account(22,"account2d@gmail.com", "account2d", "Hai", "2d",
                positions[2], LocalDate.of(2022,4,4));
        System.out.println( account2a + "\n"
                            + account2b + "\n"
                            + account2c + "\n"
                            + account2d + "\n"
                            );
    }
//    Question 3:
//    Tạo constructor cho Group:
//    a) không có parameters
//    b) Có các parameter là GroupName, Creator, array Account[]
//    accounts, CreateDate
//    c) Có các parameter là GroupName, Creator, array String[]
//    usernames , CreateDate
//    Với mỗi username thì sẽ khởi tạo 1 Account (chỉ có thông tin
//            username, các thông tin còn lại = null).
//    Khởi tạo 1 Object với mỗi constructor ở trên
    public static void question3() {
        var group3a = new Group();
        var group3b = new Group("groupb3", accounts[2], LocalDate.of(2021,10,27),
                new Account[] {accounts[0], accounts[1]});
        var group3c = new Group("groupb3", accounts[2], LocalDate.of(2021,10,27),
                new String[]{"groupNew1", "groupNew2"});
        System.out.println(group3a);
        System.out.println(group3b);
        System.out.println(group3b.accounts);
        for (Account account : group3b.accounts) {
            System.out.println(account);
        }
        System.out.println(group3c);
        System.out.println(group3c.accounts);
        for (Account account : group3c.accounts) {
            System.out.println(account);
        }
    }
}
