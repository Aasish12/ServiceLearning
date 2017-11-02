package DataRepository;

import java.sql.SQLException;
import java.util.List;

import Data.User;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;

/*
* Access database from here
* GOAL: Database function calls specifically for users.
*
* Kofi Collins-Sibley
* */
public class UserRepository extends RepositoryBase {
    private Dao<User, String> userDao;

    public UserRepository() throws SQLException {
        super();
        userDao = DaoManager.createDao(db, User.class);
    }

    public List<User> GetAllUsers() throws SQLException {
        return userDao.queryForAll();
    }

    public User GetUserById(int id) throws SQLException {

        return userDao.queryForId(Integer.toString(id));
    }
}
