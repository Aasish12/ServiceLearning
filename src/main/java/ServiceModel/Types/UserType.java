package ServiceModel.Types;

public class UserType {
    private int userId;
    private int positionId;

    private String firstName;
    private String lastName;

    private String username;
    private String hashedPassword;

    public UserType() {}

    public UserType(int userId,
                    int positionId,
                    String firstName,
                    String lastName,
                    String username) {
        this.userId = userId;
        this.positionId = positionId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.hashedPassword = "";
    }

    /* Gets */
    public int getUserId() {
        return this.userId;
    }

    public int getPositionId() {
        return this.positionId;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getUsername() {
        return this.username;
    }

    /* Sets */
    public void setPositionId(int newId) {
        this.positionId = newId;
    }

    public void setFirstName(String newFirst) {
        this.firstName = newFirst;
    }

    public void setLastName(String newLast) {
        this.lastName = newLast;
    }

    @Override
    public String toString() {
        return " UserId : " + this.userId +
                " PositionId : " + this.positionId +
                " FirstName : " + this.firstName +
                " LastName : " + this.lastName +
                " Username : " + this.username;
    }
}
