package ServiceModel;

import ServiceInterface.CourseServices;
import ServiceModel.Types.CourseType;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;

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
    public ArrayList<CourseType> getAllCourses() { return services.GetAllCourses(); }

    @GET
    @Path("/search/{searchText}")
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<CourseType> searchCourses(@PathParam("searchText") String searchText) {

        return services.SearchCourses(searchText);
    }

    @GET
    @Path("/getById/{courseId}")
    @Produces(MediaType.APPLICATION_JSON)
    public CourseType getCourseById(@PathParam("courseId") int courseId) {
        return services.GetById(courseId);
    }

    @GET
    @Path("/getNewCourse")
    @Produces(MediaType.APPLICATION_JSON)
    public CourseType getNewCourse() {
        return new CourseType();
    }

    /* Post & Put */
    @POST
    @Path("/post")
    @Consumes(MediaType.APPLICATION_JSON)
    public void postNewCourse(CourseType course) {
        services.PostCourse(course);
    }

    @PUT
    @Path("/put")
    @Consumes(MediaType.APPLICATION_JSON)
    public void putCourse(CourseType course) {
        services.PutCourse(course);
    }
}
