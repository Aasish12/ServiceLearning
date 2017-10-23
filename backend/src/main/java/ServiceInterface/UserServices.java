package ServiceInterface;

import java.util.*;
import ServiceModel.Types.*;

/*
* Logic for users
*
* Kofi Collins-Sibley
* */
public class UserServices {
    public ArrayList<UserType> GetAllUsers() {
        return null;
    }

    public ArrayList<UserType> SearchUsers(String searchText) {
        return null;
    }

    public UserType GetById(int userId) {
        return new UserType(userId,
                0,
                "test",
                "test",
                "test");
    }

    public void PostUser(UserType newUser) {

    }

    public void PutUser(UserType user) {

    }
}
