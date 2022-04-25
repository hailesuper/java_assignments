package test.assignment10.back_end;

import test.assignment10.entity.Department;

import static test.assignment10.back_end.Utilities.scanIntIn;
import static test.assignment10.back_end.Utilities.scanner;

public class Exercise2 {
    private final DepartmentDao departmentDao;

    public Exercise2() {
        this.departmentDao = new DepartmentDao();
    }

    public void question1() {
        var departments = departmentDao.getDepartments();
        for (Department department : departments)
            System.out.println(department.toString());
    }

    public void question2() {
        var department = departmentDao.getDepartmentID5();
        if (department != null)
            System.out.println(department);
    }

    public void question3() {
        System.out.print("Department ID muốn tìm: ");
        int searchID = scanIntIn();
        var department = departmentDao.getDepartmentID(searchID);
        if (department != null)
            System.out.println(department);
    }

    public void question4() {
        System.out.print("Nhập Department Name muốn tìm: ");
        if (departmentDao.hasDepartmentName(scanner.nextLine())) {
            System.out.println("Has");
        } else
            System.out.println("Not");
    }

    public void question5() {
        System.out.print("Nhập deparment name muốn thêm: ");
        departmentDao.createDepartment(scanner.nextLine());
    }

    public void question6() {
        System.out.print("DepartmentID muốn đổi tên: ");
        int departmentID = scanIntIn();
        System.out.print("DepartmentName mới: ");
        String departmentName = scanner.nextLine();
        departmentDao.updateDepartmentName(departmentID,departmentName);
    }

    public void question7() {
        System.out.print("DepartmentID muốn xóa: ");
        int departmentID = scanIntIn();
        departmentDao.deleteDepartmentById(departmentID);
    }

    public void question8() {

    }

}
