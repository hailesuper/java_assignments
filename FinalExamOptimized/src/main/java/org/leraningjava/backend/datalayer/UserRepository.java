package org.leraningjava.backend.datalayer;

import org.leraningjava.entity.Admin;
import org.leraningjava.entity.Employee;
import org.leraningjava.entity.User;
import org.leraningjava.utils.JDBCUtils;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserRepository implements IUserRepository{

    private final JDBCUtils jdbcUtils;

    public UserRepository() {
        this.jdbcUtils = new JDBCUtils();
    }

    @Override
    public List<User> getUsers() throws SQLException, IOException {
        List<User> users = new ArrayList<>();
        Connection connection = jdbcUtils.getConnection();

        String sqlQuery = "SELECT id, full_name, email FROM users";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sqlQuery);

        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String fullName = resultSet.getString("full_name");
            String email = resultSet.getString("email");
            User user = new User(id,fullName,email);
            users.add(user);
        }

        jdbcUtils.disConnection();
        return users;
    }

    @Override
    public User getUserByID(int ID) throws SQLException, IOException {
        Connection connection = jdbcUtils.getConnection();

        String sqlQuery = "SELECT id, full_name, email, user_role, exp_in_year, pro_skill FROM users WHERE id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
        preparedStatement.setInt(1,ID);
        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            int id = resultSet.getInt("id");
            String fullName = resultSet.getString("full_name");
            String email = resultSet.getString("email");
            String role = resultSet.getString("user_role");
            if (role.equalsIgnoreCase("admin")) {
                int expInYear = resultSet.getInt("exp_in_year");
                return new Admin(id,fullName,email,expInYear);
            } else {
                String proSkill = resultSet.getString("pro_skill");
                return new Employee(id,fullName,email,proSkill);
            }
        }
        jdbcUtils.disConnection();
        return null;
    }

    @Override
    public boolean deleteUserByID(int ID) throws SQLException, IOException {
        Connection connection = jdbcUtils.getConnection();

        String sqlDelete = "DELETE FROM users WHERE id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sqlDelete);
        preparedStatement.setInt(1,ID);
        int rowCount = preparedStatement.executeUpdate();
        jdbcUtils.disConnection();
        return rowCount > 0;
    }

    @Override
    public User login(String email, String password) throws SQLException, IOException {
        Connection connection = jdbcUtils.getConnection();

        String sqlQuery = "SELECT id, full_name, user_role, exp_in_year, pro_skill FROM users " +
                "WHERE email = ? AND pass = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
        preparedStatement.setString(1,email);
        preparedStatement.setString(2,password);

        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            int id = resultSet.getInt("id");
            String fullName = resultSet.getString("full_name");
            String role = resultSet.getString("user_role");
            if (role.equalsIgnoreCase("admin")) {
                int expInYear = resultSet.getInt("exp_in_year");
                return new Admin(id,fullName,email,expInYear);
            } else {
                String proSkill = resultSet.getString("pro_skill");
                return new Employee(id,fullName,email,proSkill);
            }
        }
        jdbcUtils.disConnection();
        return null;
    }

    @Override
    public boolean addUser(String fullName, String email, String password, User.Role role, Integer expInYear, String proSkill) throws SQLException, IOException {
        Connection connection = jdbcUtils.getConnection();

        String sql = "INSERT INTO users(full_name,email,pass,user_role,exp_in_year,pro_skill) " +
                "VALUES (?,?,?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1,fullName);
        preparedStatement.setString(2,email);
        preparedStatement.setString(3,password);
        preparedStatement.setString(4,role.toString());
        if (role == User.Role.ADMIN) {
            preparedStatement.setInt(5,expInYear);
            preparedStatement.setNull(6, Types.NULL);
        }
        else {
            preparedStatement.setNull(5, Types.NULL);
            preparedStatement.setString(6,proSkill);
        }
        int rowCount = preparedStatement.executeUpdate();
        jdbcUtils.disConnection();
        return rowCount > 0;
    }
}
