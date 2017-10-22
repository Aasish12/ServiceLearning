package ServiceModel;

import ServiceModel.Types.UserType;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/users")
public class UserRoutes {

    /* Get routes */
    @GET
    @Path("/all")
    @Produces(MediaType.TEXT_PLAIN)
    public String getAllUsers() {
        return "All Users";
    }

    @GET
    @Path("/search/{searchText}")
    @Produces(MediaType.APPLICATION_JSON)
    public UserType searchUsers(@PathParam("searchText") String searchText) {
        return new UserType(0, 0, searchText, searchText, searchText);
    }

    @GET
    @Path("/getById/{studentId}")
    @Produces(MediaType.TEXT_PLAIN)
    public String getUserById(@PathParam("studentId") String studentId) {
        return String.format("Student: %s", studentId);
    }

    @GET
    @Path("/getNewUser")
    @Produces(MediaType.APPLICATION_JSON)
    public UserType getNewUser() {
        return new UserType();
    }

    /* Post & Put */
    @POST
    @Path("/post")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response postNewUser(UserType user) {
        String output = user.toString();

        return Response.status(200).entity(output).build();
    }

    @PUT
    @Path("/put")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response putUser(UserType user) {
        String output = user.toString();

        return Response.status(200).entity(output).build();
    }
}