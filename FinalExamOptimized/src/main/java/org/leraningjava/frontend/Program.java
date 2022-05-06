package org.leraningjava.frontend;

import org.leraningjava.entity.User;

import static org.leraningjava.utils.ScannerUtils.inputSelect;

public class Program {
    private static final Function function = new Function();

    public static void main(String[] args) throws InterruptedException {
        menuLogin();
    }

    private static void menuLogin() throws InterruptedException {
        System.out.println("----- LOGIN -----");
        User user = function.login();
        if (user.getRole() == User.Role.ADMIN)
            menuAdmin();
        else
            menuEmployee();
    }

    private static void menuAdmin() throws InterruptedException {
        while (true) {
            printSelectionAdmin();
            int select = inputSelect(1,5," Lựa chọn quần què.");
            switch (select) {
                case 1:
                    function.addUser();
                    break;
                case 2:
                    function.deleteUserByID();
                    break;
                case 3:
                    function.printUserByID();
                    break;
                case 4:
                    function.printUsers();
                    break;
                case 5:
                    System.out.println("Thoát khỏi chương trình");
                    return;
            }
        }
    }

    private static void printSelectionAdmin() {
        System.out.println("----- ADMIN MENU -----");
        System.out.println("1. Thêm User");
        System.out.println("2. Xóa User theo ID");
        System.out.println("3. Tìm User theo ID");
        System.out.println("4. Hiển thị danh sách tất cả User");
        System.out.println("5. Thoát chương trình");
        System.out.println("----------------------");
        System.out.print("Lựa chọn: ");
    }

    private static void menuEmployee() {
        while (true) {
            printSelectionEmployee();
            int select = inputSelect(1,3,"Lựa chọn quần què.");
            switch (select) {
                case 1:
                    function.printUserByID();
                    break;
                case 2:
                    function.printUsers();
                    break;
                case 3:
                    System.out.println("Thoát khỏi chương trình");
                    return;
            }
        }
    }
    private static void printSelectionEmployee() {
        System.out.println("----- EMPLOYEE MENU -----");
        System.out.println("1. Tìm User theo ID");
        System.out.println("2. Hiển thị danh sách tất cả User");
        System.out.println("3. Thoát chương trình");
        System.out.println("--------------------------");
        System.out.print("Lựa chọn: ");
    }
}
