package org.leraningjava.utils;

import java.util.Scanner;

public class ScannerUtils {
    public static Scanner scanner = new Scanner(System.in);

    /**
     * Ask for correct email format input
     * @return correct email String
     */
    public static String inputEmail() {
        while (true) {
            String email = scanner.nextLine().trim();
            String emailRegex = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
            if (!isValidString(email,emailRegex)) {
                System.out.println("Nhập sai định dạng email.");
                System.out.print("Nhập lại email: ");
            } else return email;
        }
    }

    /**
     * Ask for string input contains at least one Uppercase and between 6-12 characters (for Password)
     * @return password without redundant spaces
     */
    public static String inputPassword() {
        while (true) {
            String password = scanner.nextLine().trim();
            String passwordRegex = "^(?=.*[A-Z])(?=\\S+$).{6,12}$";
            if (!isValidString(password,passwordRegex)) {
                System.out.println("Nhập sai định dạng passowrd (6-12 ký tự, ít nhất 1 ký tự hoa)");
                System.out.print("Nhập lại password: ");
            } else return password;
        }
    }

    /**
     * Ask for input including only letters and spaces (for fullName)
     * @return Full Name without redundant spaces
     */
    public static String inputFullName() {
        while (true) {
            String fullName = scanner.nextLine().trim();
            String fullNameRegex = "[\\p{L}\\s]+";
            if (!isValidString(fullName,fullNameRegex)) {
                System.out.println("Nhập sai định dạng Họ và tên.");
                System.out.print("Nhập lại Họ và tên: ");
            } else return fullName;
        }
    }

    /**
     * Validate whether a string follows a regex
     * @param string
     * @param regex
     * @return boolean true/false
     */
    public static boolean isValidString(String string, String regex) {
        return string.matches(regex);
    }

    /**
     * Ask for integer input between a(inclusive) and b(inclusive)
     * @param errorMessage message shown when input is not within the range
     */
    public static int inputSelect(int a, int b, String errorMessage) {
        while (true) {
            int number = scanIntIn();
            if (number >= a && number <= b) {
                return number;
            } else {
                System.err.println(errorMessage);
                System.out.printf("Nhập lại %d - %d\n",a,b);
            }
        }
    }

    /**
     * Ask for input until the input is an integer.
     * @return the integer
     */
    public static int scanIntIn() {
        int inputInt;
        while (true) {
            if (scanner.hasNextInt()) {
                inputInt = scanner.nextInt();
                scanner.nextLine();
                break;
            } else {
                System.out.print("Nhập sai số nguyên. \nNhập lại: ");
                scanner.nextLine();
            }
        }
        return inputInt;
    }
}
