package Data;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import java.sql.Date;

@DatabaseTable(tableName = "Courses")
public class Course {
  @DatabaseField(generatedId = true)
  private int ID;
  @DatabaseField
  private int ProfessorId;
  @DatabaseField
  private String Description;

 //mySql has dateTime datatype java does not
  private Date DateCreated;

  public Course() {
  }

  public int getProfessorId() {
    return ProfessorId;
  }

  public void setProfessorId(int professorId) {
    ProfessorId = professorId;
  }

  public String getDescription() {
    return Description;
  }

  public void setDescription(String description) {
    Description = description;
  }

  public Date getDateCreated() {
    return DateCreated;
  }

  public void setDateCreated(Date dateCreated) {
    DateCreated = dateCreated;
  }
}
