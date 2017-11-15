package DataRepository;

import java.sql.SQLException;
import java.util.List;

import Data.User;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.stmt.PreparedQuery;
import com.j256.ormlite.stmt.QueryBuilder;
import com.j256.ormlite.stmt.Where;

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

    public List<User> SearchUsers(String searchText) throws SQLException {
        QueryBuilder<User, String> qb = userDao.queryBuilder();
        Where<User, String> where = qb.where();

        where.like("FirstName", searchText)
                .or()
                .like("LastName", searchText);

        PreparedQuery<User> preparedQuery = qb.prepare();

        return userDao.query(preparedQuery);
    }

    public User GetUserById(int id) throws SQLException {

        return userDao.queryForId(Integer.toString(id));
    }

    public void Post(User newUser) throws SQLException {
        userDao.create(newUser);
    }

    public void Put(User user) throws SQLException {
        userDao.update(user);
    }
}
