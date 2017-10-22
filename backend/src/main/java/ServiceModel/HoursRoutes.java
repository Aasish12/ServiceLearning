package ServiceModel;

import ServiceModel.Types.HoursType;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/hours/")
public class HoursRoutes {

    /* Get routes */
    @GET
    @Path("/getHoursByStudentId/{studentId}")
    @Produces(MediaType.TEXT_PLAIN)
    public String getHoursByStudentId(@PathParam("studentId") int studentId) {
        return String.format("Hours by student #: %d", studentId);
    }

    @GET
    @Path("/getHoursByCourseId/{courseId}")
    @Produces(MediaType.TEXT_PLAIN)
    public String getHoursByCourseId(@PathParam("courseId") int courseId) {
        return String.format("Hours by course #: %d", courseId);
    }

    @GET
    @Path("/getNewHours")
    @Produces(MediaType.APPLICATION_JSON)
    public HoursType getNewHours() { return null; }

    /* Post & Put */
    @POST
    @Path("/post")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response recordNewHours(HoursType hours) {
        String output = hours.toString();

        return Response.status(200).entity(output).build();
    }
}
