package Data;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "Hours")
public class Hours {
  @DatabaseField(generatedId = true)
  private int ID;
  @DatabaseField
  private int inTime;
  @DatabaseField
  private int outTime;
  @DatabaseField
  private float hours;
  @DatabaseField
  private int studentId;
  @DatabaseField
  private int positionId;
  @DatabaseField
  private int partnerId;
  @DatabaseField
  private int professorId;
  @DatabaseField
  private int courseID;
  @DatabaseField
  private String responses;
  @DatabaseField
  private int locationId;

  public Hours() { }

  public Hours(int ID, int inTime, int outTime, float hours, int studentId, int positionId,
               int partnerId, int professorId, int courseID, String responses, int locationId) {
      this.ID = ID;
      this.inTime = inTime;
      this.outTime = outTime;
      this.hours = hours;
      this.studentId = studentId;
      this.positionId = positionId;
      this.partnerId = partnerId;
      this.professorId = professorId;
      this.courseID = courseID;
      this.responses = responses;
      this.locationId = locationId;
  }

  public int getInTime() {
      return this.inTime;
  }

  public void setInTime(int inTime) {
    this.inTime = inTime;
  }

  public int getOutTime() {
      return this.outTime;
  }

  public void setOutTime(int outTime) {
      this.outTime = outTime;
  }

  public float getHours() {
      return this.hours;
  }

  public void setHours(float hours) {
      this.hours = hours;
  }

  public int getStudentId() {
      return this.studentId;
  }

  public void setStudentId(int studentId) {
      this.studentId = studentId;
  }

  public int getPositionId() {
      return this.positionId;
  }

  public void setPositionId(int positionId) {
      this.positionId = positionId;
  }

  public int getPartnerId() {
      return this.partnerId;
  }

  public void setPartnerId(int partnerId) {
      this.partnerId = partnerId;
  }

  public int getProfessorId() {
      return this.professorId;
  }

  public void setProfessorId(int professorId) {
    this.professorId = professorId;
  }

  public int getCourseID() {
      return this.courseID;
  }

  public void setCourseID(int courseID) {
      this.courseID = courseID;
  }

  public String getResponses() {
      return this.responses;
  }

  public void setResponses(String responses) {
      this.responses = responses;
  }

  public int getLocationId() {
      return this.locationId;
  }

  public void setLocationId(int locationId) {
      this.locationId = locationId;
  }
}
