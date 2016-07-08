/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package security.hash;

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
public class PasswordHasherTest {
    
    public PasswordHasherTest() {
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
     * Test of setHashingStrategy method, of class PasswordHasher.
     */
    @Test
    public void testSetHashingStrategy() {
        System.out.println("setHashingStrategy");
        HashingMethod hashingStrategy = null;
        PasswordHasher instance = null;
        instance.setHashingStrategy(hashingStrategy);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of encrypt method, of class PasswordHasher.
     */
    @Test
    public void testEncrypt() throws Exception {
        System.out.println("encrypt");
        String password = "";
        PasswordHasher instance = null;
        String expResult = "";
        String result = instance.encrypt(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSHA1HashMethod method, of class PasswordHasher.
     */
    @Test
    public void testGetSHA1HashMethod() {
        System.out.println("getSHA1HashMethod");
        HashingMethod expResult = null;
        HashingMethod result = PasswordHasher.getSHA1HashMethod();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMD5HashMethod method, of class PasswordHasher.
     */
    @Test
    public void testGetMD5HashMethod() {
        System.out.println("getMD5HashMethod");
        HashingMethod expResult = null;
        HashingMethod result = PasswordHasher.getMD5HashMethod();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJBcryptHashMethod method, of class PasswordHasher.
     */
    @Test
    public void testGetJBcryptHashMethod() {
        System.out.println("getJBcryptHashMethod");
        HashingMethod expResult = null;
        HashingMethod result = PasswordHasher.getJBcryptHashMethod();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
