package ServiceModel;

import ServiceInterface.CourseServices;
import ServiceModel.Types.CourseType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

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
    public ArrayList<CourseType> getAllCourses() { return services.GetAllCourses(); }

    @RequestMapping(value = "/courses/search/{searchText}", method = RequestMethod.GET)
    public ArrayList<CourseType> searchCourses(@PathVariable("searchText") String searchText) {

        return services.SearchCourses(searchText);
    }

    @RequestMapping(value = "/courses/getById/{courseId}", method = RequestMethod.GET)
    public CourseType getCourseById(@PathVariable("courseId") int courseId) {
        return services.GetById(courseId);
    }

    @RequestMapping(value = "/courses/getNewCourse", method = RequestMethod.GET)
    public CourseType getNewCourse() {
        return new CourseType();
    }

    /* Post & Put */
    @RequestMapping(value = "/courses/post", method = RequestMethod.POST)
    public void postNewCourse(CourseType course) {
        services.PostCourse(course);
    }

    @RequestMapping(value = "/courses/put", method = RequestMethod.PUT)
    public void putCourse(CourseType course) {
        services.PutCourse(course);
    }
}