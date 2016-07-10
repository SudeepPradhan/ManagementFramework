/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import businessmodels.Product;
import businessmodels.User;
import interfaces.Customer;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sudeep
 */
public class DatabaseTest {
    
    public DatabaseTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getAllProducts method, of class Database.
     */
    @Test
    public void testGetAllProducts() {
        System.out.println("getAllProducts");
        Database instance = new DatabaseImpl();
        List<Product> expResult = null;
        List<Product> result = instance.getAllProducts();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllCustomers method, of class Database.
     */
    @Test
    public void testGetAllCustomers() {
        System.out.println("getAllCustomers");
        Database instance = new DatabaseImpl();
        List<Customer> expResult = null;
        List<Customer> result = instance.getAllCustomers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllUsers method, of class Database.
     */
    @Test
    public void testGetAllUsers() {
        System.out.println("getAllUsers");
        Database instance = new DatabaseImpl();
        List<User> expResult = null;
        List<User> result = instance.getAllUsers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createProduct method, of class Database.
     */
    @Test
    public void testCreateProduct() {
        System.out.println("createProduct");
        Product product = null;
        Database instance = new DatabaseImpl();
        boolean expResult = false;
        boolean result = instance.createProduct(product);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createCustomer method, of class Database.
     */
    @Test
    public void testCreateCustomer() {
        System.out.println("createCustomer");
        Customer customer = null;
        Database instance = new DatabaseImpl();
        boolean expResult = false;
        boolean result = instance.createCustomer(customer);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createUser method, of class Database.
     */
    @Test
    public void testCreateUser() {
        System.out.println("createUser");
        User user = null;
        Database instance = new DatabaseImpl();
        boolean expResult = false;
        boolean result = instance.createUser(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateProduct method, of class Database.
     */
    @Test
    public void testUpdateProduct() {
        System.out.println("updateProduct");
        Product product = null;
        Database instance = new DatabaseImpl();
        boolean expResult = false;
        boolean result = instance.updateProduct(product);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateCustomer method, of class Database.
     */
    @Test
    public void testUpdateCustomer() {
        System.out.println("updateCustomer");
        Customer customer = null;
        Database instance = new DatabaseImpl();
        boolean expResult = false;
        boolean result = instance.updateCustomer(customer);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateUser method, of class Database.
     */
    @Test
    public void testUpdateUser() {
        System.out.println("updateUser");
        User user = null;
        Database instance = new DatabaseImpl();
        boolean expResult = false;
        boolean result = instance.updateUser(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchUser method, of class Database.
     */
    @Test
    public void testSearchUser() {
        System.out.println("searchUser");
        String username = "";
        Database instance = new DatabaseImpl();
        User expResult = null;
        User result = instance.searchUser(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class DatabaseImpl implements Database {

        public List<Product> getAllProducts() {
            return null;
        }

        public List<Customer> getAllCustomers() {
            return null;
        }

        public List<User> getAllUsers() {
            return null;
        }

        public boolean createProduct(Product product) {
            return false;
        }

        public boolean createCustomer(Customer customer) {
            return false;
        }

        public boolean createUser(User user) {
            return false;
        }

        public boolean updateProduct(Product product) {
            return false;
        }

        public boolean updateCustomer(Customer customer) {
            return false;
        }

        public boolean updateUser(User user) {
            return false;
        }

        public User searchUser(String username) {
            return null;
        }
    }
    
}
