package businessmodels;

import interfaces.Validatable;
import interfaces.ValidateOutput;
import interfaces.Validator;
import java.io.Serializable;

public class Owner implements Validatable<Owner>,Serializable {

    private String firstName;
    private String lastName;
    private Address address;
    private String phoneNumber;
    private String credentials;
    private String biography;

    /**
     * Public constructor.
     *
     * @param firstName
     * @param lastName
     * @param address
     * @param phoneNumber
     * @param credentials
     * @param biography
     */
    public Owner(String firstName, String lastName, Address address, String phoneNumber, String credentials, String biography) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.credentials = credentials;
        this.biography = biography;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Address getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCredentials() {
        return credentials;
    }

    public String getBiography() {
        return biography;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setCredentials(String credentials) {
        this.credentials = credentials;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    @Override
    public String toString() {
        return getFirstName() + " " + getLastName();
    }

    @Override
    public ValidateOutput validate(Validator<Owner> validator) {
        return validator.isValid(this);
    }
}
