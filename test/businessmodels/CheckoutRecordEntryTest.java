/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessmodels;

import java.time.LocalDate;
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
public class CheckoutRecordEntryTest {
    
    public CheckoutRecordEntryTest() {
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
     * Test of getCheckOutDate method, of class CheckoutRecordEntry.
     */
    @Test
    public void testGetCheckOutDate() {
        System.out.println("getCheckOutDate");
        CheckoutRecordEntry instance = null;
        LocalDate expResult = null;
        LocalDate result = instance.getCheckOutDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDueDate method, of class CheckoutRecordEntry.
     */
    @Test
    public void testGetDueDate() {
        System.out.println("getDueDate");
        CheckoutRecordEntry instance = null;
        LocalDate expResult = null;
        LocalDate result = instance.getDueDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCheckOutDate method, of class CheckoutRecordEntry.
     */
    @Test
    public void testSetCheckOutDate() {
        System.out.println("setCheckOutDate");
        LocalDate checkOutDate = null;
        CheckoutRecordEntry instance = null;
        instance.setCheckOutDate(checkOutDate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDueDate method, of class CheckoutRecordEntry.
     */
    @Test
    public void testSetDueDate() {
        System.out.println("setDueDate");
        LocalDate dueDate = null;
        CheckoutRecordEntry instance = null;
        instance.setDueDate(dueDate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInventory method, of class CheckoutRecordEntry.
     */
    @Test
    public void testGetInventory() {
        System.out.println("getInventory");
        CheckoutRecordEntry instance = null;
        Inventory expResult = null;
        Inventory result = instance.getInventory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setInventory method, of class CheckoutRecordEntry.
     */
    @Test
    public void testSetInventory() {
        System.out.println("setInventory");
        Inventory inventory = null;
        CheckoutRecordEntry instance = null;
        instance.setInventory(inventory);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReturnDate method, of class CheckoutRecordEntry.
     */
    @Test
    public void testGetReturnDate() {
        System.out.println("getReturnDate");
        CheckoutRecordEntry instance = null;
        LocalDate expResult = null;
        LocalDate result = instance.getReturnDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setReturnDate method, of class CheckoutRecordEntry.
     */
    @Test
    public void testSetReturnDate() {
        System.out.println("setReturnDate");
        LocalDate returnDate = null;
        CheckoutRecordEntry instance = null;
        instance.setReturnDate(returnDate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isReturned method, of class CheckoutRecordEntry.
     */
    @Test
    public void testIsReturned() {
        System.out.println("isReturned");
        CheckoutRecordEntry instance = null;
        boolean expResult = false;
        boolean result = instance.isReturned();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
