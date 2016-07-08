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
public class RoleTest {
    
    public RoleTest() {
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
     * Test of getName method, of class Role.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Role instance = new Role();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Role.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Role instance = new Role();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPermission method, of class Role.
     */
    @Test
    public void testGetPermission() {
        System.out.println("getPermission");
        Role instance = new Role();
        List<Permission> expResult = null;
        List<Permission> result = instance.getPermission();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPermission method, of class Role.
     */
    @Test
    public void testSetPermission() {
        System.out.println("setPermission");
        List<Permission> permission = null;
        Role instance = new Role();
        instance.setPermission(permission);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
