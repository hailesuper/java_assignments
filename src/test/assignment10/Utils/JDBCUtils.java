package test.assignment10.Utils;

import java.sql.*;

public class JDBCUtils {
    public Connection getLocalHostConnection(String dbName) {
        var dbURL = "jdbc:mysql://localhost:3306/" + dbName;
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(dbURL,"root","root");
        } catch (SQLException e) {
            System.out.println("Kết nối thất bại. Lý do: " + e.getMessage());
        }
        return connection;
    }
}
