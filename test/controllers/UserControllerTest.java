/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import businessmodels.User;
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
public class UserControllerTest {
    
    public UserControllerTest() {
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
     * Test of validate method, of class UserController.
     */
    @Test
    public void testValidate() {
        System.out.println("validate");
        User user = null;
        UserController instance = null;
        boolean expResult = false;
        boolean result = instance.validate(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveUser method, of class UserController.
     */
    @Test
    public void testSaveUser() throws Exception {
        System.out.println("saveUser");
        User user = null;
        UserController instance = null;
        boolean expResult = false;
        boolean result = instance.saveUser(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateUser method, of class UserController.
     */
    @Test
    public void testUpdateUser() throws Exception {
        System.out.println("updateUser");
        User user = null;
        UserController instance = null;
        boolean expResult = false;
        boolean result = instance.updateUser(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllUsers method, of class UserController.
     */
    @Test
    public void testGetAllUsers() throws Exception {
        System.out.println("getAllUsers");
        UserController instance = null;
        List<User> expResult = null;
        List<User> result = instance.getAllUsers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of authenticate method, of class UserController.
     */
    @Test
    public void testAuthenticate() throws Exception {
        System.out.println("authenticate");
        String username = "";
        String password = "";
        UserController instance = null;
        User expResult = null;
        User result = instance.authenticate(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of login method, of class UserController.
     */
    @Test
    public void testLogin() throws Exception {
        System.out.println("login");
        String username = "";
        String password = "";
        UserController instance = null;
        boolean expResult = false;
        boolean result = instance.login(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of logout method, of class UserController.
     */
    @Test
    public void testLogout() {
        System.out.println("logout");
        UserController instance = null;
        instance.logout();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class UserControllerImpl extends UserController {

        public UserControllerImpl() {
            super(null, null);
        }

        public boolean validate(User user) {
            return false;
        }
    }
    
}
