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
  private int EmploymentEndDate;
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
    return EmploymentEndDate;
  }

  public void setEmploymentrEndDate(int employmentrEndDate) {
    EmploymentEndDate = employmentrEndDate;
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
