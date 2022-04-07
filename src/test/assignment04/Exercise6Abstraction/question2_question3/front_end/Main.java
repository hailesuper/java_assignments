package test.assignment04.Exercise6Abstraction.question2_question3.front_end;

import test.assignment04.Exercise6Abstraction.question2_question3.entity.Employee;
import test.assignment04.Exercise6Abstraction.question2_question3.entity.Manager;
import test.assignment04.Exercise6Abstraction.question2_question3.entity.User;
import test.assignment04.Exercise6Abstraction.question2_question3.entity.Waiter;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<User> managers = new ArrayList<>();
        ArrayList<User> employees = new ArrayList<>();
        ArrayList<User> waiters = new ArrayList<>();
        boolean isDone = false;
        while (!isDone) {
            printInstruction();
            int select = inputInt();
            switch (select) {
                case 1:
                    var manager = new Manager(inputName(), inputSalaryRatio());
                    managers.add(manager);
                    System.out.println(manager.displayInfor());
                    break;
                case 2:
                    var employee = new Employee(inputName(),inputSalaryRatio());
                    System.out.println(employee.displayInfor());
                    employees.add(employee);
                    break;
                case 3:
                    var waiter = new Waiter(inputName(),inputSalaryRatio());
                    System.out.println(waiter.displayInfor());
                    waiters.add(waiter);
                    break;
                case 4: case 5: case 6:
                    System.out.println("Danh sách");
                    if (select == 4)
                        printListElements(managers);
                    else if (select == 5)
                        printListElements(employees);
                    else
                        printListElements(waiters);
                    break;
                case 7:
                    isDone = true;
                    scanner.close();
                    System.out.println("---------- KẾT THÚC ----------");
                    break;
                default:
                    System.out.println("Mày đùa tao à?");
                    break;
            }

        }

    }

    private static void printInstruction() {
        System.out.println("---------- BẮT ĐẦU ----------");
        System.out.println("1. Thêm Manager.");
        System.out.println("2. Thêm Employee.");
        System.out.println("3. Thêm Waiter.");
        System.out.println("4. Hiển thị danh sách Manager.");
        System.out.println("5. Hiển thị danh sách Employee.");
        System.out.println("6. Hiển thị danh sách Waiter.");
        System.out.println("7. Thoát.");
        System.out.println("--------------------------------");
        System.out.print("Lựa chọn: ");
    }

    private static void printListElements(ArrayList<User> arrayList) {
        for (User user : arrayList) {
            System.out.println(user.displayInfor());
        }
    }

    private static int inputInt() {
        while (true) {
            if (scanner.hasNextInt()) {
                int inputInt = scanner.nextInt();
                scanner.nextLine();
                return inputInt;
            } else {
                scanner.nextLine();
                System.out.println("Nhập cái quần què!. Nhập lại int!");
            }
        }
    }

    private static String inputName() {
        System.out.print("Nhập tên: ");
        return scanner.nextLine();
    }

    private static Double inputSalaryRatio() {
        System.out.print("Nhập tỷ lệ lương: ");
        while (true) {
            if (scanner.hasNextDouble()) {
                Double salaryRatio = scanner.nextDouble();
                scanner.nextLine();
                return salaryRatio;
            } else {
                scanner.nextLine();
                System.out.println("Nhập cái quần què gì vậy?");
                System.out.println("Nhập lại.");
            }
        }

    }
}
