package ServiceInterface;

import java.sql.SQLException;
import java.util.*;

import Data.Employment;
import DataRepository.EmploymentRepository;

public class EmploymentServices {
    public List<Employment> GetAllEmployments() throws SQLException {
        return new EmploymentRepository().GetAllEmployments();
    }

    public List<Employment> SearchEmployments(String searchColumn, String searchText) throws SQLException {
        return new EmploymentRepository().SearchEmployments(searchColumn, searchText);
    }

    public List<Employment> GetEmploymentsByStudentId(int id) throws SQLException {
        return new EmploymentRepository().GetEmploymentsByStudentId(id);
    }

    public List<Employment> GetEmploymentsByPositionId(int id) throws SQLException {
        return new EmploymentRepository().GetEmploymentsByPositionId(id);
    }

    public Employment GetEmploymentById(int id) throws SQLException {
        return new EmploymentRepository().GetEmploymentById(id);
    }

    public void Post(Employment employment) throws SQLException {
        new EmploymentRepository().Post(employment);
    }

    public void Put(Employment employment) throws SQLException {
        new EmploymentRepository().Put(employment);
    }
}
