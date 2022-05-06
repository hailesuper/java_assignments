package org.leraningjava.backend.businesslayer;

import org.leraningjava.entity.User;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface IUserService {
    List<User> getUsers() throws SQLException, IOException;
    User getUserByID(int ID) throws SQLException, IOException;
    boolean deleteUserByID(int ID) throws SQLException, IOException;
    User login(String email, String password) throws SQLException, IOException;
    boolean addUser(String fullName, String email, String password, User.Role role, Integer expInYear, String proSkill) throws SQLException, IOException;
}
