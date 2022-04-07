package test.assignment04.Exercise5Inheritance.question1_question2.front_end;

import test.assignment04.Exercise5Inheritance.question1_question2.entity.*;

import static test.assignment04.Exercise5Inheritance.question1_question2.back_end.EmployeeManagement.*;

public class Main {
    public static void main(String[] args) {
        boolean isDone = false;
        while (!isDone) {
            printInstruction();
            int select = scanIntIn();
            switch (select) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    findEmployeeByFullName();
                    break;
                case 3:
                    showEmployeeList();
                    break;
                case 4:
                    deleteEmployeeByFullName();;
                    break;
                case 5:
                    if (quitProgram()) {
                        isDone = true;
                        scanner.close();
                        System.out.println("----- KẾT THÚC -----");
                    }
                    break;
            }
        }

    }
    private static void printInstruction () {
        System.out.println("----- BẮT ĐẦU -----");
        System.out.println("1. Thêm mới cán bộ.");
        System.out.println("2. Tìm kiếm theo họ tên.");
        System.out.println("3. Hiện thị thông tin về danh sách các cán bộ.");
        System.out.println("4. Nhập vào tên của cán bộ và delete cán bộ đó");
        System.out.println("5. Thoát khỏi chương trình.");
        System.out.println("--------------------------------");
        System.out.print("Lựa chọn: ");    }
}
