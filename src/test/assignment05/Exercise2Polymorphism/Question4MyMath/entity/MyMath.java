package test.assignment05.Exercise2Polymorphism.Question4MyMath.entity;

public class MyMath {
    public static void calculateSum(int number1, int number2) {
        System.out.println("Tổng int + int = " + (number1+number2));
    }

    public static void calculateSum(byte number1, byte number2) {
        System.out.println("Tổng byte + byte = " + (number1+number2));
    }

    public static void calculateSum(float number1, float number2) {
        System.out.println("Tổng float + float = " + (number1+number2));
    }

    public static void calculateSum(int number1, byte number2) {
        System.out.println("Tổng int + byte = " + (number1+number2));
    }

    public static void calculateSum(int number1, float number2) {
        System.out.println("Tổng int + float = " + (number1+number2));
    }

    public static void calculateSum(byte number1, float number2) {
        System.out.println("Tổng byte + float = " + (number1+number2));
    }
}
