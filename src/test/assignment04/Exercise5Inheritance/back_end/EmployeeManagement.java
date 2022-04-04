package test.assignment04.Exercise5Inheritance.back_end;

import static test.assignment04.Exercise5Inheritance.back_end.Ultilities.scanner;

public class EmployeeManagement {
    public static void addEmployee() {
        printPositionList();
        System.out.print("Lựa chọn: ");
        int select = scanner.nextInt();
        switch (select) {
            case 1:
            case 2:
            case 3:
        }
    }

    public static void findEmployeeByFullName() {

    }

    public static void showEmployeeList() {

    }

    public static void deleteEmployeeByFullName() {

    }

    public static void quitProgram() {

    }

    private static void printPositionList() {
        System.out.println("----- DANH SÁCH CHỨC VỤ -----");
        System.out.println("1. Công nhân");
        System.out.println("2. Kỹ Sư");
        System.out.println("3. Nhân viên");
        System.out.println("-----------------------------");
    }
}
