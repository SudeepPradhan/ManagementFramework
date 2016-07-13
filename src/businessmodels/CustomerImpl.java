package businessmodels;

import java.io.Serializable;
import interfaces.Customer;
import java.time.LocalDate;
//new branch

// I just swtich branch
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

    @Override
    public void checkoutProduct(Inventory inventory, LocalDate checkoutDate, LocalDate dueDate) {
    }

    @Override
    public void returnProduct(CheckoutRecordEntry checkoutRecordEntry, LocalDate returnDate) {
    }
}
