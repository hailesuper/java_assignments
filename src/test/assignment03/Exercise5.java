package test.assignment03;

import test.assignment00.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static test.assignment00.Program.*;

public class Exercise5 {
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
                case 4:
                    question4();
                    break;
                case 5:
                    question5();
                    break;
                case 6:
                    question6C2();
                    break;
                case 7:
                    question7();
                    break;

            }
            System.out.print("Bạn có muốn tiếp tục (Y/N)? ");
            if (scanner.nextLine().toLowerCase().equals("n"))
                isDone = true;
        }

    }
//        Question 1:
//        In ra thông tin của phòng ban thứ 1 (sử dụng toString())
    public static void question1() {
        System.out.println(departments[0]);
    }
    //        Question 2:
//        In ra thông tin của tất cả phòng ban (sử dụng toString())
    public static void question2() {
        for (Department department : departments)
            System.out.println(department);
    }
    //        Question 3:
//        In ra địa chỉ của phòng ban thứ 1
    public static void question3() {
        System.out.println(departments[0].hashCode());
    }
//        Question 4: Kiểm tra xem phòng ban thứ 1 có tên là "Phòng A" không?
    public static void question4() {
        System.out.println(departments[0].departmentName.equals("Phòng A") ?
                "Là Phòng A" :
                "Không là phòng A mà là Phòng " + departments[0].departmentName);
    }
    //        Question 5: So sánh 2 phòng ban thứ 1 và phòng ban thứ 2 xem có bằng nhau
//        không (bằng nhau khi tên của 2 phòng ban đó bằng nhau)
    public static void question5() {
        System.out.println(departments[0].departmentName.equals(departments[1].departmentName) ?
                "Hai phòng có tên giống nhau" :
                "Hai phòng có tên khác nhau");
    }
    //        Question 6: Khởi tạo 1 array phòng ban gồm 5 phòng ban, sau đó in ra danh
//        sách phòng ban theo thứ tự tăng dần theo tên (sắp xếp theo vần ABCD)
//        VD:
//        Accounting
//        Boss of director
//        Marketing
//        Sale
//        Waiting room
    public static void question6() {
        ArrayList<Department> departments = new ArrayList<>(Arrays.asList(Program.departments));
        Department department4 = new Department((byte) 4, "Accounting");
        Department department5 = new Department((byte) 5, "Waiting Department");
        departments.add(department4);
        departments.add(department5);

//        Department[] departmentsArray = (Department[]) departments.toArray();
//        for (Department department : departmentsArray) {
//            System.out.println(department.departmentName);
//        }
    }

    public static void question6C2() {
        var department1 = new Department((byte) 1, "Board of directors");
        var department2 = new Department((byte) 2, "Sales");
        var department3 = new Department((byte) 3, "Marketing");
        var department4 = new Department((byte) 4, "Accounting");
        var department5 = new Department((byte) 5, "Waiting Department");
        Department[] departments = {department1,department2,department3,department4,department5};
        for (int i=0; i< departments.length; i++) {
            for (int j=i+1; j< departments.length -1; j++)
            {
                if (departments[i].departmentName.compareToIgnoreCase(departments[j].departmentName) > 0) {
                    Department departmentTemp = departments[i];
                    departments[i] = departments[j];
                    departments[j] = departmentTemp;
                }
            }
        }
        for (Department department : departments) {
            System.out.println(department);
        }
    }


    public static void question7() {
        var department1 = new Department((byte) 1, "Board of directors");
        var department2 = new Department((byte) 2, "Sales");
        var department3 = new Department((byte) 3, "Marketing");
        var department4 = new Department((byte) 4, "Accounting");
        var department5 = new Department((byte) 5, "Waiting Department");
        Department[] departments = {department1,department2,department3,department4,department5};
        for (int i=0; i< departments.length; i++) {
            for (int j=i+1; j< departments.length -1; j++) {
                String firstName = departments[i].departmentName.split(" ")[departments[i].departmentName.split(" ").length-1];
                String secondName = departments[j].departmentName.split(" ")[departments[j].departmentName.split(" ").length-1];

                if (firstName.compareToIgnoreCase(secondName) > 0) {
                    Department departmentTemp = departments[i];
                    departments[i] = departments[j];
                    departments[j] = departmentTemp;
                }
            }

        }
        for (Department department : departments) {
            System.out.println(department);
        }
    }

    public static void printInstruction(){
        System.out.println("------------ START ------------");
        System.out.println("Chọn chương trình muốn chạy:");
        System.out.println("1. In ra thông tin của phòng ban thứ 1");
        System.out.println("2. In ra thông tin của tất cả phòng ban");
        System.out.println("3. In ra địa chỉ của phòng ban thứ 1");
        System.out.println("4. Kiểm tra xem phòng ban thứ 1 có tên là \"Phòng A\" không?");
        System.out.println("5. So sánh 2 phòng ban thứ 1 và phòng ban thứ 2");
        System.out.println("6. Danh sách phòng ban theo thứ tự tăng dần");
        System.out.println("7. Danh sách phòng ban theo thứ tự tăng dần (tên cuối)");
        System.out.println("------------ SELECT ------------");

    }
}

//Exercise 5: Object’s Method





//        Question 7: Khởi tạo 1 array học sinh gồm 5 Phòng ban, sau đó in ra danh
//        sách phòng ban được sắp xếp theo tên
//        VD:
//        Accounting
//        Boss of director
//        Marketing
//        waiting room
//        Sale
