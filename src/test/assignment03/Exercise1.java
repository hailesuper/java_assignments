package test.assignment03;

import java.util.Arrays;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

import static test.assignment00.Program.*;

public class Exercise1 {
    public static Scanner scanner = new Scanner(System.in);

    public static Locale locale = new Locale("vi");
    public static void main(String[] args) {
        boolean isNotDone = true;
        while (isNotDone) {
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
                case 21:
                    question2String();
                    break;
                case 3:
                    question3();
                    break;
                case 4:
                    question4();
                    break;
            }
            System.out.print("Bạn có muốn tiếp tục? Y/N: ");
            if (scanner.nextLine().toLowerCase().equals("n")) {
                isNotDone = false;
                System.out.println("-------- KẾT THÚC --------");
            }
        }

        scanner.close();
    }
    private static void printInstruction() {
        System.out.println("-------- BẮT ĐẦU --------");
        System.out.println("Nhập Question bạn muốn chạy: ");
        System.out.println("1. In lương số nguyên");
        System.out.println("2. Ngẫu nhiên số có 5 chữ số");
        System.out.println("21. Ngẫu nhiên số có 5 chữ số (String)");
        System.out.println("3. Lấy ra 2 số cuối");
        System.out.println("4. Kết quả phép chia");
        System.out.println("--------------------------");
        System.out.print("Lựa chọn: ");
    }
//Exercise 1 (Optional): Datatype Casting
//        Question 1:
//        Khai báo 2 số lương có kiểu dữ liệu là float.
//        Khởi tạo Lương của Account 1 là 5240.5 $
//        Khởi tạo Lương của Account 2 là 10970.055$
//        Khai báo 1 số int để làm tròn Lương của Account 1 và in số int đó ra
//        Khai báo 1 số int để làm tròn Lương của Account 2 và in số int đó ra
    public static void question1() {
        accounts[0].salary = 5240.5F;
        accounts[1].salary = 10970.055F;

        int account1SalaryInt = (int) accounts[0].salary;
        int account2SalaryInt = (int) accounts[1].salary;

        System.out.printf(locale,"Lương của Account 1: %,d $, \nLương của Account 2: %,d $\n",
                account1SalaryInt, account2SalaryInt);
    }
//        Question 2:
//        Lấy ngẫu nhiên 1 số có 5 chữ số (những số dưới 5 chữ số thì sẽ thêm
//        có số 0 ở đầu cho đủ 5 chữ số)
    public static int question2() {
        Random random = new Random();
        int number = random.nextInt(100_000 - 10_000) + 10_000;
        System.out.println("Số lấy ra ngầu nhiên: " + number);
        return number;
    }
//        Lấy ngẫu nhiên 1 số có tối đa 5 chữ số (những số dưới 5 chữ số thì sẽ thêm
//        có số 0 ở đầu cho đủ 5 chữ số)
    public static String question2String() {
        Random random = new Random();
        int number = random.nextInt(100_000);
        String returnNumberString = String.valueOf(number);
        returnNumberString = "0".repeat(5 - returnNumberString.length()) + returnNumberString;
        System.out.println("Số lấy ra ngầu nhiên: " + returnNumberString);
        return returnNumberString;
    }
//        Question 3:
//        Lấy 2 số cuối của số ở Question 2 và in ra.
//        Gợi ý:
//        Cách 1: convert số có 5 chữ số ra String, sau đó lấy 2 số cuối
//        Cách 2: chia lấy dư số đó cho 100
    public static void question3() {
        String numberString = question2String();
        // substirng
//        System.out.println("2 số cuối là (substring): " + numberString.substring(3));
//        // String.valueOf
        int length = numberString.length();
////        String last2Digits = String.valueOf(numberString.charAt(length-2))
////                + String.valueOf(numberString.charAt(length-1));
////        System.out.println("2 số cuối là (substring): " + last2Digits);
        String temp = String.valueOf(numberString.charAt(length-2) + numberString.charAt(length-1)); // WHY WRONG?
        System.out.println(temp);
//        String last2Digits = String.valueOf(numberString.charAt(length-2))
//                + String.valueOf(numberString.charAt(length-1));
//        System.out.println(last2Digits);
//        // StringBuilder
//        char[] last2DigitsArray = new char[2];
//        numberString.getChars(length-2, length,last2DigitsArray,0);
////        last2Digits = Arrays.toString(last2DigitsArray); // [2, 7]
//        StringBuilder last2DigitsBuilder = new StringBuilder();
//        last2DigitsBuilder.append(last2Digits);
//        System.out.println("2 số cuối là (String Builder): " + last2DigitsBuilder);
    }
//        Question 4:
//        Viết 1 method nhập vào 2 số nguyên a và b và trả về thương của chúng
    public static void question4() {
        System.out.print("Nhập vào số bị chia: ");
        int divident = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập vào số chia: ");
        int divisor = scanner.nextInt();
        scanner.nextLine();
        System.out.printf(locale, "Kết quả Thương của %d chia %d là %,.2f\n", divident, divisor, (double) divident/divisor);
    }
}


