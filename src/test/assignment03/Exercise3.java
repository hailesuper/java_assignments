package test.assignment03;

import java.util.Locale;
import java.util.Scanner;

public class Exercise3 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean isDone = false;
        while (!isDone) {
            printInstruction();
            int select = scanner.nextInt();
            scanner.nextLine();
            switch (select) {
                case 1:
                    question1();
                    break;
                case 2:
                    question2();
                    break;
                case 3:
                    question3();
                    break;
            }
            System.out.print("Bạn có muốn tiếp tục (Y/N)? ");
            if (scanner.nextLine().toLowerCase().equals("n"))
                isDone = true;
        }

    }
    private static void printInstruction() {
        System.out.println("-------- BẮT ĐẦU --------");
        System.out.println("Nhập Question bạn muốn chạy: ");
        System.out.println("1. In lương từ Integer sang float");
        System.out.println("2. Convert String ra số int");
        System.out.println("3. Convert Integer thành datatype int");
        System.out.println("--------------------------");
        System.out.print("Lựa chọn: ");
    }

//    Exercise 3(Optional): Boxing & Unboxing
//    Question 1:
//    Khởi tạo lương có datatype là Integer có giá trị bằng 5000.
//    Sau đó convert lương ra float và hiển thị lương lên màn hình (với số
//float có 2 số sau dấu thập phân)
    public static void question1() {
        Integer salary = 5000;
        float salaryFloat = Float.valueOf(salary);
        System.out.printf("Giá trị lương nhập vào: %.2f\n", salaryFloat);
    }
//    Question 2:
//    Khai báo 1 String có value = "1234567"
//    Hãy convert String đó ra số int
    public static void question2() {
        String numberString = "1234567";
        int number = Integer.parseInt(numberString);
        System.out.println(number);
    }
//    Question 3:
//    Khởi tạo 1 số Integer có value là chữ "1234567"
//    Sau đó convert số trên thành datatype int
    public static void question3() {
        Integer numberIntWrapper = Integer.valueOf("1234567");
        int number = numberIntWrapper;
        System.out.println(number);
    }
}
