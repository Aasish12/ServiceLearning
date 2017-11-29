package ServiceModel;

import ServiceInterface.CourseServices;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;


import java.sql.SQLException;
import java.util.List;

import Data.Course;
/*
* Course specific API route definitions.
* GOAL: Define routes, call services to return data.
*
* Kofi Collins-Sibley
* */
@RestController
public class CourseRoutes {
    private CourseServices services = new CourseServices();

    /* Get routes */
    @RequestMapping(value = "/courses/all", method = RequestMethod.GET)
    public List<Course> getAllCourses() throws SQLException
    { return services.GetAllCourses(); }

    @RequestMapping(value = "/courses/search/{searchText}", method = RequestMethod.GET)
    public List<Course> searchCourses(@PathParam("searchText") String searchText) throws SQLException {


        return services.SearchCourses(searchText);
    }

    @RequestMapping(value = "/courses/getById/{courseId}", method = RequestMethod.GET)
    public Course getCourseById(@PathParam("courseId") int courseId) throws SQLException {
        return services.GetById(courseId);
    }

    @RequestMapping(value = "/courses/getNewCourse", method = RequestMethod.GET)
    public Course getNewCourse() {
        return new Course();
    }

    /* Post & Put */
    @RequestMapping(value = "/courses/post", method = RequestMethod.POST)
    public void postNewCourse(Course course) throws SQLException {
        services.PostCourse(course);
    }

    @RequestMapping(value = "/courses/put", method = RequestMethod.PUT)
    public void putCourse(Course course) throws SQLException {
        services.PutCourse(course);
    }
}