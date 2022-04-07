package test.assignment04.Exercise5Inheritance.question4.back_end;

import java.util.Scanner;

public class Utilities {
    public static Scanner scanner = new Scanner(System.in);

    public static int scanIntIn() {
        while (true) {
            if (scanner.hasNextInt()) {
                int inputInt = scanner.nextInt();
                scanner.nextLine();
                return inputInt;
            } else
                scanner.nextLine();
                System.out.print("Nhập lại số nguyên: ");
        }
    }
}
