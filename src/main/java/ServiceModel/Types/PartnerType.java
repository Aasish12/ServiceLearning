package ServiceModel.Types;


public class PartnerType {
    private int id;
    private String companyName;
    private String firstName;
    private String lastName;
    private String phone;

    public PartnerType() {
    }

    public PartnerType(int id, String companyName, String firstName, String lastName, String phone) {
        this.id = id;
        this.companyName = companyName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }

    //Getters
    public int getID() {
        return this.id;
    }

    public String getCompanyName() {
        return this.companyName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getPhone() {
        return this.phone;
    }

    //Setters

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setFirstName(String newFirst) {
        this.firstName = newFirst;
    }

    public void setLastName(String newLast) {
        this.lastName = newLast;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "PartnerId : " + this.id +
                "\nCompanyName : " + this.companyName +
                "\nFirstName : " + this.firstName +
                "\nLastName : " + this.lastName +
                "\nPhone : " + this.phone;
    }

}
