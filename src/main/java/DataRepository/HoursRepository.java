package DataRepository;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Data.Hours;
import ServiceModel.Types.HoursType;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.stmt.PreparedDelete;
import com.j256.ormlite.stmt.PreparedQuery;
import com.j256.ormlite.stmt.QueryBuilder;
import com.j256.ormlite.stmt.Where;

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

    public List<Hours> getHoursByStudentID(int studentId) throws SQLException {
        QueryBuilder<Hours, String> qb = hoursDao.queryBuilder();
        Where where = qb.where();
        where.eq("StudentId", studentId);
        PreparedQuery<Hours> preparedQuery = qb.prepare();
        return hoursDao.query(preparedQuery);
    }

    public List<Hours> getHoursByCourseID(int courseId) throws SQLException {
        QueryBuilder<Hours, String> qb = hoursDao.queryBuilder();
        Where where = qb.where();
        where.eq("CourseId", courseId);
        PreparedQuery<Hours> preparedQuery = qb.prepare();
        return hoursDao.query(preparedQuery);
    }
}
