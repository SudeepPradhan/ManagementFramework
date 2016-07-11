/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import businessmodels.Inventory;
import interfaces.Product;
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
public class ProductControllerTest {
    
    public ProductControllerTest() {
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
     * Test of validate method, of class ProductController.
     */
    @Test
    public void testValidate() {
        System.out.println("validate");
        Product product = null;
        ProductController instance = null;
        boolean expResult = false;
        boolean result = instance.validate(product);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveProduct method, of class ProductController.
     */
    @Test
    public void testSaveProduct() throws Exception {
        System.out.println("saveProduct");
        Product product = null;
        ProductController instance = null;
        boolean expResult = false;
        boolean result = instance.saveProduct(product);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateProduct method, of class ProductController.
     */
    @Test
    public void testUpdateProduct() throws Exception {
        System.out.println("updateProduct");
        Product product = null;
        ProductController instance = null;
        boolean expResult = false;
        boolean result = instance.updateProduct(product);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllProducts method, of class ProductController.
     */
    @Test
    public void testGetAllProducts() throws Exception {
        System.out.println("getAllProducts");
        ProductController instance = null;
        List<Product> expResult = null;
        List<Product> result = instance.getAllProducts();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addInventory method, of class ProductController.
     */
    @Test
    public void testAddInventory_Product_int() throws Exception {
        System.out.println("addInventory");
        Product product = null;
        int numInventoryToAdd = 0;
        ProductController instance = null;
        boolean expResult = false;
        boolean result = instance.addInventory(product, numInventoryToAdd);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addInventory method, of class ProductController.
     */
    @Test
    public void testAddInventory_Product_Inventory() throws Exception {
        System.out.println("addInventory");
        Product product = null;
        Inventory inventory = null;
        ProductController instance = null;
        boolean expResult = false;
        boolean result = instance.addInventory(product, inventory);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ProductControllerImpl extends ProductController {

        public ProductControllerImpl() {
            super(null);
        }

        public boolean validate(Product product) {
            return false;
        }
    }
    
}
