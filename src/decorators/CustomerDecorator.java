package decorators;

import businessmodels.CheckoutRecord;
import interfaces.ICustomer;
import java.io.Serializable;

public abstract class CustomerDecorator implements ICustomer, Serializable {

    protected ICustomer baseCustomer;

    public CustomerDecorator(ICustomer baseCustomer) {
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
