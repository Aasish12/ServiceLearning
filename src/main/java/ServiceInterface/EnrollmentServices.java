package ServiceInterface;

import java.sql.SQLException;
import java.util.List;

import Data.Enrollment;
import DataRepository.EnrollmentRepository;

public class EnrollmentServices {


  public List<Enrollment> getAllEnrollments() throws SQLException {
    return new EnrollmentRepository().getAllEnrollments();
  }

  public List<Enrollment> SearchCourses(String searchText) throws SQLException {
    return new EnrollmentRepository().searchEnrollment(searchText);
  }

  public Enrollment GetById(int enrollmentId) throws SQLException {
    return new EnrollmentRepository().getEnrollmentById(enrollmentId);
  }

  public void PostCourse(Enrollment newEnrollment) throws SQLException {
    new EnrollmentRepository().post(newEnrollment);
  }

  public void PutCourse(Enrollment enrollment) throws SQLException {
    new EnrollmentRepository().put(enrollment);
  }
}
