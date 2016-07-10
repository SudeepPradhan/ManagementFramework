/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessmodels;

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
public class CheckoutRecordTest {
    
    public CheckoutRecordTest() {
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
     * Test of getCheckoutRecordEntries method, of class CheckoutRecord.
     */
    @Test
    public void testGetCheckoutRecordEntries() {
        System.out.println("getCheckoutRecordEntries");
        CheckoutRecord instance = null;
        List<CheckoutRecordEntry> expResult = null;
        List<CheckoutRecordEntry> result = instance.getCheckoutRecordEntries();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCheckoutRecordEntry method, of class CheckoutRecord.
     */
    @Test
    public void testAddCheckoutRecordEntry() {
        System.out.println("addCheckoutRecordEntry");
        CheckoutRecordEntry checkoutRecordEntry = null;
        CheckoutRecord instance = null;
        instance.addCheckoutRecordEntry(checkoutRecordEntry);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCustomer method, of class CheckoutRecord.
     */
    @Test
    public void testGetCustomer() {
        System.out.println("getCustomer");
        CheckoutRecord instance = null;
        Customer expResult = null;
        Customer result = instance.getCustomer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCustomer method, of class CheckoutRecord.
     */
    @Test
    public void testSetCustomer() {
        System.out.println("setCustomer");
        Customer customer = null;
        CheckoutRecord instance = null;
        instance.setCustomer(customer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
