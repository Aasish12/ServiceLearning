package ServiceModel;

import Data.Employment;
import ServiceInterface.EmploymentServices;

import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
public class EmploymentRoutes {
    private EmploymentServices services = new EmploymentServices();

    @RequestMapping(value = "/employments/all", method = RequestMethod.GET)
    public List<Employment> getAllEmployments() throws  SQLException {
        return services.GetAllEmployments();
    }

    @RequestMapping(value = "/employments/search/{searchColumn}/{searchText}", method = RequestMethod.GET)
    public List<Employment> searchEmployments(@PathVariable("searchColumn") String searchColumn, @PathVariable("searchText") String searchText) throws SQLException {
        return  services.SearchEmployments(searchColumn, searchText);
    }

    @RequestMapping(value = "/employments/getByStudentId/{studentId}", method = RequestMethod.GET)
    public List<Employment> getByStudentId(@PathVariable("studentId") int studentId) throws  SQLException {
        return services.GetEmploymentsByStudentId(studentId);
    }

    @RequestMapping(value = "/employments/getByPositionId/{positionId}", method = RequestMethod.GET)
    public List<Employment> getByPositionId(@PathVariable("positionId") int positionId) throws SQLException {
        return services.GetEmploymentsByPositionId(positionId);
    }

    @RequestMapping(value = "/employments/getById/{Id}", method = RequestMethod.GET)
    public Employment getById(@PathVariable("Id") int id) throws SQLException {
        return services.GetEmploymentById(id);
    }

    @RequestMapping(value = "/employments/getNewEmployment", method = RequestMethod.GET)
    public Employment getNewEmployment() {
        return new Employment();
    }

    @RequestMapping(value = "/employments/post", method = RequestMethod.POST)
    public void postEmployment(@RequestBody Employment employment) throws SQLException {
        services.Post(employment);
    }

    @RequestMapping(value = "/employments/put", method = RequestMethod.PUT)
    public void putEmployment(@RequestBody Employment employment) throws SQLException {
        services.Put(employment);
    }
}
