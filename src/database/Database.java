package database;

import businessmodels.User;
import interfaces.Customer;
import interfaces.Product;
import java.util.List;

public interface Database {

    public List<Product> getAllProducts();

    public List<Customer> getAllCustomers();

    public List<User> getAllUsers();

    public boolean createProduct(Product product);

    public boolean createCustomer(Customer customer);

    public boolean createUser(User user);

    public boolean updateProduct(Product product);

    public boolean updateCustomer(Customer customer);

    public boolean updateUser(User user);

    public User searchUser(String username);
    
}
