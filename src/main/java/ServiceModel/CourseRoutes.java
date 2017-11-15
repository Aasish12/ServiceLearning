package ServiceModel;

import ServiceInterface.CourseServices;
import ServiceModel.Types.CourseType;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import java.sql.SQLException;
import java.util.List;

import Data.Course;
/*
* Course specific API route definitions.
* GOAL: Define routes, call services to return data.
*
* Kofi Collins-Sibley
* */
@Path("/courses")
public class CourseRoutes {
    private CourseServices services = new CourseServices();

    /* Get routes */
    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Course> getAllCourses() throws SQLException
    { return services.GetAllCourses(); }

    @GET
    @Path("/search/{searchText}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Course> searchCourses(@PathParam("searchText") String searchText) throws SQLException {

        return services.SearchCourses(searchText);
    }

    @GET
    @Path("/getById/{courseId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Course getCourseById(@PathParam("courseId") int courseId) throws SQLException {
        return services.GetById(courseId);
    }

    @GET
    @Path("/getNewCourse")
    @Produces(MediaType.APPLICATION_JSON)
    public Course getNewCourse() {
        return new Course();
    }

    /* Post & Put */
    @POST
    @Path("/post")
    @Consumes(MediaType.APPLICATION_JSON)
    public void postNewCourse(Course course) throws SQLException {
        services.PostCourse(course);
    }

    @PUT
    @Path("/put")
    @Consumes(MediaType.APPLICATION_JSON)
    public void putCourse(Course course) throws SQLException {
        services.PutCourse(course);
    }
}
