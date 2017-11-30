package Data;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "users")
public class User {
    @DatabaseField(generatedId = true)
    private int ID;
    @DatabaseField
    private String FirstName;
    @DatabaseField
    private String LastName;
    @DatabaseField
    private int RoleID;
    @DatabaseField
    private String Email;
    @DatabaseField
    private String Password;

    public User() {}

    public User(int ID, String firstName, String lastName, int roleID, String email, String password) {
        this.ID = ID;
        FirstName = firstName;
        LastName = lastName;
        RoleID = roleID;
        Email = email;
        Password = password;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getRoleID() {
        return RoleID;
    }

    public void setRoleID(int roleID) {
        RoleID = roleID;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
