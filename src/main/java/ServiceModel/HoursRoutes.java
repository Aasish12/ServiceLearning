package ServiceModel;

import Data.Hours;
import ServiceModel.Types.HoursType;
<<<<<<< HEAD
import ServiceInterface.HoursServices;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.sql.SQLException;
import java.util.List;
=======
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

>>>>>>> SD103-38-MOC-Deploy
import java.util.ArrayList;

/*
* Hours specific API route definitions.
* GOAL: Define routes, call services to return data.
*
* Kofi Collins-Sibley
* Bailey Kay
* */

@RestController
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
    public List<Hours> getHoursByStudentId(@PathParam("studentId") int studentId) throws SQLException {
        return services.getHoursByStudentId(studentId);
    }

    @GET
    @Path("/getHoursByCourseId/{courseId}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Hours> getHoursByCourseId(@PathParam("courseId") int courseId) throws SQLException {
        return services.getHoursByCourseId(courseId);
    }

    @GET
    @Path("/getNewHours")
    @Produces(MediaType.APPLICATION_JSON)
    public Hours getNewHours() {
        return new Hours();
    }

    /* Post & Put */
    @POST
    @Path("/post")
    @Consumes(MediaType.APPLICATION_JSON)
    public void postNewHours(Hours hours) throws SQLException {
        services.postHours(hours);
    }

    @PUT
    @Path("/put")
    @Consumes(MediaType.APPLICATION_JSON)
    public void putHours(Hours hours) throws SQLException {
        services.putHours(hours);
    }
}