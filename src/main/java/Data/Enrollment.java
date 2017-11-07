package Data;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "Enrollments")
public class Enrollment {
  @DatabaseField(generatedId = true)
  private int ID;
  @DatabaseField
  private int EnrollementStartDate;
  @DatabaseField
  private int EnrollementEndDate;
  @DatabaseField
  private int StudentId;
  @DatabaseField
  private int CourseId;

  public Enrollment() {
  }

  public int getEnrollementStartDate() {
    return EnrollementStartDate;
  }

  public void setEnrollementStartDate(int enrollementStartDate) {
    EnrollementStartDate = enrollementStartDate;
  }

  public int getEnrollementEndDate() {
    return EnrollementEndDate;
  }

  public void setEnrollementEndDate(int enrollementEndDate) {
    EnrollementEndDate = enrollementEndDate;
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
