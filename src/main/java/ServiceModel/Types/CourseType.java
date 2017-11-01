package ServiceModel.Types;

public class CourseType {
    private int courseId;
    private String courseName;

    public CourseType() {}

    public CourseType(int courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    /* Gets */
    public int getCourseId() { return this.courseId; }

    public String getCourseName() { return this.courseName; }

    /* Sets */
    public void setCourseId(int newId) {
        this.courseId = newId;
    }

    public void setCourseName(String newName) {
        this.courseName = newName;
    }

    @Override
    public String toString() {
        return " CourseId : " + this.courseId +
                " CourseName : " + this.courseName;
    }
}
