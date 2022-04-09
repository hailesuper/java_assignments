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
        Document doc = null;
        switch (select) {
            case 1:
            	doc = new Book();
                
                break;
            case 2:
            	doc = new Magazine();
                break;
            case 3:
            	doc = new Newspaper();
                break;
            default:
                System.out.println("Nháº­p quáº§n quÃ¨!");
                break;
        }
        if(doc!= null) {
	        doc.inputFromConsole();
        	documents.add(doc);
	        documentIDs.add(doc.getID());
        }
        if (select == 1 || select == 2 || select == 3) // xem co cach nao ko can or nhieu th nay ko?
            System.out.println("TÃ i liá»‡u thÃªm: " + documents.get(documents.size() - 1));

    }

    public static void removeDocumentById() {
        System.out.print("Nháº­p ID tÃ i liá»‡u cáº§n xÃ³a: ");
        int inputID = scanIntIn();
        boolean isFound = false;
        for (Document document : documents)
            if (document.getID() == inputID) {
                System.out.println("XÃ³a " + document);
                documents.remove(document);
                isFound = true;
                return;
            }
        System.out.println("TÃ i liá»‡u " + inputID + " khÃ´ng tá»“n táº¡i");
    }

    public static void showDocumentList() {
        System.out.println("----- DANH SÃ�CH TÃ€I LIá»†U -----");
        for (Document document : documents)
            System.out.println(document);
    }

    public static void findDocumentByType() {
        printDocumentTypes();
        int select = scanIntIn();
        Class documentType = null;
        // ddoanj nay xem co cau hinh cho 
        //  key = numbre
        //  value = documentType 
        //  de tim cho gon ko
        if (select == 1)
            documentType = Book.class;
        else if (select == 2)
            documentType = Magazine.class;
        else if (select == 3)
            documentType = Newspaper.class;
        else System.out.println("MÃ y tá»± Ä‘i mua tÃ i liá»‡u cá»§a mÃ y Ä‘i!");
        
//        documents.stream().filter(null).forEach(null);  // thu dung stream API cua collection xem sao nhe?
        for (Document document : documents)  
            if (document.getClass() == documentType)  // so sanh 2 Object han che so sanh == vi khar nang sai kha cao?
                System.out.println(document);
    }

    public static void printDocumentTypes() {
        System.out.println("----- CÃ¡c loáº¡i tÃ i liá»‡u -----");
        System.out.println("1. SÃ¡ch");
        System.out.println("2. Táº¡p chÃ­");
        System.out.println("3. BÃ¡o");
        System.out.println("-----------------------------");
        System.out.print("Lá»±a chá»�n: ");
    }

}
