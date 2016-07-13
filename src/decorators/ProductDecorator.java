package decorators;

import businessmodels.Inventory;
import interfaces.Product;
import interfaces.Validatable;
import interfaces.ValidateOutput;
import interfaces.Validator;
import java.io.Serializable;
import java.util.List;

public abstract class ProductDecorator implements Product, Validatable<ProductDecorator>, Serializable {

    protected Product baseProduct;

    public ProductDecorator(Product baseProduct) {
        this.baseProduct = baseProduct;
    }

    @Override
    public void addDefaultInventory(int numInventoryToAdd) {
        baseProduct.addDefaultInventory(numInventoryToAdd);
    }

    @Override
    public void addInventory(Inventory inventory) {
        baseProduct.addInventory(inventory);
    }

    @Override
    public void addAllInventory(List<Inventory> inventory) {
        baseProduct.addAllInventory(inventory);
    }

    @Override
    public long getNumberOfAvailableInventory() {
        return baseProduct.getNumberOfAvailableInventory();
    }

    @Override
    public List<Inventory> getAvailableInventory() {
        return baseProduct.getAvailableInventory();
    }

    @Override
    public long getNumberOfUnavailableInventory() {
        return baseProduct.getNumberOfUnavailableInventory();
    }

    @Override
    public List<Inventory> getUnvailableInventory() {
        return baseProduct.getUnvailableInventory();
    }

    @Override
    public long getNumberOfInventory() {
        return baseProduct.getNumberOfInventory();
    }

    @Override
    public List<Inventory> getInventory() {
        return baseProduct.getInventory();
    }

    @Override
    public double getDailyRate() {
        return baseProduct.getDailyRate();
    }

    @Override
    public void setDailyRate(double dailyRate) {
        baseProduct.setDailyRate(dailyRate);
    }

    @Override
    public double getDailyFine() {
        return baseProduct.getDailyFine();
    }

    @Override
    public void setDailyFine(double dailyFine) {
        baseProduct.setDailyFine(dailyFine);
    }

    @Override
    public String getProductId() {
        return baseProduct.getProductId();
    }

    @Override
    public void setProductId(String productId) {
        baseProduct.setProductId(productId);
    }

    @Override
    public int getBorrowDuration() {
        return baseProduct.getBorrowDuration();
    }

    @Override
    public void setBorrowDuration(int borrowDuration) {
        baseProduct.setBorrowDuration(borrowDuration);
    }

    @Override
    public void setTitle(String title) {
        baseProduct.setTitle(title);
    }

    @Override
    public String getTitle() {
        return baseProduct.getTitle();
    }

    @Override
    public ValidateOutput validate(Validator<ProductDecorator> validator) {
        return validator.isValid(this);
    }
}
