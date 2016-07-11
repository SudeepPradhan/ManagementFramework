package businessmodels;

import interfaces.Product;

public class DefaultInventory extends Inventory {

    protected boolean isAvailable;

    public DefaultInventory(String inventoryId, Product product) {
        super(inventoryId, product);
        isAvailable = true;
    }

    @Override
    public boolean isAvailable() {
        return isAvailable;
    }

    @Override
    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

}
