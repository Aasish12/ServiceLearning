package ServiceModel.Types;

public class UserType {
    private int ID;
    private int RoleID;

    private String FirstName;
    private String LastName;

    private String Password;

    public UserType() {}

    public UserType(int ID,
                    int RoleID,
                    String firstName,
                    String lastName) {
        this.ID = ID;
        this.RoleID = RoleID;
        this.FirstName = firstName;
        this.LastName = lastName;
        this.Password = "";
    }

    /* Gets */
    public int getID() {
        return this.ID;
    }

    public int getRoleID() {
        return this.RoleID;
    }

    public String getFirstName() {
        return this.FirstName;
    }

    public String getLastName() {
        return this.LastName;
    }

    /* Sets */
    public void setRoleID(int newId) {
        this.RoleID = newId;
    }

    public void setFirstName(String newFirst) {
        this.FirstName = newFirst;
    }

    public void setLastName(String newLast) {
        this.LastName = newLast;
    }

    @Override
    public String toString() {
        return " UserId : " + this.ID +
                " PositionId : " + this.RoleID +
                " FirstName : " + this.FirstName +
                " LastName : " + this.LastName;
    }
}
