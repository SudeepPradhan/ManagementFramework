package businessmodels;

import interfaces.Product;
import java.io.Serializable;

public abstract class Inventory implements Serializable {

    protected String inventoryId;
    protected Product product;

    public Inventory(String inventoryId, Product product) {
        this.inventoryId = inventoryId;
        this.product = product;
    }

    public abstract boolean isAvailable();

    public abstract void setAvailable(boolean available);

    public String getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(String inventoryId) {
        this.inventoryId = inventoryId;
    }

    public Product getProduct() {
        return product;
    }

}
