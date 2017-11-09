package ServiceModel;

import Data.User;
import ServiceInterface.UserServices;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.sql.SQLException;
import java.util.List;

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
    public List<User> getAllUsers() throws SQLException {
        return services.GetAllUsers();
    }

    /* Search for users by first name, last name, or email */
    @GET
    @Path("/search/{searchText}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<User> searchUsers(@PathParam("searchText") String searchText) throws SQLException {
        return services.SearchUsers(searchText);
    }

    @GET
    @Path("/getById/{userId}")
    @Produces(MediaType.APPLICATION_JSON)
    public User getUserById(@PathParam("userId") int userId) throws SQLException {
        return services.GetById(userId);
    }

    @GET
    @Path("/getNewUser")
    @Produces(MediaType.APPLICATION_JSON)
    public User getNewUser() {
        return new User();
    }

    /* Post & Put */
    @POST
    @Path("/post")
    @Consumes(MediaType.APPLICATION_JSON)
    public void postNewUser(User user) throws SQLException {
        services.PostUser(user);
    }

    @PUT
    @Path("/put")
    @Consumes(MediaType.APPLICATION_JSON)
    public void putUser(User user) throws SQLException {
        services.PutUser(user);
    }
}