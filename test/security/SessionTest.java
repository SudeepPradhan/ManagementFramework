/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package security;

import businessmodels.User;
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
public class SessionTest {
    
    public SessionTest() {
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
     * Test of values method, of class Session.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        Session[] expResult = null;
        Session[] result = Session.values();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valueOf method, of class Session.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String name = "";
        Session expResult = null;
        Session result = Session.valueOf(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUser method, of class Session.
     */
    @Test
    public void testSetUser() {
        System.out.println("setUser");
        User user = null;
        Session instance = null;
        instance.setUser(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUser method, of class Session.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        Session instance = null;
        User expResult = null;
        User result = instance.getUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hasLoggedInUser method, of class Session.
     */
    @Test
    public void testHasLoggedInUser() {
        System.out.println("hasLoggedInUser");
        Session instance = null;
        boolean expResult = false;
        boolean result = instance.hasLoggedInUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
