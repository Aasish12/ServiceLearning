package ServiceModel;

import ServiceModel.Types.UserType;
import ServiceInterface.UserServices;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;

/*
* User specific API route definitions.
* GOAL: Define routes, call services to return data.
*
* Kofi Collins-Sibley
* */
@Path("/users")
public class UserRoutes {
    private UserServices services = new UserServices();

    /* Get routes */
    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<UserType> getAllUsers() {
        return services.GetAllUsers();
    }

    @GET
    @Path("/search/{searchText}")
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<UserType> searchUsers(@PathParam("searchText") String searchText) {
        return services.SearchUsers(searchText);
    }

    @GET
    @Path("/getById/{studentId}")
    @Produces(MediaType.APPLICATION_JSON)
    public UserType getUserById(@PathParam("studentId") int userId) {
        return services.GetById(userId);
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
    public void postNewUser(UserType user) {
        services.PostUser(user);
    }

    @PUT
    @Path("/put")
    @Consumes(MediaType.APPLICATION_JSON)
    public void putUser(UserType user) {
        services.PutUser(user);
    }
}