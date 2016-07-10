package businessmodels;

import interfaces.ICustomer;
import java.io.Serializable;

public final class Customer implements ICustomer, Serializable {

    protected String customerId;
    protected CheckoutRecord checkoutRecord;

    public Customer(String customerId) {
        this.customerId = customerId;
        this.setCheckoutRecord(new CheckoutRecord(this));
    }

    @Override
    public String getCustomerId() {
        return customerId;
    }

    @Override
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    @Override
    public CheckoutRecord getCheckoutRecord() {
        return checkoutRecord;
    }

    @Override
    public void setCheckoutRecord(CheckoutRecord checkoutRecord) {
        this.checkoutRecord = checkoutRecord;
    }
}
