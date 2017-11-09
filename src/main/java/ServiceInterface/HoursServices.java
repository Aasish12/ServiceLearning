package ServiceInterface;

import java.sql.SQLException;
import java.util.*;

import Data.Hours;
import DataRepository.HoursRepository;
import ServiceModel.Types.*;

/*
* Logic for courses
*
* Kofi Collins-Sibley
* Bailey Kay
* */
public class HoursServices {
    public List<Hours> GetAllHours() throws SQLException {
        return new HoursRepository().GetAllHours();
    }

    public ArrayList<HoursType> GetHoursByStudentId(int studentId) {
        return null;
    }

    public ArrayList<HoursType> GetHoursByCourseId(int courseId) {
        return null;
    }

    public void PostHours(HoursType newHours) {

    }
}
