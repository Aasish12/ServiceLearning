package Data;


import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "Locations")
public class Location {
  @DatabaseField(generatedId = true)
  private int Id;
  @DatabaseField
  private String City;
  @DatabaseField
  private String State;
  @DatabaseField
  private String AddressLine1;
  @DatabaseField
  private String AddressLine2;
  @DatabaseField
  private String Country;
  @DatabaseField
  private String Zipcode;
  @DatabaseField
  private boolean isPrimary;

  public Location() {
  }

  public String getCity() {
    return City;
  }

  public void setCity(String city) {
    City = city;
  }

  public String getState() {
    return State;
  }

  public void setState(String state) {
    State = state;
  }

  public String getAddressLine1() {
    return AddressLine1;
  }

  public void setAddressLine1(String addressLine1) {
    AddressLine1 = addressLine1;
  }

  public String getAddressLine2() {
    return AddressLine2;
  }

  public void setAddressLine2(String addressLine2) {
    AddressLine2 = addressLine2;
  }

  public String getCountry() {
    return Country;
  }

  public void setCountry(String country) {
    Country = country;
  }

  public String getZipcode() {
    return Zipcode;
  }

  public void setZipcode(String zipcode) {
    Zipcode = zipcode;
  }

  public boolean isPrimary() {
    return isPrimary;
  }

  public void setPrimary(boolean primary) {
    isPrimary = primary;
  }
}
