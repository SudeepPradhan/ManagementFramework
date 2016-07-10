/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import businessmodels.CheckoutRecordEntry;
import businessmodels.Inventory;
import interfaces.Customer;
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
public class CirculationControllerTest {
    
    public CirculationControllerTest() {
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
     * Test of checkout method, of class CirculationController.
     */
    @Test
    public void testCheckout() throws Exception {
        System.out.println("checkout");
        Customer customer = null;
        Inventory inventory = null;
        LocalDate checkoutDate = null;
        LocalDate dueDate = null;
        CirculationController instance = null;
        boolean expResult = false;
        boolean result = instance.checkout(customer, inventory, checkoutDate, dueDate);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkin method, of class CirculationController.
     */
    @Test
    public void testCheckin() throws Exception {
        System.out.println("checkin");
        Customer customer = null;
        CheckoutRecordEntry checkoutRecordEntry = null;
        CirculationController instance = null;
        boolean expResult = false;
        boolean result = instance.checkin(customer, checkoutRecordEntry);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateAmount method, of class CirculationController.
     */
    @Test
    public void testCalculateAmount() throws Exception {
        System.out.println("calculateAmount");
        CheckoutRecordEntry checkoutRecordEntry = null;
        CirculationController instance = null;
        double expResult = 0.0;
        double result = instance.calculateAmount(checkoutRecordEntry);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateOverdueFine method, of class CirculationController.
     */
    @Test
    public void testCalculateOverdueFine() throws Exception {
        System.out.println("calculateOverdueFine");
        CheckoutRecordEntry checkoutRecordEntry = null;
        CirculationController instance = null;
        double expResult = 0.0;
        double result = instance.calculateOverdueFine(checkoutRecordEntry);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateBaseAmount method, of class CirculationController.
     */
    @Test
    public void testCalculateBaseAmount() throws Exception {
        System.out.println("calculateBaseAmount");
        CheckoutRecordEntry checkoutRecordEntry = null;
        CirculationController instance = null;
        double expResult = 0.0;
        double result = instance.calculateBaseAmount(checkoutRecordEntry);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class CirculationControllerImpl extends CirculationController {

        public CirculationControllerImpl() {
            super(null);
        }
    }
    
}
