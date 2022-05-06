package org.leraningjava.frontend;

import org.leraningjava.backend.presentationlayer.UserController;
import org.leraningjava.entity.User;

import java.util.List;

import static java.sql.Types.NULL;
import static org.leraningjava.entity.User.Role.*;
import static org.leraningjava.utils.ScannerUtils.*;

public class Function {
    private final UserController userController;

    public Function() {
        this.userController = new UserController();
    }

    public User login() {
        while (true) {
            System.out.print("Email: ");
            String email = inputEmail();
            System.out.print("Mật khẩu: ");
            String password = inputPassword();

            User user = userController.login(email,password);
            if (user != null) {
                System.out.println("Đăng nhập thành công!");
                System.out.println("Tài khoản " + user.toString());
                return user;
            } else
                System.out.println("Đăng nhập thất bại! Vui lòng thử lại!");
        }
    }

    public void printUsers() {
        List<User> users = userController.getUsers();

        System.out.printf("%-5s %-20s %-50s\n", "ID", "Email", "Họ và tên");
        for (User user : users) {
            System.out.printf("%-5s %-20s %-50s\n", user.getID(), user.getEmail(), user.getFullName());
        }
    }

    public void printUserByID() {
        System.out.print("Nhập ID cần tìm: ");
        int userID = scanIntIn();
        System.out.println("Kết quả: ");
        User user = userController.getUserByID(userID);
        if (user != null)
            System.out.println(user.toString());
        else
            System.out.println("Không có User có ID = " + userID);
    }

    public void deleteUserByID() {
        System.out.print("Nhập ID cần xóa: ");
        int userID = scanIntIn();
        boolean isDeleted = userController.deleteUserByID(userID);
        if (isDeleted) {
            System.out.println("Xóa thành công");
        } else
            System.out.println("Xóa thất bại!");
    }

    public void addUser() throws InterruptedException {
        System.out.println("----- THÊM USER -----");
        System.out.print("Họ và tên: ");
        String fullName = inputFullName();
        System.out.print("Nhập email: ");
        String email = inputEmail();
        System.out.print("Nhập password: ");
        String password = inputPassword();
        System.out.println("Role = 1. ADMIN 2. EMPLOYEE");
        System.out.print("Lựa chọn: ");
        int roleSelect = inputSelect(1,2,"Lựa chọn sai.");
        boolean isCreationSucessful = false;
        if (roleSelect == 1) {
            System.out.print("Số năm kinh nghiệm: ");
            int expInYear = scanIntIn();
            User.Role role = ADMIN;
            isCreationSucessful = userController.addUser(fullName, email, password, role, expInYear, String.valueOf(NULL));
        } else {
            System.out.print("Kỹ năng: ");
            String proSkill = scanner.nextLine();
            User.Role role = EMPLOYEE;
            isCreationSucessful = userController.addUser(fullName, email, password, role, NULL, proSkill);
        }
        Thread.sleep(200);
        if (isCreationSucessful) {
            System.out.println("Thêm user thành công!");
            printUsers();
        } else {
            System.out.println("Thêm user thất bại");
            printUsers();
        }
    }
}
