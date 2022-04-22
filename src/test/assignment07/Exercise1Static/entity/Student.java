package test.assignment07.Exercise1Static.entity;

import static test.assignment07.Exercise1Static.back_end.Utilities.scanner;

public class Student {
    protected static int counter = 0;
    protected int id;
    protected String name;
    protected static String college;
    protected static double groupMoney;

    public Student(String name) {
        if (counter >= 7) {
            System.out.println("Vượt quá 7 học sinh. Không thể tạo thêm");
            return;
        } else {
            this.id = ++counter;
            this.name = name;
        }
    }

    public static void setCollege(String college) {
        Student.college = college;
    }

    public String getName() {
        return name;
    }

    public static int getCounter() {
        return counter;
    }

    public void addGroupMoney(double amount) {
        groupMoney += amount;
        System.out.printf("Tiền quỹ hiện tại %,.2f\n", groupMoney);
        System.out.println("-----------");
    }

    public void updateNewCollege() {
        System.out.println("Đại học mới: ");
        Student.college = scanner.nextLine();
    }

    public static String getCollege() {
        return college;
    }
    public static void numberOfStudents() {
        System.out.println("Số sinh viên hiện tại: " + counter);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", college='" + college + '\'' +
                '}';
    }
}
