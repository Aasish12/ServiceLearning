package ServiceModel;

import Data.Hours;
import ServiceModel.Types.HoursType;
import ServiceInterface.HoursServices;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

/*
* Hours specific API route definitions.
* GOAL: Define routes, call services to return data.
*
* Kofi Collins-Sibley
* Bailey Kay
* */
@Path("/hours/")
public class HoursRoutes {
    private HoursServices services = new HoursServices();

    /* Get routes */
    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Hours> getAllHours() throws SQLException {
        return services.GetAllHours();
    }

    @GET
    @Path("/getHoursByStudentId/{studentId}")
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<HoursType> getHoursByStudentId(@PathParam("studentId") int studentId) {
        return services.GetHoursByStudentId(studentId);
    }

    @GET
    @Path("/getHoursByCourseId/{courseId}")
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<HoursType> getHoursByCourseId(@PathParam("courseId") int courseId) {
        return services.GetHoursByCourseId(courseId);
    }

    @GET
    @Path("/getNewHours")
    @Produces(MediaType.APPLICATION_JSON)
    public HoursType getNewHours() { return new HoursType(); }

    /* Post & Put */
    @POST
    @Path("/post")
    @Consumes(MediaType.APPLICATION_JSON)
    public void recordNewHours(HoursType hours) {
        services.PostHours(hours);
    }
}
