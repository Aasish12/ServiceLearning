package Data;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "Partners")
public class Partner {
    @DatabaseField(generatedId = true)
    private int ID;
    @DatabaseField
    private String companyName;
    @DatabaseField
    private String firstName;
    @DatabaseField
    private String lastName;
    @DatabaseField
    private String phone;

    public Partner() {
    }

    public Partner(int ID, String companyName, String firstName, String lastName, String phone) {
        this.ID = ID;
        this.companyName = companyName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }

    public String getCompanyName() {
        return this.companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "PartnerId : " + this.ID +
                "\nCompanyName : " + this.companyName +
                "\nFirstName : " + this.firstName +
                "\nLastName : " + this.lastName +
                "\nPhone : " + this.phone;
    }

}
