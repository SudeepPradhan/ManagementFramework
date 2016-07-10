/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessmodels;

import interfaces.Customer;
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
public class CustomerTest {
    
    public CustomerTest() {
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
     * Test of getCustomerId method, of class Customer.
     */
    @Test
    public void testGetCustomerId() {
        System.out.println("getCustomerId");
        Customer instance = null;
        String expResult = "";
        String result = instance.getCustomerId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCustomerId method, of class Customer.
     */
    @Test
    public void testSetCustomerId() {
        System.out.println("setCustomerId");
        String customerId = "";
        Customer instance = null;
        instance.setCustomerId(customerId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCheckoutRecord method, of class Customer.
     */
    @Test
    public void testGetCheckoutRecord() {
        System.out.println("getCheckoutRecord");
        Customer instance = null;
        CheckoutRecord expResult = null;
        CheckoutRecord result = instance.getCheckoutRecord();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCheckoutRecord method, of class Customer.
     */
    @Test
    public void testSetCheckoutRecord() {
        System.out.println("setCheckoutRecord");
        CheckoutRecord checkoutRecord = null;
        Customer instance = null;
        instance.setCheckoutRecord(checkoutRecord);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
