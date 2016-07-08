/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package security.hash;

import java.security.NoSuchAlgorithmException;
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
public class HashingMethodTest {
    
    public HashingMethodTest() {
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
     * Test of hash method, of class HashingMethod.
     */
    @Test
    public void testHash() throws Exception {
        System.out.println("hash");
        String data = "";
        HashingMethod instance = new HashingMethodImpl();
        String expResult = "";
        String result = instance.hash(data);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class HashingMethodImpl implements HashingMethod {

        public String hash(String data) throws NoSuchAlgorithmException {
            return "";
        }
    }
    
}
