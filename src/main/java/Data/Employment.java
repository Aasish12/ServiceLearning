package Data;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "Employments")
public class Employment {
  @DatabaseField(generatedId = true)
  private int ID;
  @DatabaseField
  private int EmploymentStartDate;
  @DatabaseField
  private int EmploymentrEndDate;
  @DatabaseField
  private int StudentId;
  @DatabaseField
  private int PositionId;

  public Employment() {
  }

  public int getEmploymentStartDate() {
    return EmploymentStartDate;
  }

  public void setEmploymentStartDate(int employmentStartDate) {
    EmploymentStartDate = employmentStartDate;
  }

  public int getEmploymentrEndDate() {
    return EmploymentrEndDate;
  }

  public void setEmploymentrEndDate(int employmentrEndDate) {
    EmploymentrEndDate = employmentrEndDate;
  }

  public int getStudentId() {
    return StudentId;
  }

  public void setStudentId(int studentId) {
    StudentId = studentId;
  }

  public int getPositionId() {
    return PositionId;
  }

  public void setPositionId(int positionId) {
    PositionId = positionId;
  }
}
