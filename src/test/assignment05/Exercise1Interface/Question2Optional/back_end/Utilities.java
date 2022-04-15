package test.assignment05.Exercise1Interface.Question2Optional.back_end;

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
                System.out.print("Nhập sai số nguyên. \nNhập lại: ");
                scanner.nextLine();
            }
        }
        return inputInt;
    }

    public static double scanDoubleIn() {
        double inputDouble;
        while (true) {
            if (scanner.hasNextDouble()) {
                inputDouble = scanner.nextDouble();
                scanner.nextLine();
                break;
            } else {
                System.out.print("Nhập sai số thực. \nNhập lại: ");
                scanner.nextLine();
            }
        }
        return inputDouble;
    }

    public static byte scanByteIn() {
        byte inputByte;
        while (true) {
            if (scanner.hasNextByte()) {
                inputByte = scanner.nextByte();
                scanner.nextLine();
                break;
            } else {
                System.out.print("Nhập sai số byte. \nNhập lại: ");
                scanner.nextLine();
            }
        }
        return inputByte;
    }

    public static float scanFloatIn() {
        float inputFloat;
        while (true) {
            if (scanner.hasNextFloat()) {
                inputFloat = scanner.nextFloat();
                scanner.nextLine();
                break;
            } else {
                System.out.print("Nhập sai số float. \nNhập lại: ");
                scanner.nextLine();
            }
        }
        return inputFloat;
    }
}
