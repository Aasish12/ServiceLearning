package ServiceModel;

import Data.Hours;
import ServiceInterface.HoursServices;

import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

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
    @RequestMapping(value = "/hours/all", method = RequestMethod.GET)
    public List<Hours> getAllHours() throws SQLException {
        return services.GetAllHours();
    }

    @RequestMapping(value = "/hours/getHoursByStudentId/{studentId}", method = RequestMethod.GET)
    public List<Hours> getHoursByStudentId(@PathVariable("studentId") int studentId) throws SQLException {
        return services.getHoursByStudentId(studentId);
    }

    @RequestMapping(value = "/hours/getHoursByCourseId/{courseId}", method = RequestMethod.GET)
    public List<Hours> getHoursByCourseId(@PathVariable("courseId") int courseId) throws SQLException {
        return services.getHoursByCourseId(courseId);
    }

    @RequestMapping(value = "/hours/getNewHours", method = RequestMethod.GET)
    public Hours getNewHours() {
        return new Hours();
    }

    /* Post & Put */
    @RequestMapping(value = "/hours/post", method = RequestMethod.POST)
    public void postNewHours(@RequestBody Hours hours) throws SQLException {
        services.postHours(hours);
    }

    @RequestMapping(value = "/hours/put", method = RequestMethod.PUT)
    public void putHours(@RequestBody Hours hours) throws SQLException {
        services.putHours(hours);
    }
}