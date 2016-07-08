package controllers;

import businessmodels.CheckoutRecordEntry;
import businessmodels.Customer;
import businessmodels.Inventory;
import businessmodels.Permission;
import database.Database;
import exceptions.InventoryAvailabilityException;
import exceptions.UnauthorizedAccessException;
import java.time.Duration;
import java.time.LocalDate;

public abstract class CirculationController extends Controller {

    public CirculationController(Database database) {
        super(database, Permission.CIRCULATION_PERMISSION);
    }

    public boolean checkout(Customer customer, Inventory inventory, LocalDate checkoutDate, LocalDate dueDate) throws UnauthorizedAccessException, InventoryAvailabilityException {
        if (!inventory.isAvailable()) {
            throw new InventoryAvailabilityException("Inventory can not be checked out, isAvailable() is false");
        }
        CheckoutRecordEntry checkoutRecordEntry = new CheckoutRecordEntry(inventory, checkoutDate, dueDate);
        inventory.setAvailable(false);
        customer.getCheckoutRecord().addCheckoutRecordEntry(checkoutRecordEntry);
        return (database.updateCustomer(customer) && database.updateProduct(inventory.getProduct()));
    }

    public boolean checkin(Customer customer, CheckoutRecordEntry checkoutRecordEntry) throws UnauthorizedAccessException, InventoryAvailabilityException {
        if (checkoutRecordEntry.getInventory().isAvailable()) {
            throw new InventoryAvailabilityException("Inventory can not be checked in, isAvailable() is true");
        }
        LocalDate checkinDate = LocalDate.now();
        checkoutRecordEntry.setReturnDate(checkinDate);
        checkoutRecordEntry.getInventory().setAvailable(true);
        return database.updateCustomer(customer) && database.updateProduct(checkoutRecordEntry.getInventory().getProduct());
    }

    public final double calculateAmount(CheckoutRecordEntry checkoutRecordEntry) throws UnauthorizedAccessException {
        return calculateBaseAmount(checkoutRecordEntry) + calculateOverdueFine(checkoutRecordEntry);
    }

    public double calculateOverdueFine(CheckoutRecordEntry checkoutRecordEntry) throws UnauthorizedAccessException {
        if (checkoutRecordEntry.isReturned()) {
            return 0;
        }

        long overdueDays = Duration.between(LocalDate.now(), checkoutRecordEntry.getDueDate()).getSeconds() / 86400;
        if (overdueDays > 0) {
            return overdueDays * checkoutRecordEntry.getInventory().getProduct().getDailyFine();
        }
        return 0;
    }

    public double calculateBaseAmount(CheckoutRecordEntry checkoutRecordEntry) throws UnauthorizedAccessException {
        LocalDate endDate;
        if (checkoutRecordEntry.isReturned()) {
            endDate = checkoutRecordEntry.getReturnDate();
        } else {
            endDate = LocalDate.now();
        }
        long checkoutDays = Duration.between(endDate, checkoutRecordEntry.getCheckOutDate()).getSeconds() / 86400;
        long plannedDuration = Duration.between(checkoutRecordEntry.getDueDate(), checkoutRecordEntry.getCheckOutDate()).getSeconds() / 86400;
        long baseDuration = checkoutDays > plannedDuration ? (plannedDuration - checkoutDays) : checkoutDays;
        return baseDuration * checkoutRecordEntry.getInventory().getProduct().getDailyRate();
    }
}
