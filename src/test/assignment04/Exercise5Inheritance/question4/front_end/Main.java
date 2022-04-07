package test.assignment04.Exercise5Inheritance.question4.front_end;
import test.assignment04.Exercise5Inheritance.question4.back_end.*;

import static test.assignment04.Exercise5Inheritance.question4.back_end.DocumentManagement.*;
import static test.assignment04.Exercise5Inheritance.question4.back_end.Utilities.scanIntIn;
import static test.assignment04.Exercise5Inheritance.question4.back_end.Utilities.scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            printInstruction();
            int select = scanIntIn();
            switch (select) {
                case 1:
                    addDocument();
                    break;
                case 2:
                    removeDocumentById();
                    break;
                case 3:
                    showDocumentList();
                    break;
                case 4:
                    findDocumentByType();
                    break;
                case 5:
                    System.out.println("----- KẾT THÚC -----");
                    scanner.close();
                    return;
                default:
                    System.out.println("Hãy về thế giới thực tại!");
                    break;
            }
        }
    }

    private static void printInstruction() {
        System.out.println("----- BẮT ĐẦU -----");
        System.out.println("1. Thêm mới tài liêu: Sách, tạp chí, báo.");
        System.out.println("2. Xoá tài liệu theo mã tài liệu.");
        System.out.println("3. Hiện thị thông tin về tài liệu.");
        System.out.println("4. Tìm kiếm tài liệu theo loại: Sách, tạp chí, báo.");
        System.out.println("5. Thoát khỏi chương trình.");
        System.out.println("-------------------");
        System.out.print("Lựa chọn: ");
    }
}
