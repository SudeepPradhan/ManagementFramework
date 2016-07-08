/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessmodels;

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
public class PermissionTest {
    
    public PermissionTest() {
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
     * Test of getName method, of class Permission.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Permission instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Permission.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Permission instance = null;
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAccessType method, of class Permission.
     */
    @Test
    public void testGetAccessType() {
        System.out.println("getAccessType");
        Permission instance = null;
        AccessType expResult = null;
        AccessType result = instance.getAccessType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAccessType method, of class Permission.
     */
    @Test
    public void testSetAccessType() {
        System.out.println("setAccessType");
        AccessType accessType = null;
        Permission instance = null;
        instance.setAccessType(accessType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
