package businessmodels;

import interfaces.ICustomer;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CheckoutRecord implements Serializable {

    protected List<CheckoutRecordEntry> checkoutRecordEntries;
    protected Customer customer;

    public CheckoutRecord(ICustomer customer) {
        checkoutRecordEntries = new ArrayList<>();
        this.customer = (Customer) customer;
    }

    public List<CheckoutRecordEntry> getCheckoutRecordEntries() {
        return checkoutRecordEntries.stream().collect(Collectors.toList());
    }

    public void addCheckoutRecordEntry(CheckoutRecordEntry checkoutRecordEntry) {
        this.checkoutRecordEntries.add(checkoutRecordEntry);
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

}
