package org.leraningjava.backend.businesslayer;

import org.leraningjava.backend.datalayer.IUserRepository;
import org.leraningjava.backend.datalayer.UserRepository;
import org.leraningjava.entity.User;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class UserService implements IUserService{
    private final IUserRepository userRepository;

    public UserService() {
        this.userRepository = new UserRepository();
    }

    @Override
    public List<User> getUsers() throws SQLException, IOException {
        return userRepository.getUsers();
    }

    @Override
    public User getUserByID(int ID) throws SQLException, IOException {
        return userRepository.getUserByID(ID);
    }

    @Override
    public boolean deleteUserByID(int ID) throws SQLException, IOException {
        return userRepository.deleteUserByID(ID);
    }

    @Override
    public User login(String email, String password) throws SQLException, IOException {
        return userRepository.login(email,password);
    }

    @Override
    public boolean addUser(String fullName, String email, String password, User.Role role, Integer expInYear, String proSkill) throws SQLException, IOException {
        return userRepository.addUser(fullName,email,password,role,expInYear,proSkill);
    }
}
