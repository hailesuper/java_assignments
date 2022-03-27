package test.assignment02advanced;

import test.assignment00.Account;
import test.assignment00.Department;
import test.assignment00.Position;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Formatter;
import java.util.Locale;
import java.util.Scanner;

import static test.assignment00.Program.accounts;
import static test.assignment00.Program.departments;

public class Exercise2 {
    public static void main(String[] args) {
//        System.out.println("----- Question 1: ------");
//        question1();
//
//        System.out.println("----- Question 2: ------");
//        question2();
//
//        System.out.println("----- Question 3: ------");
//        question3();
//
//        System.out.println("----- Question 4: ------");
//        question4();
//
//        System.out.println("----- Question 5: ------");
//        question5();
//
        System.out.println("----- Question 6: ------");
        question6();
//        System.out.println(accounts[0]);
//        System.out.println(accounts[1]);
//        System.out.println(accounts[2]);


    }

    //    Question 1:
//    Khai báo 1 số nguyên = 5 và sử dụng lệnh System out printf để in ra số
//    nguyên đó
    public static void question1() {
        int n = 5;
        System.out.printf("n = %d\n", n);

    }
//    Question 2:
//    Khai báo 1 số nguyên = 100 000 000 và sử dụng lệnh System out printf để in
//    ra số nguyên đó thành định dạng như sau: 100,000,000
    private static void question2() {
        int n = 100_000_000;
        System.out.printf("%,d\n", n);
    }
//    Question 3:
//    Khai báo 1 số thực = 5,567098 và sử dụng lệnh System out printf để in ra số
//    thực đó chỉ bao gồm 4 số đằng sau
    private static void question3() {
        float n = 5.567098F;
        System.out.printf("%.4f\n", n);
    }
//    Question 4:
//    Khai báo Họ và tên của 1 học sinh và in ra họ và tên học sinh đó theo định
//    dạng như sau:
//    Họ và tên: "Nguyễn Văn A" thì sẽ in ra trên console như sau:
//    Tên tôi là "Nguyễn Văn A" và tôi đang độc thân.
    private static void question4() {
        System.out.print("Họ tên của FA: ");
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Tên tôi là %s và tôi đang độc thân.", scanner.nextLine());
        scanner.close();
        System.out.println();
    }
//
//            Question 5:
//    Lấy thời gian bây giờ và in ra theo định dạng sau:
//            24/04/2020 11h:16p:20s
    public static Locale viLocale = new Locale("vi","");

    private static void question5() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy kk'h':mm'p':ss's'");
        System.out.println(LocalDateTime.now().format(formatter));
    }
//    Question 6:
//    In ra thông tin account (như Question 8 phần FOREACH) theo định dạng
//    table (giống trong Database)
    private static void question6() {
//        public String email;
//        public String username;
//        public String fullName;
//        public Department department;
//        public Position position;
//        public LocalDate createDate;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy", viLocale);
        System.out.printf("%5s %-20s %-20s %-30s %-30s %-20s %20s\n", "ID", "Email", "Full name", "Username", "Phòng", "Chức vụ", "Ngày tạo");
        for (Account account : accounts) {
            System.out.printf("%5s %-20s %-20s %-30s %-30s %-20s %20s\n", account.accountID, account.email, account.fullName, account.username, account.department.departmentName,
                    account.position.positionName, account.createDate.format(formatter));
        }
    }

}
