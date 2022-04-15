package test.assignment05.Exercise1Interface.Question2Optional.front_end;

import test.assignment05.Exercise1Interface.Question2Optional.back_end.TuyenSinh;

import java.util.concurrent.TimeUnit;

import static test.assignment05.Exercise1Interface.Question2Optional.back_end.Management.*;
import static test.assignment05.Exercise1Interface.Question2Optional.back_end.Utilities.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        var tuyenSinh = new TuyenSinh();
        boolean isDone = false;
        while (!isDone) {
            printInstruction();
            System.out.print("Lựa chọn: ");
            int select = scanIntIn();
            switch (select) {
                case 1:
                    tuyenSinh.addStudent();
                    break;
                case 2:
                    tuyenSinh.showStudentInfo();
                    TimeUnit.SECONDS.sleep(3);
                    break;
                case 3:
                    tuyenSinh.searchByID();
                    TimeUnit.SECONDS.sleep(3);
                    break;
                case 4:
                    System.out.println("---------- KẾT THÚC ----------");
                    isDone = true;
                    tuyenSinh.exit();
                    break;
                default:
                    System.out.println("Mày đùa tao à?");
                    TimeUnit.SECONDS.sleep(3);
                    break;
            }

        }
    }
}
