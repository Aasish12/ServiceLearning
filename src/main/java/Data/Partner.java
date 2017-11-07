package Data;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "Partners")
public class Partner {
  @DatabaseField(generatedId = true)
  private int ID;
  @DatabaseField
  private String CompanyName;
  @DatabaseField
  private String LastName;
  @DatabaseField
  private String Phone;

  public Partner() {
  }

  public String getCompanyName() {
    return CompanyName;
  }

  public void setCompanyName(String companyName) {
    CompanyName = companyName;
  }

  public String getLastName() {
    return LastName;
  }

  public void setLastName(String lastName) {
    LastName = lastName;
  }

  public String getPhone() {
    return Phone;
  }

  public void setPhone(String phone) {
    Phone = phone;
  }
}
