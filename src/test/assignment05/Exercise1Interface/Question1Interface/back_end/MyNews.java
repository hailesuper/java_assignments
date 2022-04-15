package test.assignment05.Exercise1Interface.Question1Interface.back_end;

import test.assignment05.Exercise1Interface.Question1Interface.entity.News;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;

import static test.assignment05.Exercise1Interface.Question1Interface.back_end.Utilities.scanIntIn;
import static test.assignment05.Exercise1Interface.Question1Interface.back_end.Utilities.scanner;

public class MyNews {
    public static List<News> newsList = new ArrayList<>();
    public static void insertNews() {
        News news = new News(inputTitle(),inputPublicationDate(),inputAuthor(),
                inputContent(),inputRates());
        newsList.add(news);
    }

    public static void printInstruction() {
        System.out.println("---------- BẮT ĐẦU ----------");
        System.out.println("1. Insert news.");
        System.out.println("2. View list news.");
        System.out.println("3. Average rate.");
        System.out.println("4. Exit.");
    }

    private static String inputTitle() {
        System.out.println("Nhập tựa đề:");
        return scanner.nextLine();
    }

    private static LocalDate inputPublicationDate() {
        while (true) {
            System.out.print("Nhập ngày xuất: (dd-MM-yyyy) ");
            String inputDate = scanner.nextLine();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            try {
                return LocalDate.parse(inputDate,formatter);
            } catch (DateTimeParseException d) {
                System.out.println("Nhập sai.");
            }
        }
    }

    private static String inputAuthor() {
        System.out.print("Nhập tác giả: ");
        return scanner.nextLine();
    }

    private static String inputContent() {
        System.out.println("Nhập nội dung: ");
        return scanner.nextLine();
    }

    private static int[] inputRates() {
        int[] rates = new int[3];
        for (int i=0; i < rates.length; i++) {
            System.out.print("Điểm đánh giá " + (i+1) + " : " );
            rates[i] = scanIntIn();
        }
        return rates;
    }
}
