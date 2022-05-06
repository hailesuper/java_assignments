package org.leraningjava.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCUtils {
    Connection connection;

    /**
     * Get connection to the database defined in the database.properties file in resources folder.
     * @return current connection if available; otherwise, new connection is created
     * @throws IOException the database.properties is not found
     * @throws SQLException if a database access error occurs
     */
    public Connection getConnection() throws IOException, SQLException {
        if (connection == null || connection.isClosed()) {
            // Get database properties
            Properties properties = new Properties();
            properties.load(new FileInputStream("src/main/resources/database.properties"));
            String url = properties.getProperty("url");
            String username = properties.getProperty("username");
            String password = properties.getProperty("password");

            // Create connection to the database
            this.connection = DriverManager.getConnection(url,username,password);
        }
        return connection;
    }

    /**
     * Disconnection the current not-closed connection.
     * @throws SQLException
     */
    public void disConnection() throws SQLException {
        if (connection != null && !connection.isClosed())
            connection.close();
    }
}
