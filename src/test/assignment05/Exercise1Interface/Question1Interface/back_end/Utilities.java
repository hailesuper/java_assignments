package test.assignment05.Exercise1Interface.Question1Interface.back_end;

import java.util.Scanner;

public class Utilities {
    public static Scanner scanner = new Scanner(System.in);
    public static int scanIntIn() {
        int inputInt;
        while (true) {
            if (scanner.hasNextInt()) {
                inputInt = scanner.nextInt();
                scanner.nextLine();
                break;
            } else {
                System.out.print("Nhập sai số nguyên. \nNhập lại:");
                scanner.nextLine();
            }
        }
        return inputInt;
    }
}
