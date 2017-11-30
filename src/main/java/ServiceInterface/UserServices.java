package ServiceInterface;

import java.sql.SQLException;
import java.util.*;

import Data.User;
import DataRepository.UserRepository;

/*
* Logic for users
*
* Kofi Collins-Sibley
* */
public class UserServices {
    public List<User> GetAllUsers() throws SQLException {
        return new UserRepository().GetAllUsers();
    }

    public List<User> SearchUsers(String searchColumn, String searchText) throws SQLException {
        return new UserRepository().SearchUsers(searchColumn, searchText);
    }

    public User GetById(int userId) throws SQLException {
        return new UserRepository().GetUserById(userId);
    }

    public void PostUser(User newUser) throws SQLException {
        new UserRepository().Post(newUser);
    }

    public void PutUser(User user) throws SQLException {
        new UserRepository().Put(user);
    }
}
