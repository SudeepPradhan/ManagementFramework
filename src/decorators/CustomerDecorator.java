package decorators;

import businessmodels.Customer;

public abstract class CustomerDecorator extends Customer {

    protected Customer baseCustomer;

    public CustomerDecorator(Customer baseCustomer) {
        super(baseCustomer.getCustomerId(), baseCustomer.getCheckoutRecord());
        this.baseCustomer = baseCustomer;
    }

}
