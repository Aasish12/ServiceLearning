package ServiceInterface;

import java.sql.SQLException;
import java.util.*;

import DataRepository.CourseRepository;
import ServiceModel.Types.*;

import Data.Course;
/*
* Logic for courses
*
* Kofi Collins-Sibley
* */
public class CourseServices {
    public List<Course> GetAllCourses() throws SQLException {
        return new CourseRepository().getAllCourses();
    }

    public List<Course> SearchCourses(String searchText) throws SQLException {
        return new CourseRepository().searchCourse(searchText);
    }

    public Course GetById(int courseId) throws SQLException {
        return new CourseRepository().getCourseById(courseId);
    }

    public void PostCourse(Course newCourse) throws SQLException {
        new CourseRepository().post(newCourse);
    }

    public void PutCourse(Course course) throws SQLException {
        new CourseRepository().put(course);
    }
}
