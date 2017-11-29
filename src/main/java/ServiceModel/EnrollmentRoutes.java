package ServiceModel;

import java.sql.SQLException;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import javax.websocket.server.PathParam;

import Data.Enrollment;
import ServiceInterface.EnrollmentServices;

public class EnrollmentRoutes {
  private EnrollmentServices services = new EnrollmentServices();

  /* Get routes */
  @RequestMapping(value = "/enrollment/all", method = RequestMethod.GET)
  public List<Enrollment> getAllEnrollments() throws SQLException
  { return services.getAllEnrollments(); }

  @RequestMapping(value = "/enrollment/search/{searchText}", method = RequestMethod.GET)
  public List<Enrollment> searchEnrollments(@PathParam("searchText") String searchText) throws SQLException {

    return services.SearchCourses(searchText);
  }

  @RequestMapping(value = "/enrollment/getById/{enrollmentId}", method = RequestMethod.GET)
  public Enrollment getEnrollmentById(@PathParam("enrollmentId") int enrollmentId) throws SQLException {
    return services.GetById(enrollmentId);
  }

  @RequestMapping(value = "/enrollment/getNewEnrollment", method = RequestMethod.GET)
  public Enrollment getNewEnrollment() {
    return new Enrollment();
  }

  /* Post & Put */
  @RequestMapping(value = "/enrollment/post", method = RequestMethod.POST)
  public void postNewEnrollment(Enrollment enrollment) throws SQLException {
    services.PostCourse(enrollment);
  }

  @RequestMapping(value = "/enrollment/put", method = RequestMethod.PUT)
  public void putEnrollment(Enrollment enrollment) throws SQLException {
    services.PutCourse(enrollment);
  }
}
