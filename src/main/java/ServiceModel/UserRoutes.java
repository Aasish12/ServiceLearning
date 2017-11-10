package ServiceModel;

import Data.User;
import ServiceInterface.UserServices;

import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

/*
* User specific API route definitions.
* GOAL: Define routes, call services to return data.
*
* Kofi Collins-Sibley
* */
@RestController
public class UserRoutes {
    private UserServices services = new UserServices();

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    /* Get routes */
    @RequestMapping(value = "/users/all", method = RequestMethod.GET)
    public List<User> getAllUsers() throws SQLException {
        return services.GetAllUsers();
    }

    /* Search for users by first name, last name, or email */
    @RequestMapping(value = "/users/search/{searchText}", method = RequestMethod.GET)
    public List<User> searchUsers(@PathVariable("searchText") String searchText) throws SQLException {
        return services.SearchUsers(searchText);
    }

    @RequestMapping(value = "/users/getById/{userId}", method = RequestMethod.GET)
    public User getUserById(@PathVariable("userId") int userId) throws SQLException {
        return services.GetById(userId);
    }

    @RequestMapping(value = "/users/getNewUser", method = RequestMethod.GET)
    public User getNewUser() {
        return new User();
    }

    /* Post & Put */
    @RequestMapping(value = "/users/post", method = RequestMethod.POST)
    public void postNewUser(@RequestBody User user) throws SQLException {
        services.PostUser(user);
    }

    @RequestMapping(value = "/users/put", method = RequestMethod.PUT)
    public void putUser(@RequestBody User user) throws SQLException {
        services.PutUser(user);
    }
}