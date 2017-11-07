package Data;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "Roles")
public class Role {
  @DatabaseField(generatedId = true)
  private int Id;
  @DatabaseField
  private String Description;

  public Role() {
  }

  public String getDescription() {
    return Description;
  }

  public void setDescription(String description) {
    Description = description;
  }
}
