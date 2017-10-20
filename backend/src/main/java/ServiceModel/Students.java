package ServiceModel;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/students")
public class Students {

    @Path("/all")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getAllStudents() {
        return "All Students";
    }

    @Path("/search/{searchtext}")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String searchStudents(@PathParam("searchtext") String searchText) {
        return String.format("Return students with first or last name containing: %s", searchText);
    }

    @Path("/getbyid/{studentid}")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getStudentById(@PathParam("studentid") String studentId) {
        return String.format("Student: %s", studentId);
    }
}