package Data;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "Positions")
public class Position {
  @DatabaseField(generatedId = true)
  private int ID;
  @DatabaseField
  private String title;
  @DatabaseField
  private String Description;
  @DatabaseField
  private int LocationID;
  @DatabaseField
  private int PartnerID;

  public Position() {
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return Description;
  }

  public void setDescription(String description) {
    Description = description;
  }

  public int getLocationID() {
    return LocationID;
  }

  public void setLocationID(int locationID) {
    LocationID = locationID;
  }

  public int getPartnerID() {
    return PartnerID;
  }

  public void setPartnerID(int partnerID) {
    PartnerID = partnerID;
  }
}
