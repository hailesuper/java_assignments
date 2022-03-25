package test.assignment02advanced;

import java.util.Formatter;
import java.util.Locale;

public class Exercise3 {
    public static void main(String[] args) {
        System.out.println("----- Question 1: ------");
//        question1();
        StringBuilder sb = new StringBuilder();
        // Send all output to the Appendable object sb
        Formatter formatter = new Formatter(sb, Locale.US);

        // Explicit argument indices may be used to re-order output.
        formatter.format("%4$2s %3$2s %2$2s %1$2s", "a", "b", "c", "d");
        // -> " d  c  b  a"

        // Optional locale as the first argument can be used to get
        // locale-specific formatting of numbers.  The precision and width can be
        // given to round and align the value.
        formatter.format(Locale.FRANCE, "e = %+10.4f", Math.E);
        // -> "e =    +2,7183"

        // The '(' numeric flag may be used to format negative numbers with
        // parentheses rather than a minus sign.  Group separators are
        // automatically inserted.
        System.out.printf("Amount gained or lost since last statement: $ %(,.2f",
                6217.58);
        System.out.println();
        System.out.printf("Amount gained or lost since last statement: $ %(,.2f",
                -6324217.58);
        // -> "Amount gained or lost since last statement: $ (6,217.58)"
    }

//    Question 1:
//    Khai báo 1 số nguyên = 5 và sử dụng lệnh System out printf để in ra số
//    nguyên đó
    public static void question1() {
        int n = 5;
        System.out.printf("n = ", n);

    }
//    Question 2:
//    Khai báo 1 số nguyên = 100 000 000 và sử dụng lệnh System out printf để in
//    ra số nguyên đó thành định dạng như sau: 100,000,000
//    Question 3:
//    Khai báo 1 số thực = 5,567098 và sử dụng lệnh System out printf để in ra số
//    thực đó chỉ bao gồm 4 số đằng sau
//    Question 4:
//    Khai báo Họ và tên của 1 học sinh và in ra họ và tên học sinh đó theo định
//    dạng như sau:
//    Họ và tên: "Nguyễn Văn A" thì sẽ in ra trên console như sau:
//    Tên tôi là "Nguyễn Văn A" và tôi đang độc thân.
//
//            Question 5:
//    Lấy thời gian bây giờ và in ra theo định dạng sau:
//            24/04/2020 11h:16p:20s
//    Question 6:
//    In ra thông tin account (như Question 8 phần FOREACH) theo định dạng
//    table (giống trong Database)

}

