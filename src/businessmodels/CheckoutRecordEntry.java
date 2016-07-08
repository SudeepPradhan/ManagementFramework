package businessmodels;

import java.time.LocalDate;

public class CheckoutRecordEntry {

    protected Inventory inventory;
    protected LocalDate checkOutDate;
    protected LocalDate dueDate;
    protected LocalDate returnDate;

    public CheckoutRecordEntry(Inventory inventory, LocalDate checkOutDate, LocalDate dueDate) {
        this.inventory = inventory;
        this.checkOutDate = checkOutDate;
        this.dueDate = dueDate;
        this.returnDate = null;
    }

    public LocalDate getCheckOutDate() {
        return checkOutDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setCheckOutDate(LocalDate checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public boolean isReturned() {
        return returnDate != null;
    }

}
