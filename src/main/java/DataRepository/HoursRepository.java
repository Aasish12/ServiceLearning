package DataRepository;

import java.sql.SQLException;
import java.util.List;

import Data.Hours;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;

/*
* Access database from here
* GOAL: Database function calls specifically for hours.
*
* Bailey Kay
* */
public class HoursRepository extends RepositoryBase {
    private Dao<Hours, String> hoursDao;

    public HoursRepository() throws SQLException {
        super();
        hoursDao = DaoManager.createDao(db, Hours.class);
    }

    public List<Hours> GetAllHours() throws SQLException {
        return hoursDao.queryForAll();
    }
}
