package test.assignment05.Exercise2Polymorphism.Question4MyMath.front_end;

import static Utilities.Utilities.*;
import static test.assignment05.Exercise2Polymorphism.Question4MyMath.back_end.CalculationManagment.isValid1_3;
import static test.assignment05.Exercise2Polymorphism.Question4MyMath.entity.MyMath.calculateSum;

public class Main {
    public static void main(String[] args) {
        System.out.println("Loại số thứ 1: 1. Int 2. Byte 3. Float");
        Object firstNumber = inputNumberObject();
        System.out.println("Loại số thứ 2: 1. Int 2. Byte 3. Float");
        Object secondNumber = inputNumberObject();
        if (firstNumber instanceof Integer && secondNumber instanceof Integer)
            calculateSum((int) firstNumber, (int) secondNumber);
        else if (firstNumber instanceof Float && secondNumber instanceof Float)
            calculateSum((float) firstNumber, (float) secondNumber);
        else if (firstNumber instanceof Byte && secondNumber instanceof Byte)
            calculateSum((byte) firstNumber, (byte) secondNumber);
        else if (firstNumber instanceof Integer && secondNumber instanceof Byte)
            calculateSum((int) firstNumber, (byte) secondNumber);
        else if (firstNumber instanceof Integer && secondNumber instanceof Float)
            calculateSum((int) firstNumber, (float) secondNumber);
        else if (firstNumber instanceof Byte && secondNumber instanceof Integer)
            calculateSum((int) secondNumber, (byte) firstNumber);
        else if (firstNumber instanceof Byte && secondNumber instanceof Float)
            calculateSum((float) secondNumber, (byte) firstNumber);
        else if (firstNumber instanceof Float && secondNumber instanceof Integer)
            calculateSum((int) secondNumber, (float) firstNumber);
        else if (firstNumber instanceof Float && secondNumber instanceof Byte)
            calculateSum((byte) secondNumber, (float) firstNumber);
    }
    private static Object inputNumberObject() {
        while (true) {
            int inputType1 = scanIntIn();
            if (isValid1_3(inputType1)) {
                switch (inputType1) {
                    case 1:
                        System.out.println("Nhập int: ");
                        return scanIntIn();
                    case 2:
                        System.out.println("Nhập byte: ");
                        return scanByteIn();
                    case 3:
                        System.out.println("Nhập float: ");
                        return scanFloatIn();
                }
            } else {
                System.out.println("Nhập sai. Nhập lại.");
            }
        }
    }
}
