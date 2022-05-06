package test.assignment10.front_end;

import test.assignment10.back_end.Exercise5;

import java.io.IOException;
import java.sql.SQLException;

public class Program5 {
    public static void main(String[] args) throws SQLException, IOException {
        var ex5 = new Exercise5();
        System.out.println("Kết nối database");
        var connection = ex5.getConnection("testing_system_assignment_1");
        System.out.println("--------------------");
        System.out.println("Kiếm tra kết nối");
        ex5.isConnected(connection);
        System.out.println("--------------------");
        System.out.println("Kết nối lại thử");
        ex5.getConnection("testing_system_assignment_1");
        System.out.println("--------------------");
        System.out.println("Ngắt kết nối");
        ex5.disconnect();
        ex5.isConnected(connection);
        System.out.println("--------------------");

    }
}
