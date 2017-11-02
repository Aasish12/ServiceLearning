package ServiceInterface;

import java.sql.SQLException;
import java.util.*;

import Data.User;
import DataRepository.UserRepository;
import ServiceModel.Types.*;

/*
* Logic for users
*
* Kofi Collins-Sibley
* */
public class UserServices {
    public List<User> GetAllUsers() throws SQLException {
        return new UserRepository().GetAllUsers();
    }

    public ArrayList<UserType> SearchUsers(String searchText) {
        return null;
    }

    public User GetById(int userId) throws SQLException {
        return new UserRepository().GetUserById(userId);
    }

    public void PostUser(UserType newUser) {

    }

    public void PutUser(UserType user) {

    }
}
