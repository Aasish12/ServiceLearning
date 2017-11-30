package Data;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "Enrollments")
public class Enrollment {
  @DatabaseField(generatedId = true)
  private int ID;
  @DatabaseField
  private int EnrollmentStartDate;
  @DatabaseField
  private int EnrollmentEndDate;
  @DatabaseField
  private int StudentId;
  @DatabaseField
  private int CourseId;

  public Enrollment() {
  }

  public int getEnrollementStartDate() {
    return EnrollmentStartDate;
  }

  public void setEnrollementStartDate(int enrollementStartDate) {
    EnrollmentStartDate = enrollementStartDate;
  }

  public int getEnrollementEndDate() {
    return EnrollmentEndDate;
  }

  public void setEnrollementEndDate(int enrollementEndDate) {
    EnrollmentEndDate = enrollementEndDate;
  }

  public int getStudentId() {
    return StudentId;
  }

  public void setStudentId(int studentId) {
    StudentId = studentId;
  }

  public int getCourseId() {
    return CourseId;
  }

  public void setCourseId(int courseId) {
    CourseId = courseId;
  }
}
