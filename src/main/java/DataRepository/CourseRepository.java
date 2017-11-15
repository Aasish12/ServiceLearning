package DataRepository;

import java.sql.SQLException;
import java.util.List;

import Data.Course;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.stmt.PreparedQuery;
import com.j256.ormlite.stmt.QueryBuilder;
import com.j256.ormlite.stmt.Where;


/*
* Access database from here
* GOAL: Database function calls specifically for courses.
*
* Kofi Collins-Sibley
* */
public class CourseRepository extends RepositoryBase{
  private Dao<Course, String> courseDao;

  public CourseRepository() throws SQLException {
    super();
    courseDao = DaoManager.createDao(db, Course.class);
  }

  public List<Course> getAllCourses() throws SQLException {
    return courseDao.queryForAll();
  }

  public Course getCourseById(int courseId) throws SQLException{
    return courseDao.queryForId(Integer.toString(courseId));
  }

  public List<Course> searchCourse(String searchText) throws SQLException{
    QueryBuilder<Course, String> qb = courseDao.queryBuilder();
    Where<Course, String> where = qb.where();
    
    where.like("ProfessorId", '%'+ searchText + '%')
            .or()
            .like("Description", '%' + searchText + '%')
            .or()
            .like("DateCreated", '%' + searchText + '%');

    PreparedQuery<Course> preparedQuery = qb.prepare();
    return courseDao.query(preparedQuery);
  }

  public void post(Course newCourse) throws SQLException {
      courseDao.create(newCourse);
  }

  public void put(Course course) throws SQLException {
      courseDao.update(course);
  }
}
