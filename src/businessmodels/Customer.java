package businessmodels;

public class Customer {

    protected String customerId;
    protected CheckoutRecord checkoutRecord;

    public Customer(String customerId, CheckoutRecord checkoutRecord) {
        this.customerId = customerId;
        this.checkoutRecord = checkoutRecord;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public CheckoutRecord getCheckoutRecord() {
        return checkoutRecord;
    }

    public void setCheckoutRecord(CheckoutRecord checkoutRecord) {
        this.checkoutRecord = checkoutRecord;
    }

}
