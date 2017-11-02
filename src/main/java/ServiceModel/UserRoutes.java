package ServiceModel;

import Data.User;
import ServiceModel.Types.UserType;
import ServiceInterface.UserServices;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.sql.SQLException;
import java.util.ArrayList;
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

    @GET
    @Path("/search/{searchText}")
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<UserType> searchUsers(@PathParam("searchText") String searchText) {
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