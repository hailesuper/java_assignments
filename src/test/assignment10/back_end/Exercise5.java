package test.assignment10.back_end;

import java.sql.*;

public class Exercise5 {
    public boolean isConnected(Connection connection) throws SQLException {
        if (connection.isValid(5))
            return true;
        return false;
    }

    public Connection getConnection()
}
