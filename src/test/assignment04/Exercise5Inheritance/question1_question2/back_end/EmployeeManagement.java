package test.assignment04.Exercise5Inheritance.question1_question2.back_end;

import test.assignment04.Exercise5Inheritance.question1_question2.entity.DirectLabor;
import test.assignment04.Exercise5Inheritance.question1_question2.entity.Employee;
import test.assignment04.Exercise5Inheritance.question1_question2.entity.Engineer;
import test.assignment04.Exercise5Inheritance.question1_question2.entity.OfficeStaff;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

import static test.assignment04.Exercise5Inheritance.question1_question2.back_end.Utilities.scanner;

public class EmployeeManagement {
    public static Scanner scanner = new Scanner(System.in);
    private static List<Employee> employees = new CopyOnWriteArrayList<>();

    public static void addEmployee() {
        printPositionList();
        System.out.print("Lựa chọn: ");
        int select = scanIntIn();

        switch (select) {
            case 1:
                Employee labor = new DirectLabor(inputFullName(),inputAge(),inputGender(),
                        inputAddress(), inputDirectLaborLevel());
                employees.add(labor);
                break;
            case 2:
                Engineer engineer = new Engineer(inputFullName(),inputAge(),inputGender(),
                        inputAddress(),inputSpecialization());
                employees.add(engineer);
                break;
            case 3:
                OfficeStaff officeStaff = new OfficeStaff(inputFullName(),inputAge(),inputGender(),
                        inputAddress(),inputDuty());
                employees.add(officeStaff);
                break;
        }
    }

    public static void findEmployeeByFullName() {
        System.out.print("Tên nhân viên cần tìm: ");
        String fullName = scanner.nextLine().trim().toLowerCase();
        boolean isFound = false;
        for (Employee employee : employees) {
            if (employee.getFullName().toLowerCase().equals(fullName)) {
                System.out.println(employee);
                isFound = true;
            }
        }
        if (!isFound)
            System.out.println("Không tìm thấy " + fullName + " trong danh sách");
    }

    public static void showEmployeeList() {
        printPositionList();
        System.out.print("Lựa chọn: ");
        int select = scanIntIn();
        Object selectedType = null;
        if (select == 1)
            selectedType = DirectLabor.class;
        else if (select == 2)
            selectedType = Engineer.class;
        else if (select == 3)
            selectedType = OfficeStaff.class;
        else
            System.out.println("Nhập cái quần què!");
        for (Employee employee : employees)
            if (employee.getClass().equals(selectedType))
                System.out.println(employee);
    }

    public static void deleteEmployeeByFullName() {
        System.out.println("Nhập họ tên nhân viên cần xóa: ");
        String fullName = scanner.nextLine().trim();
        for (Employee employee : employees) {
            if (employee.getFullName().equals(fullName)) {
                employees.remove(employee);
                System.out.println("Xóa " + employee);
//                employees.remove(employee);
            }
        }
    }

    public static boolean quitProgram() {
        System.out.print("Bạn muốn thoát chương trình? Y/N ");
        return scanner.nextLine().trim().toLowerCase().equals("y");
    }

    private static String inputFullName() {
        System.out.print("Nhập họ và tên: ");
        return scanner.nextLine().trim();
    }
    private static int inputAge() {
        while (true) {
            System.out.print("Nhập tuổi: ");
            int tuoi = scanIntIn();
            if (tuoi >= 0 && tuoi <= 100)
                return tuoi;
        }
    }

    private static int inputDirectLaborLevel() {
        System.out.print("Nhập cấp bậc (1-10): ");
        return scanIntIn();
    }

    private static String inputSpecialization() {
        System.out.print("Nhập ngành đào tạo: ");
        return scanner.nextLine();
    }

    private static String inputDuty() {
        System.out.print("Nhập công việc: ");
        return scanner.nextLine();
    }

    public static int scanIntIn() {
        while (true) {
            if (scanner.hasNextInt()) {
                int input = scanner.nextInt();
                scanner.nextLine();
                return input;
            } else {
                scanner.nextLine();
                System.out.println("Nhập lại số nguyên: ");
            }
        }
    }

    private static Employee.Gender inputGender() {
        System.out.println("Giới tính: 1. Nam 2. Nữ 3. Khác");
        int select = scanIntIn();
        while (true) {
            switch (select) {
                case 1:
                    return Employee.Gender.MALE;
                case 2:
                    return Employee.Gender.FEMALE;
                case 3:
                    return Employee.Gender.UNKNOWN;
            }
        }
    }

    private static String inputAddress() {
        System.out.println("Nhập địa chỉ: ");
        return scanner.nextLine();
    }



    private static void printPositionList() {
        System.out.println("----- DANH SÁCH CHỨC VỤ -----");
        System.out.println("1. Công nhân");
        System.out.println("2. Kỹ Sư");
        System.out.println("3. Nhân viên");
        System.out.println("-----------------------------");
    }
}
