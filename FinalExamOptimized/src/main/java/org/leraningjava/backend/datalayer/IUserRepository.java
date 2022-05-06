package org.leraningjava.backend.datalayer;

import org.leraningjava.entity.User;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public interface IUserRepository {
    /**
     * @return List of Users exists in the database
     * @throws SQLException
     * @throws IOException
     */
    List<User> getUsers() throws SQLException, IOException;

    /**
     * Search the User by ID
     * @return User Object if found. null User Object when not found
     * @throws SQLException
     * @throws IOException
     */
    User getUserByID(int ID) throws SQLException, IOException;

    /**
     * Delete a specific user by ID from the database
     * @return true/false delete successfully or not.
     * @throws SQLException
     * @throws IOException
     */
    boolean deleteUserByID(int ID) throws SQLException, IOException;

    /**
     * @param email
     * @param password
     * @return User Object if User has (email, password) is found; otherwise, null
     * @throws SQLException
     * @throws IOException
     */
    User login(String email, String password) throws SQLException, IOException;

    /**
     * Add user to the database
     * @return true/false whether adding successfully.
     * @throws SQLException
     * @throws IOException
     */
    boolean addUser(String fullName, String email, String password, User.Role role, Integer expInYear, String proSkill) throws SQLException, IOException;
}
