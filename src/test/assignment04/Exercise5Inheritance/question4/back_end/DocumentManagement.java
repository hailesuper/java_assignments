package test.assignment04.Exercise5Inheritance.question4.back_end;

import test.assignment04.Exercise5Inheritance.question4.entity.*;
import test.assignment04.Exercise5Inheritance.question4.entity.Document;

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;

import static test.assignment04.Exercise5Inheritance.question4.back_end.Utilities.*;

public class DocumentManagement {
    private static ArrayList<Document> documents = new ArrayList<>();
    private static ArrayList<Integer> documentIDs = new ArrayList<>();
    public static void addDocument() {
        printDocumentTypes();
        int select = scanIntIn();
        switch (select) {
            case 1:
                Book book = new Book(inputID(),inputPublisher(),inputPublishedAmount(),
                        inputBookAuthor(),inputPageAmount());
                documents.add(book);
                documentIDs.add(book.getID());
                break;
            case 2:
                Magazine magazine = new Magazine(inputID(),inputPublisher(),inputPublishedAmount(),
                        inputMagazineVersion(), inputPublishedMonth());
                documents.add(magazine);
                documentIDs.add(magazine.getID());
                break;
            case 3:
                Newspaper newspaper = new Newspaper(inputID(),inputPublisher(),inputPublishedAmount(),
                        inputPublishedDate());
                documents.add(newspaper);
                documentIDs.add(newspaper.getID());
                break;
            default:
                System.out.println("Nhập quần què!");
                break;
        }
        if (select == 1 || select == 2 || select == 3)
            System.out.println("Tài liệu thêm: " + documents.get(documents.size() - 1));

    }

    public static void removeDocumentById() {
        System.out.print("Nhập ID tài liệu cần xóa: ");
        int inputID = scanIntIn();
        boolean isFound = false;
        for (Document document : documents)
            if (document.getID() == inputID) {
                System.out.println("Xóa " + document);
                documents.remove(document);
                isFound = true;
                return;
            }
        System.out.println("Tài liệu " + inputID + " không tồn tại");
    }

    public static void showDocumentList() {
        System.out.println("----- DANH SÁCH TÀI LIỆU -----");
        for (Document document : documents)
            System.out.println(document);
    }

    public static void findDocumentByType() {
        printDocumentTypes();
        int select = scanIntIn();
        Object documentType = null;
        if (select == 1)
            documentType = Book.class;
        else if (select == 2)
            documentType = Magazine.class;
        else if (select == 3)
            documentType = Newspaper.class;
        else System.out.println("Mày tự đi mua tài liệu của mày đi!");
        for (Document document : documents)
            if (document.getClass() == documentType)
                System.out.println(document);
    }

    public static void printDocumentTypes() {
        System.out.println("----- Các loại tài liệu -----");
        System.out.println("1. Sách");
        System.out.println("2. Tạp chí");
        System.out.println("3. Báo");
        System.out.println("-----------------------------");
        System.out.print("Lựa chọn: ");
    }

    private static int inputID() {
        while (true) {
            System.out.print("Nhập ID: ");
            int inputID = scanIntIn();
            if (documentIDs.contains(inputID))
                System.out.println("ID bị trùng");
            else
                return inputID;
        }
    }

    private static String inputPublisher() {
        System.out.print("Nhập nhà xuất bản: ");
        return scanner.nextLine();
    }

    private static int inputPublishedAmount() {
        System.out.print("Số bản phát hành: ");
        return scanIntIn();
    }

    private static String inputBookAuthor() {
        System.out.print("Tác giả: ");
        return scanner.nextLine();
    }

    private static int inputPageAmount() {
        System.out.print("Số trang: ");
        return scanIntIn();
    }

    private static int inputMagazineVersion() {
        System.out.print("Số phát hành: ");
        return scanIntIn();
    }

    private static YearMonth inputPublishedMonth() {
        int month;
        int year;
        while (true) {
            System.out.print("Tháng phát hành: ");
            month = scanIntIn();
            if (month >= 1 && month <= 12)
                break;
            else
                System.out.println("Nhập sai. (1-12)");
        }
        while (true) {
            System.out.print("Năm phát hành: ");
            year = scanIntIn();
            if (year >= 1 && year <= LocalDate.now().getYear())
                break;
            else
                System.out.println("Nhập sai. (1-" + LocalDate.now().getYear() + ") ");
        }
        return YearMonth.of(year,month);
    }

    private static LocalDate inputPublishedDate() {
        var formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        while (true) {
            try {
                System.out.print("Ngày phát hành: ");
                return LocalDate.parse(scanner.nextLine());
            } catch (DateTimeParseException e) {
                System.out.println("Nhập sai định dạng. dd-MM-yyyy");
            }
        }
    }
}
