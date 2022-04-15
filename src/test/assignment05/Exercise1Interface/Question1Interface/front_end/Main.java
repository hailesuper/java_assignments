package test.assignment05.Exercise1Interface.Question1Interface.front_end;

import test.assignment05.Exercise1Interface.Question1Interface.entity.News;

import static test.assignment05.Exercise1Interface.Question1Interface.back_end.MyNews.*;
import static test.assignment05.Exercise1Interface.Question1Interface.back_end.Utilities.scanIntIn;
import static test.assignment05.Exercise1Interface.Question1Interface.back_end.Utilities.scanner;

public class Main {
    public static void main(String[] args) {
        boolean isDone = false;
        while (!isDone) {
            printInstruction();
            System.out.print("Lựa chọn: ");
            int select = scanIntIn();
            switch (select) {
                case 1:
                    insertNews();
                    break;
                case 2:
                    for (News news : newsList)
                        news.display();
                    break;
                case 3:
                    newsList.get(newsList.size() - 1).calculate();
                    newsList.get(newsList.size() - 1).display();
                    break;
                case 4:
                    isDone = true;
                    scanner.close();
                    System.out.println("---------- KẾT THÚC ----------");
                    break;
                default:
                    System.out.println("Mày đùa tao à?");
                    break;
            }
        }

    }
}
