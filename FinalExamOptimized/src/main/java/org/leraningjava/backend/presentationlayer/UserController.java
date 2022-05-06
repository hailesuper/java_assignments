package org.leraningjava.backend.presentationlayer;

import org.leraningjava.backend.businesslayer.IUserService;
import org.leraningjava.backend.businesslayer.UserService;
import org.leraningjava.entity.User;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class UserController {
    private final IUserService userService;

    public UserController() {
        this.userService = new UserService();
    }

    public List<User> getUsers() {
        try {
            return userService.getUsers();
        } catch (SQLException | IOException e) {
            System.err.println(e.getMessage());
            return null;
        }
    }

    public User getUserByID(int ID) {
        try {
            return userService.getUserByID(ID);
        } catch (SQLException | IOException e) {
            System.err.println(e.getMessage());
            return null;
        }
    }

    public boolean deleteUserByID(int ID) {
        try {
            return userService.deleteUserByID(ID);
        } catch (SQLException | IOException e) {
            System.err.println(e.getMessage());
            return false;
        }
    }

    public User login(String email, String password) {
        try {
            return userService.login(email,password);
        } catch (SQLException | IOException e) {
            System.err.println(e.getMessage());
            return null;
        }
    }

    public boolean addUser(String fullName, String email, String password, User.Role role, Integer expInYear, String proSkill) {
        try {
            return userService.addUser(fullName,email,password,role,expInYear,proSkill);
        } catch (SQLException | IOException e) {
            System.err.println(e.getMessage());
            return false;
        }
    }
}
