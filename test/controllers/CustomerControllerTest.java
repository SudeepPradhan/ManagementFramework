/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

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
public class CustomerControllerTest {
    
    public CustomerControllerTest() {
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
     * Test of validate method, of class CustomerController.
     */
    @Test
    public void testValidate() {
        System.out.println("validate");
        Customer customer = null;
        CustomerController instance = null;
        boolean expResult = false;
        boolean result = instance.validate(customer);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveCustomer method, of class CustomerController.
     */
    @Test
    public void testSaveCustomer() throws Exception {
        System.out.println("saveCustomer");
        Customer customer = null;
        CustomerController instance = null;
        boolean expResult = false;
        boolean result = instance.saveCustomer(customer);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateCustomer method, of class CustomerController.
     */
    @Test
    public void testUpdateCustomer() throws Exception {
        System.out.println("updateCustomer");
        Customer customer = null;
        CustomerController instance = null;
        boolean expResult = false;
        boolean result = instance.updateCustomer(customer);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllCustomers method, of class CustomerController.
     */
    @Test
    public void testGetAllCustomers() throws Exception {
        System.out.println("getAllCustomers");
        CustomerController instance = null;
        List<Customer> expResult = null;
        List<Customer> result = instance.getAllCustomers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class CustomerControllerImpl extends CustomerController {

        public CustomerControllerImpl() {
            super(null);
        }

        public boolean validate(Customer customer) {
            return false;
        }
    }
    
}
