package test.assignment10.back_end;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class Exercise5 {

    private Connection connection;

    public boolean isConnected(Connection connection) throws SQLException {
        if (connection.isValid(5)) {
            System.out.println("Connect successfully!");
            return true;
        } else {
            System.out.println("Không có kết nối!");
            return false;
        }
    }

    public Connection getConnection(String dbName) throws SQLException, IOException {
        if (connection == null || connection.isClosed()) {
           var dbProperties = new Properties();
           dbProperties.load(new FileInputStream("src/test/assignment10/resources/database.properties"));
           var url = dbProperties.getProperty("url");
           var username = dbProperties.getProperty("username");
           var password = dbProperties.getProperty("password");

           connection = DriverManager.getConnection(url + dbName,username,password);
           if (isConnected(connection))
               return connection;
           else System.out.println("Connect not successfully!");
        } else System.out.println("Đã có kết nối");
        return connection;
    }

    public void disconnect() throws SQLException {
        if (connection.isValid(3))
            connection.close();
    }
}
