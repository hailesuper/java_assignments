package test.assignment05.Exercise2Polymorphism.Question2.entity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;

import static Utilities.Utilities.scanIntIn;
import static Utilities.Utilities.scanner;

public class Person {
    enum Gender {MALE, FEMALE, UNKNOWN};
    protected String name;
    protected Gender gender;
    protected LocalDate birthDate;
    protected String address;

    public Person() {
    }

    public Person(String name, Gender gender, LocalDate birthDate, String address) {
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
        this.address = address;
    }

    // Methods
    public void inputInfo() {
        this.name = inputName();
        this.gender = inputGender();
        this.birthDate = inputBirthDate();
        this.address = inputAddress();
    }

    public void showInfo() {
        System.out.println("Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", birthDate=" + birthDate +
                ", address='" + address + '\'' +
                '}');
    }

    // Sub-Methods
    public static String inputName() {
        System.out.print("Tên: ");
        return scanner.nextLine();
    }

    public static Gender inputGender() {
        System.out.println("Giới tính 1. Nam 2. Nữ 3. Khác");
        while (true) {
            int inputGenderSelect = scanIntIn();
            if (inputGenderSelect >= 1 && inputGenderSelect <= 3) {
                switch (inputGenderSelect) {
                    case 1:
                        return Gender.MALE;
                    case 2:
                        return Gender.FEMALE;
                    case 3:
                        return Gender.UNKNOWN;
                }
            } else {
                System.out.print("Nhập sai. Nhập lại (1-3): ");
            }
        }
    }

    public static LocalDate inputBirthDate() {
        while (true) {
            System.out.print("Ngày sinh: (dd-MM-yyyy) ");
            String inputDate = scanner.nextLine();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            try {
                return LocalDate.parse(inputDate,formatter);
            } catch (DateTimeParseException d) {
                System.out.println("Nhập sai.");
            }
        }
    }

    public static String inputAddress() {
        System.out.print("Địa chỉ:");
        return scanner.nextLine();
    }

    // Setters and Getters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
