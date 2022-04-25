package test.assignment10.back_end;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

import static test.assignment10.back_end.Utilities.scanIntIn;
import static test.assignment10.back_end.Utilities.scanner;

public class Exercise1 {
    private static String dbURL = "jdbc:mysql://localhost:3306/testing_system_assignment_1";
    private final static Connection connection = createConnection(dbURL);
    public void question1() throws SQLException {
        if (connection != null) {
            System.out.println("Connected!");
        }
    }
    public void question2() throws SQLException {
        if (connection != null) {
            var selectPositionString = "SELECT * FROM positions";
            var statement = connection.createStatement();
            var resultSet = statement.executeQuery(selectPositionString);
            while (resultSet.next()) {
                System.out.printf("%5d ", resultSet.getInt(1));
                System.out.printf("%-20s", resultSet.getString(2));
                System.out.println();
            }
        }
    }

    public void question3() {
        if (connection != null) {
            var createPositionString = "INSERT INTO positions(position_name)" +
                    "VALUES (?)";
            try {
                var prepareStatment = connection.prepareStatement(createPositionString);
                System.out.print("Nhập tên Position muốn nhập: ");
                prepareStatment.setString(1, scanner.nextLine().trim());
                int extraRow = prepareStatment.executeUpdate();
                System.out.println("Thêm " + extraRow + " dòng thành công!");
            } catch (SQLException e) {
                System.out.println("Thêm position thất bại.");
            }
        }
    }

    public void question4() {
        if (connection != null) {
            var updatePositionString = "UPDATE positions SET position_name = ? WHERE position_id = ?";
            try {
                var preparedStatement = connection.prepareStatement(updatePositionString);
                preparedStatement.setString(1,"Dev");
                preparedStatement.setInt(2,5);
                int extraRow = preparedStatement.executeUpdate();
                System.out.println("Kết quả Update");
                question2();
            } catch (SQLException e) {
                System.out.println("Update thất bại.");
            }
        }
    }

    public void question5() {
        if (connection != null) {
            var deletePositionString = "DELETE FROM positions WHERE position_id = ?";
            try {
                var preparedStatement = connection.prepareStatement(deletePositionString);
                System.out.print("Nhập Position ID muốn xóa: ");
                preparedStatement.setInt(1,scanIntIn());
                int extraRow = preparedStatement.executeUpdate();
                System.out.println("Xóa " + extraRow + " dòng thành công!");

            } catch (SQLException e) {
                System.out.println("Delete thất bại.");
            }
        }
    }

    private static Connection createConnection(String dbURL) {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(dbURL,"root","root");
        } catch (SQLException e) {
            System.out.println("Không kết nối được Database.");
        }
        return connection;
    }

    private static boolean isConnected(Connection connection) {
        try {
            connection.isValid(2);
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
}
