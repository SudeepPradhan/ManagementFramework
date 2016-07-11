package businessmodels;

import interfaces.Product;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class ProductImpl implements Product, Serializable {

    protected String productId;
    protected double dailyRate;
    protected double dailyFine;
    private int borrowDuration;
    private String title;
    protected List<Inventory> inventory;

    public ProductImpl(String productId, String title, double dailyRate, double dailyFine, int borrowDuration) {
        this.productId = productId;
        this.dailyRate = dailyRate;
        this.dailyFine = dailyFine;
        this.borrowDuration = borrowDuration;
        this.title = title;
        this.inventory = new ArrayList<>();
    }

    public ProductImpl(String title, int borrowDuration) {
        this.title = title;
        this.borrowDuration = borrowDuration;
    }

    @Override
    public void addDefaultInventory(int numInventoryToAdd) {
        while (numInventoryToAdd-- > 0) {
            inventory.add(new DefaultInventory((inventory.size() + 1) + "", (Product) this));
        }
    }

    @Override
    public void addInventory(Inventory inventory) {
        this.inventory.add(inventory);
    }

    @Override
    public void addAllInventory(List<Inventory> inventory) {
        inventory.forEach(i -> {
            if (!this.inventory.contains(i)) {
                this.inventory.add(i);
            }
        });
    }

    @Override
    public long getNumberOfAvailableInventory() {
        return inventory.stream().filter(i -> i.isAvailable()).count();
    }

    @Override
    public List<Inventory> getAvailableInventory() {
        return inventory.stream().filter(i -> i.isAvailable()).collect(Collectors.toList());
    }

    @Override
    public long getNumberOfUnavailableInventory() {
        return inventory.stream().filter(i -> !i.isAvailable()).count();
    }

    @Override
    public List<Inventory> getUnvailableInventory() {
        return inventory.stream().filter(i -> !i.isAvailable()).collect(Collectors.toList());
    }

    @Override
    public long getNumberOfInventory() {
        return inventory.size();
    }

    @Override
    public List<Inventory> getInventory() {
        return inventory.stream().collect(Collectors.toList());
    }

    @Override
    public double getDailyRate() {
        return dailyRate;
    }

    @Override
    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    @Override
    public double getDailyFine() {
        return dailyFine;
    }

    @Override
    public void setDailyFine(double dailyFine) {
        this.dailyFine = dailyFine;
    }

    @Override
    public String getProductId() {
        return productId;
    }

    @Override
    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Override
    public int getBorrowDuration() {
        return borrowDuration;
    }

    @Override
    public void setBorrowDuration(int borrowDuration) {
        this.borrowDuration = borrowDuration;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title;
    }
}
