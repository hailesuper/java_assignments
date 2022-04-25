package test.assignment10.back_end;

import test.assignment10.Utils.JDBCUtils;
import test.assignment10.entity.Department;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static test.assignment10.back_end.Utilities.scanIntIn;
import static test.assignment10.back_end.Utilities.scanner;

public class DepartmentDao {
    private Connection connection;

    public DepartmentDao() {
        this.connection = new JDBCUtils().getLocalHostConnection("testing_system_assignment_1");
    }

    public List<Department> getDepartments() {
        List<Department> departments = new ArrayList<>();
        if (connection != null) {
            try {
                var statement = connection.createStatement();
                var selectDepartmentString = "SELECT * FROM departments";
                var resultSet = statement.executeQuery(selectDepartmentString);
                while (resultSet.next()) {
                    var department = new Department(resultSet.getInt(1),
                            resultSet.getString(2));
                    departments.add(department);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return departments;
    }

    public Department getDepartmentID5() {
        Department department = null;
        if (connection != null) {
                        try {
                var selectDepartmentByID = "SELECT * FROM departments WHERE department_id = ?";
                var preparedStatement = connection.prepareStatement(selectDepartmentByID);
                preparedStatement.setInt(1,5);
                var resultSet = preparedStatement.executeQuery();
                if (resultSet.next()) {
                    department = new Department(resultSet.getInt(1),
                            resultSet.getString(2));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
        return department;
    }

    public Department getDepartmentID(int searchID) {
        Department department = null;
        if (connection != null) {
            try {
                var selectDepartmentByID = "SELECT * FROM departments WHERE department_id = ?";
                var preparedStatement = connection.prepareStatement(selectDepartmentByID);
                preparedStatement.setInt(1,searchID);
                var resultSet = preparedStatement.executeQuery();
                if (resultSet.next()) {
                    department = new Department(resultSet.getInt(1),
                            resultSet.getString(2));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
        return department;
    }

    public boolean hasDepartmentName(String departmentName) {
        boolean hasDepartmentName = false;
        if (connection != null) {
            try {
                var selectDepartmentByID = "SELECT * FROM departments WHERE department_name = ?";
                var preparedStatement = connection.prepareStatement(selectDepartmentByID);
                preparedStatement.setString(1,departmentName);
                var resultSet = preparedStatement.executeQuery();
                if (resultSet.next()) {
                    hasDepartmentName = true;
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
        return hasDepartmentName;
    }

    public boolean hasDepartmentID(int departmentID) {
        boolean hasDepartmentID = false;
        if (connection != null) {
            try {
                var selectDepartmentByID = "SELECT * FROM departments WHERE department_id = ?";
                var preparedStatement = connection.prepareStatement(selectDepartmentByID);
                preparedStatement.setInt(1,departmentID);
                var resultSet = preparedStatement.executeQuery();
                if (resultSet.next()) {
                    hasDepartmentID = true;
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
        return hasDepartmentID;
    }

    public void createDepartment(String departmentName) {
        if (hasDepartmentName(departmentName))
            System.out.println("Department đã tồn tại");
        else {
            if (connection != null) {
                var insertDepartmentString = "INSERT INTO departments(department_name) VALUES (?)";
                try {
                    var preparedStatement = connection.prepareStatement(insertDepartmentString);
                    preparedStatement.setString(1,departmentName);
                    int extraRow = preparedStatement.executeUpdate();
                    System.out.println("Đã thêm " + extraRow + " dòng");
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public void updateDepartmentName(int departmentID, String newDepartmentName) {
        if (hasDepartmentID(departmentID)) {
            if (!hasDepartmentName(newDepartmentName)) {
                var updateDepartmentNameString = "UPDATE departments SET department_name = ? WHERE department_id = ?";
                try {
                    var preparedStatement = connection.prepareStatement(updateDepartmentNameString);
                    preparedStatement.setInt(2,departmentID);
                    preparedStatement.setString(1,newDepartmentName);
                    preparedStatement.executeUpdate();
                    System.out.println(getDepartmentID(departmentID));

                } catch (SQLException e) {
                    e.printStackTrace();
                }
            } else System.out.println(newDepartmentName + " đã có");
        } else System.out.println(departmentID + " không tồn tại");
    }

    public void deleteDepartmentById(int departmentID) {
        if (hasDepartmentID(departmentID)) {
            var deleteDepartmentString = "DELETE FROM departments WHERE department_id = ?";
            try {
                var preparedStatement = connection.prepareStatement(deleteDepartmentString);
                preparedStatement.setInt(1,departmentID);
                int _row = preparedStatement.executeUpdate();
                System.out.println("Đã xóa " + _row + " dòng");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else System.out.println(departmentID + " không tồn tại");
    }
}
