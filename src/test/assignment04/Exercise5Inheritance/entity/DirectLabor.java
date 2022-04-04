package test.assignment04.Exercise5Inheritance.entity;

import java.util.Scanner;

public class DirectLabor extends Employee {
    public static Scanner scanner = new Scanner(System.in);
    private byte level;
    public DirectLabor(String fullName, int age, Gender gender, String address, int level) {
        super(fullName, age, gender, address);
        this.level = (byte) validateLevel(fullName, level);
    }

    public DirectLabor(String fullName, int age, Gender gender, int level) {
        super(fullName, age, gender);
        this.level = (byte) validateLevel(fullName, level);
    }

    private int validateLevel(String fullName, int level) {
        boolean isLevelValid = false;
        while (!isLevelValid) {
            System.out.printf("Nhập lại bậc công nhân %s (1-10): ", fullName);
            if (scanner.hasNextInt()) {
                level = scanner.nextInt();
                scanner.nextLine();
                if (level >= 1 && level <= 10)
                    isLevelValid = true;
            }
        }
        return level;
    }

    @Override
    public String toString() {
        return "DirectLabor{" +
                "level=" + level +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", address='" + address + '\'' +
                '}';
    }
}
