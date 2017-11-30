package ServiceInterface;

import java.sql.SQLException;
import java.util.*;

import Data.Hours;
import DataRepository.HoursRepository;

/*
* Logic for hours
*
* Kofi Collins-Sibley
* Bailey Kay
* */
public class HoursServices {
    public List<Hours> GetAllHours() throws SQLException {
        return new HoursRepository().GetAllHours();
    }

    public List<Hours> getHoursByStudentId(int studentId) throws SQLException {
        return new HoursRepository().getHoursByStudentID(studentId);
    }

    public List<Hours> getHoursByCourseId(int courseId) throws SQLException {
        return new HoursRepository().getHoursByCourseID(courseId);
    }

    public void postHours(Hours newHours) throws SQLException {
        new HoursRepository().post(newHours);
    }

    public void putHours(Hours hours) throws SQLException {
        new HoursRepository().put(hours);
    }
}
