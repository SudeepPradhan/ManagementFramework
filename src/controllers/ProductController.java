package controllers;

import businessmodels.AccessType;
import java.util.List;

import businessmodels.Inventory;
import businessmodels.Permission;
import database.Database;
import exceptions.InvalidArgumentException;
import exceptions.UnauthorizedAccessException;
import interfaces.Product;

public abstract class ProductController extends Controller {

    public ProductController(Database database) {
        super(database, Permission.PRODUCT_PERMISSION);
    }

    public abstract boolean validate(Product product);

    public final boolean saveProduct(Product product) throws InvalidArgumentException, UnauthorizedAccessException {
        checkAccess(AccessType.CREATE);
        if (!validate(product)) {
            throw new InvalidArgumentException(product);
        }
        return database.createProduct(product);
    }

    public final boolean updateProduct(Product product) throws InvalidArgumentException, UnauthorizedAccessException {
        checkAccess(AccessType.UPDATE);
        if (!validate(product)) {
            throw new InvalidArgumentException(product);
        }
        return database.updateProduct(product);
    }

    public final List<Product> getAllProducts() throws UnauthorizedAccessException {
        checkAccess(AccessType.READ);
        return database.getAllProducts();
    }

    public final boolean addInventory(Product product, int numInventoryToAdd) throws UnauthorizedAccessException {
        checkAccess(AccessType.UPDATE);
        product.addDefaultInventory(numInventoryToAdd);
        return database.updateProduct(product);
    }

    public final boolean addInventory(Product product, Inventory inventory) throws UnauthorizedAccessException {
        checkAccess(AccessType.UPDATE);
        product.addInventory(inventory);
        return database.updateProduct(product);
    }
}
