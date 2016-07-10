package controllers;

import businessmodels.AccessType;
import businessmodels.Permission;
import database.Database;
import exceptions.InvalidArgumentException;
import exceptions.UnauthorizedAccessException;
import interfaces.Customer;

import java.util.List;

public abstract class CustomerController extends Controller {
    public CustomerController(Database database) {
        super(database, Permission.CUSTOMER_PERMISSION);
    }

    public abstract boolean validate(Customer customer);

    public final boolean saveCustomer(Customer customer) throws InvalidArgumentException, UnauthorizedAccessException {
        checkAccess(AccessType.CREATE);
        if (!validate(customer)) {
            throw new InvalidArgumentException(customer);
        }
        return database.createCustomer(customer);
    }

    public final boolean updateCustomer(Customer customer) throws InvalidArgumentException, UnauthorizedAccessException {
        checkAccess(AccessType.UPDATE);
        if (!validate(customer)) {
            throw new InvalidArgumentException(customer);
        }
        return database.updateCustomer(customer);
    }

    public final List<Customer> getAllCustomers() throws UnauthorizedAccessException {
        checkAccess(AccessType.READ);
        return database.getAllCustomers();
    }
}
