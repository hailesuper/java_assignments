package test.assignment03;

import java.time.LocalDateTime;
import java.util.Scanner;
class Account {
    String email;
    String username;
    String fullName;
    LocalDateTime createDateTime;

    @Override
    public String toString() {
        return "Account{" +
                "email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", fullName='" + fullName + '\'' +
                ", createDate=" + createDateTime +
                '}';
    }
public class Exercise2 {
    }
    public static void main(String[] args) {
        Account[] accounts = new Account[5];
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i< accounts.length; i++) {
            Account account = new Account();
            accounts[i] = account;
//            accounts[i] = new Account(); WHY CAN'T
            System.out.println("Đang tạo account thứ " + (i+1));
            System.out.print("Nhập email: ");
            accounts[i].email = scanner.nextLine();
            System.out.print("Nhập username: ");
            accounts[i].username = scanner.nextLine();
            System.out.print("Nhập Họ và tên: ");
            accounts[i].fullName = scanner.nextLine();
            accounts[i].createDateTime = LocalDateTime.now();
        }
        for (Account account : accounts) {
            System.out.println(account.toString());
        }
    }
//    Exercise 2 (Optional): Default value
//    Question 1:
//    Không sử dụng data đã insert từ bài trước, tạo 1 array Account và khởi
//    tạo 5 phần tử theo cú pháp (sử dụng vòng for để khởi tạo):
//             Email: "Email 1"
//             Username: "User name 1"
//             FullName: "Full name 1"
//             CreateDate: now
}
