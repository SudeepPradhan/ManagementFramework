/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessmodels;

import interfaces.Product;
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
public class InventoryTest {
    
    public InventoryTest() {
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
     * Test of isAvailable method, of class Inventory.
     */
    @Test
    public void testIsAvailable() {
        System.out.println("isAvailable");
        Inventory instance = null;
        boolean expResult = false;
        boolean result = instance.isAvailable();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAvailable method, of class Inventory.
     */
    @Test
    public void testSetAvailable() {
        System.out.println("setAvailable");
        boolean available = false;
        Inventory instance = null;
        instance.setAvailable(available);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInventoryId method, of class Inventory.
     */
    @Test
    public void testGetInventoryId() {
        System.out.println("getInventoryId");
        Inventory instance = null;
        String expResult = "";
        String result = instance.getInventoryId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setInventoryId method, of class Inventory.
     */
    @Test
    public void testSetInventoryId() {
        System.out.println("setInventoryId");
        String inventoryId = "";
        Inventory instance = null;
        instance.setInventoryId(inventoryId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProduct method, of class Inventory.
     */
    @Test
    public void testGetProduct() {
        System.out.println("getProduct");
        Inventory instance = null;
        Product expResult = null;
        Product result = instance.getProduct();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class InventoryImpl extends Inventory {

        public InventoryImpl() {
            super("", null);
        }

        public boolean isAvailable() {
            return false;
        }

        public void setAvailable(boolean available) {
        }
    }
    
}
