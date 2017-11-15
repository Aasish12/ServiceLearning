package ServiceModel;

import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import Data.Course;
import Data.Enrollment;
import ServiceInterface.CourseServices;
import ServiceInterface.EnrollmentServices;

public class EnrollmentRoutes {
  private EnrollmentServices services = new EnrollmentServices();

  /* Get routes */
  @GET
  @Path("/all")
  @Produces(MediaType.APPLICATION_JSON)
  public List<Enrollment> getAllCourses() throws SQLException
  { return services.getAllEnrollments(); }

  @GET
  @Path("/search/{searchText}")
  @Produces(MediaType.APPLICATION_JSON)
  public List<Enrollment> searchCourses(@PathParam("searchText") String searchText) throws SQLException {

    return services.SearchCourses(searchText);
  }

  @GET
  @Path("/getById/{courseId}")
  @Produces(MediaType.APPLICATION_JSON)
  public Enrollment getCourseById(@PathParam("courseId") int courseId) throws SQLException {
    return services.GetById(courseId);
  }

  @GET
  @Path("/getNewCourse")
  @Produces(MediaType.APPLICATION_JSON)
  public Enrollment getNewCourse() {
    return new Enrollment();
  }

  /* Post & Put */
  @POST
  @Path("/post")
  @Consumes(MediaType.APPLICATION_JSON)
  public void postNewCourse(Enrollment enrollment) throws SQLException {
    services.PostCourse(enrollment);
  }

  @PUT
  @Path("/put")
  @Consumes(MediaType.APPLICATION_JSON)
  public void putCourse(Enrollment enrollment) throws SQLException {
    services.PutCourse(enrollment);
  }
}
