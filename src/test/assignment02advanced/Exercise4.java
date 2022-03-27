package test.assignment02advanced;

import java.time.LocalDate;
import java.util.Random;

public class Exercise4 {
    public static void main(String[] args) {
        System.out.println("----- Question 1: ------");
        question1();

        System.out.println("----- Question 2: ------");
        question2();

        System.out.println("----- Question 3: ------");
        question3(new String[] {"Hai 1", "Hai 2", "Hai 3", "Hai 4"});

        System.out.println("----- Question 4: ------");
        question4(LocalDate.of(1995,7,24),
                LocalDate.of(1995,12,20));

        System.out.println("----- Question 5: ------");
        question5();

        System.out.println("----- Question 6: ------");
        question6();

        System.out.println("----- Question 7: ------");
        question7();
    }
    private static Random random = new Random();
    //    Exercise 4 (Optional): Random Number
//    Question 1:
//    In ngẫu nhiên ra 1 số nguyên
    private static void question1() {
        System.out.println("Số nguyên ngẫu nhiên: ");
        System.out.println(random.nextInt());
    }
//    Question 2:
//    In ngẫu nhiên ra 1 số thực
    private static void question2() {
        System.out.println("Số thực (Double) ngẫu nhiên: ");
        System.out.println(random.nextDouble());
    }

//    Question 3:
//    Khai báo 1 array bao gồm các tên của các bạn trong lớp, sau đó in ngẫu nhiên
//    ra tên của 1 bạn
    private static void question3(String[] names) {
        System.out.println("Tên ngẫu nhiên:");
        int randomIndex = random.nextInt(names.length);
        System.out.println(names[randomIndex]);
    }
//    Question 4:
//    Lấy ngẫu nhiên 1 ngày trong khoảng thời gian 24-07-1995 tới ngày 20-12-
//            1995
    private static void question4(LocalDate startDate, LocalDate endDate) {
        int epochStart = (int) startDate.toEpochDay();
        int epochEnd = (int) endDate.toEpochDay();
        int randomEpochDay = epochStart + random.nextInt(epochEnd - epochStart);
        // only nexInt() can random within a range nextInt(int bound)
        System.out.println("Ngày ngẫu nhiên:");
        System.out.println(LocalDate.ofEpochDay(randomEpochDay));
    }
//    Question 5:
//    Lấy ngẫu nhiên 1 ngày trong khoảng thời gian 1 năm trở lại đây
    private static void question5() {
        int epochNow = (int) LocalDate.now().toEpochDay();
        int randomEpochDay = epochNow - 365 +
                random.nextInt(epochNow - (epochNow - 365));
        System.out.println("Ngày ngẫu nhiên trong 1 năm gần đây: ");
        System.out.println(LocalDate.ofEpochDay(randomEpochDay));
    }

    private static void question5Advanced() {
        int epochNow = (int) LocalDate.now().toEpochDay();
        int randomEpochDay = epochNow - 365 +
                random.nextInt(epochNow - (epochNow - 365));
        System.out.println("Ngày ngẫu nhiên trong 1 năm gần đây: ");
        System.out.println(LocalDate.ofEpochDay(randomEpochDay));
    }
//    Question 6:
//    Lấy ngẫu nhiên 1 ngày trong quá khứ
    private static void question6() {
        int randomPastEpochDay = random.nextInt((int) LocalDate.now().toEpochDay());
        System.out.println("Ngày ngẫu nhiên trong quá khứ: ");
        System.out.println(LocalDate.ofEpochDay(randomPastEpochDay));
    }
//    Question 7:
//    Lấy ngẫu nhiên 1 số có 3 chữ số
    private static void question7() {
        System.out.println("Số có 3 chữ số ngẫu nhiên:");
        System.out.println(random.nextInt(1000 - 99) + 99);
    }
}
