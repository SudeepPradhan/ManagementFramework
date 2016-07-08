/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessmodels;

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
public class ProductTest {
    
    public ProductTest() {
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
     * Test of addDefaultInventory method, of class Product.
     */
    @Test
    public void testAddDefaultInventory() {
        System.out.println("addDefaultInventory");
        int numInventoryToAdd = 0;
        Product instance = null;
        instance.addDefaultInventory(numInventoryToAdd);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addInventory method, of class Product.
     */
    @Test
    public void testAddInventory() {
        System.out.println("addInventory");
        Inventory inventory = null;
        Product instance = null;
        instance.addInventory(inventory);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addAllInventory method, of class Product.
     */
    @Test
    public void testAddAllInventory() {
        System.out.println("addAllInventory");
        List<Inventory> inventory = null;
        Product instance = null;
        instance.addAllInventory(inventory);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumberOfAvailableInventory method, of class Product.
     */
    @Test
    public void testGetNumberOfAvailableInventory() {
        System.out.println("getNumberOfAvailableInventory");
        Product instance = null;
        long expResult = 0L;
        long result = instance.getNumberOfAvailableInventory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAvailableInventory method, of class Product.
     */
    @Test
    public void testGetAvailableInventory() {
        System.out.println("getAvailableInventory");
        Product instance = null;
        List<Inventory> expResult = null;
        List<Inventory> result = instance.getAvailableInventory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumberOfUnavailableInventory method, of class Product.
     */
    @Test
    public void testGetNumberOfUnavailableInventory() {
        System.out.println("getNumberOfUnavailableInventory");
        Product instance = null;
        long expResult = 0L;
        long result = instance.getNumberOfUnavailableInventory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUnvailableInventory method, of class Product.
     */
    @Test
    public void testGetUnvailableInventory() {
        System.out.println("getUnvailableInventory");
        Product instance = null;
        List<Inventory> expResult = null;
        List<Inventory> result = instance.getUnvailableInventory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumberOfInventory method, of class Product.
     */
    @Test
    public void testGetNumberOfInventory() {
        System.out.println("getNumberOfInventory");
        Product instance = null;
        long expResult = 0L;
        long result = instance.getNumberOfInventory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInventory method, of class Product.
     */
    @Test
    public void testGetInventory() {
        System.out.println("getInventory");
        Product instance = null;
        List<Inventory> expResult = null;
        List<Inventory> result = instance.getInventory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDailyRate method, of class Product.
     */
    @Test
    public void testGetDailyRate() {
        System.out.println("getDailyRate");
        Product instance = null;
        double expResult = 0.0;
        double result = instance.getDailyRate();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDailyRate method, of class Product.
     */
    @Test
    public void testSetDailyRate() {
        System.out.println("setDailyRate");
        double dailyRate = 0.0;
        Product instance = null;
        instance.setDailyRate(dailyRate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDailyFine method, of class Product.
     */
    @Test
    public void testGetDailyFine() {
        System.out.println("getDailyFine");
        Product instance = null;
        double expResult = 0.0;
        double result = instance.getDailyFine();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDailyFine method, of class Product.
     */
    @Test
    public void testSetDailyFine() {
        System.out.println("setDailyFine");
        double dailyFine = 0.0;
        Product instance = null;
        instance.setDailyFine(dailyFine);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProductId method, of class Product.
     */
    @Test
    public void testGetProductId() {
        System.out.println("getProductId");
        Product instance = null;
        String expResult = "";
        String result = instance.getProductId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProductId method, of class Product.
     */
    @Test
    public void testSetProductId() {
        System.out.println("setProductId");
        String productId = "";
        Product instance = null;
        instance.setProductId(productId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
