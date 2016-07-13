package decorators;

import businessmodels.Address;
import businessmodels.CheckoutRecord;
import java.io.Serializable;
import interfaces.Customer;
import interfaces.Validatable;

public abstract class CustomerDecorator implements Customer, Validatable<CustomerDecorator>,  Serializable {

    protected Customer baseCustomer;
    
    private String firstName;
    private String lastName;
    private Address address;
    private String phoneNumber;

    public CustomerDecorator(Customer baseCustomer) {
        this.baseCustomer = baseCustomer;
    }

    @Override
    public String getCustomerId() {
        return this.baseCustomer.getCustomerId();
    }

    @Override
    public void setCustomerId(String customerId) {
        this.baseCustomer.setCustomerId(customerId);
    }

    @Override
    public CheckoutRecord getCheckoutRecord() {
        return this.baseCustomer.getCheckoutRecord();
    }

    @Override
    public void setCheckoutRecord(CheckoutRecord checkoutRecord) {
        this.baseCustomer.setCheckoutRecord(checkoutRecord);
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

    public String getMemberId() {
        return this.getCustomerId();
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
}
