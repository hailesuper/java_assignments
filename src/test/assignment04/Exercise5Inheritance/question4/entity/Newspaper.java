package test.assignment04.Exercise5Inheritance.question4.entity;

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import test.assignment04.Exercise5Inheritance.question4.back_end.Utilities;

import static test.assignment04.Exercise5Inheritance.question4.back_end.Utilities.*;

public class Newspaper extends Document {
    private LocalDate publishedDate;

    @Override
    public String toString() {
        return "Newspaper{" +
                "id=" + id +
                ", publisher='" + publisher + '\'' +
                ", publishedAmount=" + publishedAmount +
                ", publishedDate=" + publishedDate +
                '}';
    }

    public Newspaper() {
    	super();
    }
    
    public Newspaper(int id, String publisher, int publishedAmount, LocalDate publishedDate) {
        super(id, publisher, publishedAmount);
        this.publishedDate = publishedDate;
    }

    
	@Override
	public void inputFromConsole() {
		this.id = inputID();
		this.publisher = inputPublisher();
		this.publishedAmount = inputPublishedAmount();
		
		
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
