package DataRepository;


import java.sql.SQLException;
import java.util.List;

import Data.Course;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.stmt.PreparedQuery;
import com.j256.ormlite.stmt.QueryBuilder;
import com.j256.ormlite.stmt.Where;

import Data.Enrollment;

public class EnrollmentRepository extends RepositoryBase{

  private Dao<Enrollment, String> enrollmentDao;

  public EnrollmentRepository() throws SQLException {
    super();
    enrollmentDao = DaoManager.createDao(db, Enrollment.class);
  }

  public List<Enrollment> getAllEnrollments() throws SQLException {
    return enrollmentDao.queryForAll();

  }

  public List<Enrollment> searchEnrollment(String searchText) throws SQLException {
    QueryBuilder<Enrollment, String> qb = enrollmentDao.queryBuilder();
    Where<Enrollment, String> where = qb.where();

    where.like("EnrollmentStartDate", '%'+ searchText + '%')
            .or()
            .like("EnrollmentEndDate", '%' + searchText + '%')
            .or()
            .like("StudentId", '%' + searchText + '%')
            .or()
            .like("CourseId", '%' + searchText + '%');

    PreparedQuery<Enrollment> preparedQuery = qb.prepare();
    return enrollmentDao.query(preparedQuery);
  }

  public Enrollment getEnrollmentById(int enrollmentId) throws SQLException {
    return enrollmentDao.queryForId(Integer.toString(enrollmentId));

  }

  public void put(Enrollment enrollment) throws SQLException {
    enrollmentDao.update(enrollment);
  }

  public void post(Enrollment newEnrollment) throws SQLException {
    enrollmentDao.create(newEnrollment);
  }
}
