package businessmodels;

import java.io.Serializable;
import interfaces.Customer;

public final class CustomerImpl implements Customer, Serializable {

    protected String customerId;
    protected CheckoutRecord checkoutRecord;

    public CustomerImpl(String customerId) {
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
