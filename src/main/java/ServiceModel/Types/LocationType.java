package ServiceModel.Types;

/*
* 	ID int not null auto_increment
    ,City varchar(30) not null
    ,State varchar(30) not null
    ,AddressLine1 varchar(100) not null
    ,AddressLine2 varchar(100) not null
    ,Country varchar(30) not null
    ,Zipcode varchar(20) not null
    ,isPrimary boolean
* */

public class LocationType {
    private int id;
    private String city;
    private String state;
    private String addressLine1;
    private String addressLine2;
    private String country;
    private String zipcode;

    private boolean isPrimary;


    public LocationType() {
    }

    public LocationType(int ID,
                        String AddressLine1,
                        String AddressLine2,
                        String City,
                        String State,
                        String Country,
                        String Zipcode,
                        boolean isPrimary) {
        this.id = ID;
        this.addressLine1 = AddressLine1;
        this.addressLine2 = AddressLine2;
        this.city = City;
        this.country = Country;
        this.state = State;
        this.zipcode = Zipcode;
        this.isPrimary = isPrimary;
    }



    @Override
    public String toString() {
        return " LocationID : " + this.id +
                "\n AddressLine1 : " + this.addressLine1 +
                "\n AddressLine2 : " + this.addressLine2 +
                "\n City : " + this.city +
                "\n State : " + this.state +
                "\n Country : " + this.country +
                "\n Zipcode : " + this.zipcode +
                "\n isPrimary: " + this.isPrimary;
    }
    /* Gets & Sets */

    public int getID() {
        return this.id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public boolean isPrimary() {
        return isPrimary;
    }

    public void setPrimary(boolean primary) {
        this.isPrimary = primary;
    }
}
