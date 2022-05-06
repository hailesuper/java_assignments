package test.assignment08.front_end;

import test.assignment08.back_end.Exercise1;

import static test.assignment05.Exercise1Interface.Question2Optional.back_end.Management.*;
import static test.assignment05.Exercise1Interface.Question2Optional.back_end.Utilities.*;

public class Main {
    public static void main(String[] args) {
        var ex1 = new Exercise1();
        boolean isDone = false;
        while (!isDone) {
            printInstruction();
            int select = scanIntIn();
            switch (select) {
                case 1:
                    ex1.question1();
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
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
