package businessmodels;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import interfaces.Customer;
import interfaces.PrintOutput;

public class CheckoutRecord implements PrintOutput, Serializable {

    protected List<CheckoutRecordEntry> checkoutRecordEntries;
    protected Customer customer;

    public CheckoutRecord(Customer customer) {
        checkoutRecordEntries = new ArrayList<>();
        this.customer = (CustomerImpl) customer;
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

    @Override
    public String PrintOutString(int index, String format) {
        format = "%-3s%-18s%-80s%-12s%-12s\n";
        String outputPrint;
        outputPrint = "-------------------------------------------------------------------------------------------------------------------------------";
        outputPrint += System.lineSeparator();
        outputPrint += "Checkout record for customer id: " + this.customer.getCustomerId();
        outputPrint += System.lineSeparator();
        outputPrint += "-------------------------------------------------------------------------------------------------------------------------------";
        outputPrint += System.lineSeparator();
        outputPrint += String.format(format, "NO", "ISBN", "TITLE", "DUE DATE", "RETURN DATE");
        int i = 0;
        for (CheckoutRecordEntry checkoutRecordEntry : checkoutRecordEntries) {
            outputPrint += checkoutRecordEntry.PrintOutString(i++, format);
        }
        return outputPrint;
    }
}
