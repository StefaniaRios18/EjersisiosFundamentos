/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ec.intsuperior.vista;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DELL
 */
public class APLICACIONTest {
    
    public APLICACIONTest() {
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
     * Test of main method, of class APLICACION.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        APLICACION.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Faringe method, of class APLICACION.
     */
    @Test
    public void testFaringe() {
        System.out.println("Faringe");
        APLICACION.Faringe();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clavebanco method, of class APLICACION.
     */
    @Test
    public void testClavebanco() {
        System.out.println("clavebanco");
        APLICACION.clavebanco();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
