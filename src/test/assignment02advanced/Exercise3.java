package test.assignment02advanced;

import test.assignment00.*;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;
import java.util.Formatter;
import java.util.Locale;

import static test.assignment00.Program.*;

public class Exercise3 {
    public static void main(String[] args) {
//        Locale vietnameseLocale = new Locale("vi");
//        DateFormat df = DateFormat.getDateInstance(DateFormat.DEFAULT, vietnameseLocale);
//        System.out.println("Print NOW");
//        System.out.println(df.format(new Date()));
//
//        System.out.println("Print aDate");
//        System.out.println(df.format(new Date(2022,1,30)));
//
//        System.out.println("Print LocalDate");
//        System.out.println(exams[0].createDate);
//        System.out.println(df.format(exams[0].createDate));

//        System.out.println("----- Question 1 -----");
//        System.out.println(exams[0].createDate);
//        question1(exams[0]);

        System.out.println("----- Question 2 -----");
        question2(exams[0]);
    }

//    Exercise 3 (Optional): Date Format
//    Question 1:
//    In ra thông tin Exam thứ 1 và property create date sẽ được format theo định
//    dạng vietnamese
    public static Locale vietnameseLocale = new Locale("vi");

    public static void question1(Exam exam) {
        DateFormat df = DateFormat.getDateInstance(DateFormat.DEFAULT, vietnameseLocale);
        System.out.println(df.format(exam.createDate));
    }
//    Question 2:
//    In ra thông tin: Exam đã tạo ngày nào theo định dạng
//    Năm – tháng – ngày – giờ – phút – giây
    private static void question2(Exam exam) {
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL);
        System.out.println("Ngày tạo exam " + exam.examID + exam.createDate.format(formatter));
    }
//    Question 3:
//    Chỉ in ra năm của create date property trong Question 2
//
//            4
//
//    Question 4:
//    Chỉ in ra tháng và năm của create date property trong Question 2
//    Question 5:
//    Chỉ in ra "MM-DD" của create date trong Question 2

}

