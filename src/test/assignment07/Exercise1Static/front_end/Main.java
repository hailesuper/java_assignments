package test.assignment07.Exercise1Static.front_end;

import static test.assignment05.Exercise1Interface.Question2Optional.back_end.Management.*;
import static test.assignment05.Exercise1Interface.Question2Optional.back_end.Utilities.*;

public class Main {
    public static void main(String[] args) {
        boolean isDone = false;
        while (!isDone) {
            printInstruction();
            int select = scanIntIn();
            switch (select) {
                case 1:

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
