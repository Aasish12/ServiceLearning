package DataRepository;

import java.sql.SQLException;
import java.util.List;

import Data.Employment;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.stmt.PreparedQuery;
import com.j256.ormlite.stmt.QueryBuilder;
import com.j256.ormlite.stmt.Where;

public class EmploymentRepository extends RepositoryBase {
    private Dao<Employment, String> employmentDao;

    public EmploymentRepository() throws SQLException {
        super();
        employmentDao = DaoManager.createDao(db, Employment.class);
    }

    public List<Employment> GetAllEmployments() throws SQLException {
        return employmentDao.queryForAll();
    }

    public List<Employment> SearchEmployments(String searchColumn, String searchText) throws SQLException {
        QueryBuilder<Employment, String> qb = employmentDao.queryBuilder();
        Where<Employment, String> where = qb.where();

        where.like(searchColumn, "%" + searchText + "%");

        PreparedQuery<Employment> preparedQuery = qb.prepare();

        return employmentDao.query(preparedQuery);
    }

    public List<Employment> GetEmploymentsByStudentId(int studentId) throws SQLException {
        QueryBuilder<Employment, String> qb = employmentDao.queryBuilder();
        Where<Employment, String> where = qb.where();

        where.eq("StudentId", studentId);

        PreparedQuery<Employment> preparedQuery = qb.prepare();

        return employmentDao.query(preparedQuery);
    }

    public List<Employment> GetEmploymentsByPositionId(int positionId) throws SQLException {
        QueryBuilder<Employment, String> qb = employmentDao.queryBuilder();
        Where<Employment, String> where = qb.where();

        where.eq("PositionId", positionId);

        PreparedQuery<Employment> preparedQuery = qb.prepare();

        return employmentDao.query(preparedQuery);
    }

    public Employment GetEmploymentById(int id) throws SQLException {
        return employmentDao.queryForId(Integer.toString(id));
    }

    public void Post(Employment employment) throws SQLException {
        employmentDao.create(employment);
    }

    public void Put(Employment employment) throws SQLException {
        employmentDao.update(employment);
    }
}
