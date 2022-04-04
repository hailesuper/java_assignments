package test.assignment03;

import test.assignment00.Group;

import java.util.*;

import static test.assignment00.Program.groups;

public class Exercise4 {
    private static Scanner scanner = new Scanner(System.in);
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
                case 4:
                    question4();
                    break;
                case 5:
                    question5();
                    break;
                case 6:
                    question6();
                    break;
                case 7:
                    question7();
                    break;
                case 8:
                    question8();
                    break;
                case 9:
                    question9();
                    break;
                case 10:
                    question10();
                    break;
                case 11:
                    question11();
                    break;
                case 12:
                    question12();
                    break;
                case 13:
                    question13();
                    break;
                case 14:
                    question14();
                    break;
                case 15:
                    question15();
                    break;
                case 16:
                    question1Tuoi();
                    break;
            }
            System.out.print("Bạn có muốn tiếp tujc (Y/N)? ");
            if (scanner.nextLine().toLowerCase().equals("n"))
                isDone = true;
        }

    }

    public static void printInstruction(){
        System.out.println("------------ START ------------");
        System.out.println("Chọn chương trình muốn chạy:");
        System.out.println("1. Đếm số lương các từ.");
        System.out.println("2. Nối string");
        System.out.println("3. Viết hoa chữ cái đầu tiên trong tên");
        System.out.println("4. In từng ký tự trong tên");
        System.out.println("5. In ra Họ và Tên");
        System.out.println("6. In ra họ, tên đệm, tên");
        System.out.println("------------ SELECT ------------");

    }
//    Exercise 4: String
//    Question 1:
//    Nhập một xâu kí tự, đếm số lượng các từ trong xâu kí tự đó (các từ có
//            thể cách nhau bằng nhiều khoảng trắng );
    private static String question1() {
        System.out.println("Nhập string muốn kiểm tra:");
        String string = scanner.nextLine();
        boolean hasDoubleSpace = true;
        while (hasDoubleSpace) {
            string = string.replace("  ", " ");
            if (!string.contains("  "))
                hasDoubleSpace = false;
        }
        string = string.trim();
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
//            if (String.valueOf(string.charAt(i)).equals(" ")) // Which one better?
            if (string.charAt(i) == ' ')
                count++;
        }
        if (count > 0)
            count++;
        System.out.printf("Số lượng từ trong \"%s\" là\n%d\n", string, count);
        return string;
    }

    public static void question1Tuoi() {
        System.out.println("Nhập vào String: ");
        Scanner tuoiScanner = new Scanner(System.in); // scan hinh anh, scan pdf
        String string = tuoiScanner.nextLine();
        string = string.trim();
        string = string.replaceAll("\\s+"," ");
        String[] strings = string.split(" ");
        int count = strings.length;
        System.out.println(count);

    }

    // LATER

    private static void question1StringBuilder() {
        System.out.println("Nhập string muốn kiểm tra:");
        String string = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder(string);
        boolean hasDoubleSpace = true;
        int i = 0;
        while (hasDoubleSpace) {
        }
    }
//    Question 2:
//    Nhập hai xâu kí tự s1, s2 nối xâu kí tự s2 vào sau xâu s1;
    private static void question2() {
        System.out.println("Nhập firstString:");
        String firstString = scanner.nextLine();
        System.out.println("Nhập secondString:");
        String secondString = scanner.nextLine();
        String string = firstString.concat(secondString);
        System.out.println("Kết quả nối string:\n" + string);
    }
//    Question 3:
//    Viết chương trình để người dùng nhập vào tên và kiểm tra, nếu tên chư
//    viết hoa chữ cái đầu thì viết hoa lên
    private static void question3() {
        System.out.print("Nhập họ và tên: ");
        StringBuilder fullName = new StringBuilder(scanner.nextLine().toLowerCase());
        boolean isDone = false;
        for (int i = 0; i < fullName.length(); i++) {
            if (i == 0 && Character.isAlphabetic(fullName.charAt(i))) {
                fullName.replace(i,i+1,fullName.substring(i,i+1).toUpperCase());
            } else if (Character.isAlphabetic(fullName.charAt(i))
                    && fullName.charAt(i-1) == ' ')
                fullName.replace(i,i+1, fullName.substring(i,i+1).toUpperCase());

        }
        System.out.println("Kết quả trả về: " + fullName);
    }

//    Question 4:
//    Viết chương trình để người dùng nhập vào tên in từng ký tự trong tên
//    của người dùng ra
//    VD:
//    Người dùng nhập vào "Nam", hệ thống sẽ in ra
//"Ký tự thứ 1 là: N"
//        "Ký tự thứ 1 là: A"
//        "Ký tự thứ 1 là: M"
    private static void question4() {
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        char spaceBar = '\u2423';
        for (int i=0; i<name.length(); i++) {
            if (name.charAt(i) == ' ')
                System.out.printf("Ký tự thứ %d là: %c\n", i, spaceBar);
            else
                System.out.printf("Ký tự thứ %d là: %c\n", i, name.charAt(i));
        }
    }
//
//    Question 5:
//    Viết chương trình để người dùng nhập vào họ, sau đó yêu cầu người
//    dùng nhập vào tên và hệ thống sẽ in ra họ và tên đầy đủ
    private static void question5() {
        System.out.print("Nhập họ: ");
        String lastName = scanner.nextLine().trim();
        System.out.print("Nhập tên: ");
        String firstName = scanner.nextLine().trim();
        String fullName = lastName.concat(" " + firstName);
        System.out.println("Họ và tên: " + fullName);
    }
//    Question 6:
//    Viết chương trình yêu cầu người dùng nhập vào họ và tên đầy đủ và
//    sau đó hệ thống sẽ tách ra họ, tên , tên đệm
//    VD:
//    Người dùng nhập vào "Nguyễn Văn Nam"
//    Hệ thống sẽ in ra
//"Họ là: Nguyễn"
//        "Tên đệm là: Văn"
//        "Tên là: Nam"
    private static void question6() {
        System.out.print("Nhập họ và tên: ");
        StringBuilder fullName = new StringBuilder(scanner.nextLine().trim());
        for (int i=1; i < fullName.length(); i++) {
            if (fullName.charAt(i) == ' ' && fullName.charAt(i+1) == ' ') {
                fullName.deleteCharAt(i);
                i--;
            }
        }
        String[] fullNameArray = fullName.toString().split(" ");
        if (fullNameArray.length > 0 && !Objects.equals(fullNameArray[0], "")) {
            System.out.println("Họ: " + fullNameArray[0]);
            if (fullNameArray.length > 2) {
                System.out.print("Đệm: ");
                for (int i = 1; i < (fullNameArray.length - 1); i++) {
                    if (i!=1) System.out.print(" ");
                    System.out.print(fullNameArray[i]);
                }
                System.out.println();
            }
            if (fullNameArray.length > 1)
                    System.out.println("Tên: " + fullNameArray[fullNameArray.length-1]);
        }
        else System.out.println("Nhập cái quần què gì vậy?");
    }

//
//    Question 7:
//    Viết chương trình yêu cầu người dùng nhập vào họ và tên đầy đủ và
//    chuẩn hóa họ và tên của họ như sau:
//    a) Xóa dấu cách ở đầu và cuối và giữa của chuỗi người dùng nhập
//    vào
//    VD: Nếu người dùng nhập vào " nguyễn văn nam " thì sẽ
//    chuẩn hóa thành "nguyễn văn nam"
//    b) Viết hoa chữ cái mỗi từ của người dùng
//    VD: Nếu người dùng nhập vào " nguyễn văn nam " thì sẽ
//    chuẩn hóa thành "Nguyễn Văn Nam"
    private static void question7() {
        System.out.print("Nhập họ và tên: ");
        String fullName = scanner.nextLine().trim();
        fullName = fullName.trim(); // delete white spaces beginning and and
        fullName = fullName.replaceAll("\\s+", " "); // \s whitespace "+" >=1
        StringBuilder fullNameBuilder = new StringBuilder(fullName);
        fullNameBuilder.replace(0,1,
                String.valueOf(fullNameBuilder.charAt(0)).toUpperCase());
        for (int i=1; i < fullNameBuilder.length(); i++) {
            if (fullNameBuilder.charAt(i) == ' ') {
                fullNameBuilder.replace(i+1,i+2,
                        String.valueOf(fullNameBuilder.charAt(i+1)).toUpperCase());
                i++;
            }
        }
        System.out.println("Kết quả trả về: " + fullNameBuilder);

    }
//
//    Question 8:
//    In ra tất cả các group có chứa chữ "Java"
    private static void question8() {
        int count = 0;
        for (Group group : groups) {
            if (group.groupName.contains("Java")) {
                System.out.println(group.groupName);
                count++;
            }
        }
        if (count == 0)
            System.out.println("Không có group có chứa \"Java\".");
    }
//    Question 9:
//    In ra tất cả các group "Java"
    private static void question9() {
        int count = 0;
        for (Group group : groups) {
            if (group.groupName.equals("Java Army")) {
                System.out.println(group.groupName);
                count++;
            }
        }
        if (count == 0)
            System.out.println("Không có group \"Java Army\".");
    }
//    Question 10 (Optional):
//    Kiểm tra 2 chuỗi có là đảo ngược của nhau hay không.
//    Nếu có xuất ra “OK” ngược lại “KO”.
//    Ví dụ “word” và “drow” là 2 chuỗi đảo ngược nhau.
    public static void question10() {
        System.out.print("Nhập chuỗi 1: ");
        String string1 = scanner.nextLine();
        System.out.print("Nhập chuỗi 2: ");
        String string2 = scanner.nextLine();
        boolean isReversed = true;
        if (string1.length() == string2.length()) {
            int length = string1.length();
            for (int i=0; i<Math.round(length/2); i++) {
                if (string1.charAt(i) != string2.charAt(length - i))
                    isReversed = false;
            }
        } else isReversed = false;
        System.out.println("Là đảo ngược? " + isReversed);
    }

//    Question 11 (Optional): Count special Character
//    Tìm số lần xuất hiện ký tự "a" trong chuỗi
    public static void question11() {
        System.out.println("Nhập chuỗi: ");
        String string = scanner.nextLine();
        int count = 0;
        for (int i=0; i < string.length(); i++)
            if (string.charAt(i) == 'a')
                count++;
        System.out.println("Số lượng a trong " + string + " là " + count);
    }

//    Question 12 (Optional): Reverse String
//    Đảo ngược chuỗi sử dụng vòng lặp
    public static void question12() {
        System.out.println("Nhập chuỗi: ");
        String string = scanner.nextLine();
        String reversedString = "";
        for (int i=string.length() - 1; i < 0; i--) {
            reversedString += string.charAt(i);
        }
        System.out.println("Chuỗi đảo: " + reversedString);
    }
//    Question 13 (Optional): String not contains digit
//    Kiểm tra một chuỗi có chứa chữ số hay không, nếu có in ra false ngược
//    lại true.
//    Ví dụ:
//            "abc" => true
//            "1abc", "abc1", "123", "a1bc", null => false
    public static void question13() {
        System.out.println("Nhập chuỗi: ");
        String string = scanner.nextLine();
        boolean hasDigit = false;
        for (int i=0; i<string.length(); i++) {
            if (string.charAt(i) >= '0' && string.charAt(i) <= '9') {
                hasDigit = true;
                break;
            }
        }
        System.out.println(hasDigit ? "Có chứa chữ số" : "Không chứa chữ số");
    }
//
//    Question 14 (Optional): Replace character
//    Cho một chuỗi str, chuyển các ký tự được chỉ định sang một ký tự khác
//    cho trước.
//    Ví dụ:
//            "VTI Academy" chuyển ký tự 'e' sang '*' kết quả " VTI Acad*my"
    public static void question14() {
        System.out.print("Nhập chuỗi: ");
        String string = scanner.nextLine();
        System.out.print("Giá trị đổi ở chuỗi hiện tại: ");
        String fromChar = scanner.nextLine();
        System.out.print("Giá trị đổi thành: ");
        String toChar = scanner.nextLine();

        string = string.replace(fromChar, toChar);
        System.out.println("Kết quả chuyển chuỗi " + string);

    }
//    Question 15 (Optional): Revert string by word
//    Đảo ngược các ký tự của chuỗi cách nhau bởi dấu cách mà không dùng
//    thư viện.
//    Ví dụ: " I am developer " => "developer am I".
//    Các ký tự bên trong chỉ cách nhau đúng một dấu khoảng cách.
//    Gợi ý: Các bạn cần loại bỏ dấu cách ở đầu và cuối câu, thao tác cắt
//    chuỗi theo dấu cách
    public static void question15() {
        System.out.print("Nhập chuỗi: ");
        String string = scanner.nextLine().trim();
        string = string.replaceAll("\\s+", " ");
        String[] strings = string.split(" ");
        String reversedString = "";
        for (int i=strings.length-1; i>=0; i--) {
            reversedString += strings[i] + " ";
        }
        reversedString = reversedString.trim();
        System.out.println("Đảo từ trong chuỗi: " + reversedString);

    }
//    Question 16 (Optional):
//    Cho một chuỗi str và số nguyên n >= 0. Chia chuỗi str ra làm các phần
//    bằng nhau với n ký tự. Nếu chuỗi không chia được thì xuất ra màn
//    hình “KO”.
//
    public static void question16() {
        System.out.print("Nhập chuỗi: ");
        String string = scanner.nextLine();
        System.out.println("Chiều dài mỗi phần tử sau khi tách: ");
        int elementLength = scanner.nextInt();
        scanner.nextLine();
        ArrayList<String> splitString = new ArrayList<>();
        if (string.length() < elementLength) {
            System.out.println("Chiều dài string < số lượng mỗi string sau tách");
            return;
        }
        String[] splitStrings = new String[string.length()];
        for (int i=0; i<string.length()-(elementLength+1); i+= elementLength) {

        }
//        string.substring();
    }

}
