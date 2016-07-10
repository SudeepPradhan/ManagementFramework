package decorators;

import businessmodels.CheckoutRecord;
import java.io.Serializable;
import interfaces.Customer;

public abstract class CustomerDecorator implements Customer, Serializable {

    protected Customer baseCustomer;

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
}
