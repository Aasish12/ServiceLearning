package ServiceModel;

import ServiceModel.Types.CourseType;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/courses")
public class CourseRoutes {

    /* Get routes */
    @GET
    @Path("/all")
    @Produces(MediaType.TEXT_PLAIN)
    public String getAllCourses() { return "All Courses"; }

    @GET
    @Path("/search/{searchText}")
    @Produces(MediaType.APPLICATION_JSON)
    public CourseType searchCourses(@PathParam("searchText") String searchText) {
        return null;
    }

    @GET
    @Path("/getById/{courseId}")
    @Produces(MediaType.TEXT_PLAIN)
    public String getCourseById(@PathParam("courseId") int courseId) {
        return String.format("Course #: %d", courseId);
    }

    @GET
    @Path("/getNewCourse")
    @Produces(MediaType.APPLICATION_JSON)
    public CourseType getNewCourse() {
        return null;
    }

    /* Post & Put */
    @POST
    @Path("/post")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response postNewCourse(CourseType course) {
        String output = course.toString();

        return Response.status(200).entity(output).build();
    }

    @PUT
    @Path("/put")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response putCourse(CourseType course) {
        String output = course.toString();

        return Response.status(200).entity(output).build();
    }
}
