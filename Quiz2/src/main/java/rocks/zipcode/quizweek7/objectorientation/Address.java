package rocks.zipcode.quizweek7.objectorientation;

/**
 * @author leon on 28/11/2018.
 */
public class Address {

    private String addressLine1 = "", addressLine2 = "", city = "", state = "", zipcode = "";
    public Address() {
    }

    /**
     * @param addressLine1 - first address line
     * @param addressLine2 - second address line
     * @param city - city of location
     * @param state - state of city
     * @param zipcode - zipcode of region
     */
    public Address(String addressLine1, String addressLine2, String city, String state, String zipcode) {
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
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

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public boolean equals(Object obj) {
        Address address2 = (Address) obj;
        return this.addressLine1.equals((address2).addressLine1) &&
                this.addressLine2.equals(address2.addressLine2) &&
                this.city.equals(address2.city) &&
                this.state.equals(address2.state) &&
                this.zipcode.equals(address2.zipcode);
    }

    @Override
    public String toString() {

//        Address{addressLine1='', addressLine2='', city='', state='', zipcode=''}
        return "Address{addressLine1=\'" + this.addressLine1 + "\', "
                + "addressLine2=\'" + this.addressLine2 + "\', "
                + "city=\'" + this.city + "\', "
                + "state=\'" + this.state + "\', "
                + "zipcode=\'" + this.zipcode + "\'}";
    }
}