package ServiceModel;

import ServiceInterface.HoursServices;
import ServiceModel.Types.HoursType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/*
* Hours specific API route definitions.
* GOAL: Define routes, call services to return data.
*
* Kofi Collins-Sibley
* */

@RestController
public class HoursRoutes {
    private HoursServices services = new HoursServices();

    /* Get routes */
    @RequestMapping(value = "/hours/getHoursByStudentId/{studentId}", method = RequestMethod.GET)
    public ArrayList<HoursType> getHoursByStudentId(@PathVariable("studentId") int studentId) {
        return services.GetHoursByStudentId(studentId);
    }

    @RequestMapping(value = "/hours/getHoursByCourseId/{courseId}", method = RequestMethod.GET)
    public ArrayList<HoursType> getHoursByCourseId(@PathVariable("courseId") int courseId) {
        return services.GetHoursByCourseId(courseId);
    }

    @RequestMapping(value = "/hours/getNewHours", method = RequestMethod.GET)
    public HoursType getNewHours() { return new HoursType(); }

    /* Post & Put */
    @RequestMapping(value = "/hours/post", method = RequestMethod.POST)
    public void recordNewHours(HoursType hours) {
        services.PostHours(hours);
    }
}