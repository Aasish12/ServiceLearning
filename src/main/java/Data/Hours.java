package Data;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "Hours")
public class Hours {
  @DatabaseField(generatedId = true)
  private int ID;
  @DatabaseField
  private int InTime;
  @DatabaseField
  private int OutTime;
  @DatabaseField
  private float hours;
  @DatabaseField
  private int StudentId;
  @DatabaseField
  private int PositionId;
  @DatabaseField
  private int PartnerId;
  @DatabaseField
  private int ProfessorId;
  @DatabaseField
  private int CourseID;
  @DatabaseField
  private String Responses;
  @DatabaseField
  private int LocationId;

  public Hours() {
  }

  public int getInTime() {
    return InTime;
  }

  public void setInTime(int inTime) {
    InTime = inTime;
  }

  public int getOutTime() {
    return OutTime;
  }

  public void setOutTime(int outTime) {
    OutTime = outTime;
  }

  public float getHours() {
    return hours;
  }

  public void setHours(float hours) {
    this.hours = hours;
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

  public int getPartnerId() {
    return PartnerId;
  }

  public void setPartnerId(int partnerId) {
    PartnerId = partnerId;
  }

  public int getProfessorId() {
    return ProfessorId;
  }

  public void setProfessorId(int professorId) {
    ProfessorId = professorId;
  }

  public int getCourseID() {
    return CourseID;
  }

  public void setCourseID(int courseID) {
    CourseID = courseID;
  }

  public String getResponses() {
    return Responses;
  }

  public void setResponses(String responses) {
    Responses = responses;
  }

  public int getLocationId() {
    return LocationId;
  }

  public void setLocationId(int locationId) {
    LocationId = locationId;
  }
}
