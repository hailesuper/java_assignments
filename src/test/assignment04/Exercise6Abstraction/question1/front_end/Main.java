package test.assignment04.Exercise6Abstraction.question1.front_end;

import test.assignment04.Exercise6Abstraction.question1.back_end.VietnamesePhone;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Danh sách điện thoại Việt Nam");
        VietnamesePhone vietnamesePhone = new VietnamesePhone();
        boolean isContinue = true;
        while (isContinue) {
            printInstruction();
            if (scanner.hasNextInt()) {
                int select = scanner.nextInt();
                scanner.nextLine();
                switch (select) {
                    case 1:
                        vietnamesePhone.insertContact(inputName(), inputPhone());
                        break;
                    case 2:
                        vietnamesePhone.removeContact(inputName());
                        break;
                    case 3:
                        vietnamesePhone.updateContact(inputName(),inputPhone());
                        break;
                    case 4:
                        vietnamesePhone.searchContact(inputName());
                        break;
                    case 5:
                        vietnamesePhone.printContacts();
                        break;
                    default:
                        System.out.println("Chọn cái quần què gì vậy?");
                        break;
                }
            } else {
                scanner.nextLine();
                System.out.println("Bớt giỡn nha mày!");
            }
            isContinue = checkContinue();
        }
    }

    public static void printInstruction() {
        System.out.println("---------- BẮT ĐẦU ----------");
        System.out.println("1. Thêm thông tin liên lạc.");
        System.out.println("2. Xóa thông tin liên lạc.");
        System.out.println("3. Thay đổi thông tin liên lạc.");
        System.out.println("4. Tìm thông tin liên lạc.");
        System.out.println("5. In danh sách liên lạc.");
        System.out.println("--------------------------------");
        System.out.print("Lựa chọn: ");
    }

    private static boolean checkContinue() {
        System.out.print("Bạn có muốn tiếp tục? Y/N ");
        if (scanner.nextLine().toLowerCase().equals("n"))
            return false;
        else
            return true;
    }

    private static String inputName() {
        System.out.print("Nhập tên liên lạc: ");
        return scanner.nextLine().trim();
    }

    private static String inputPhone() {
        System.out.print("Nhập số điện thoại: ");
        return scanner.nextLine().trim();
    }

}
