/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package pe_test_swt;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author vuvo0
 */
public class TestFunctionsTest {
    
    public TestFunctionsTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of calculateSalary method, of class TestFunctions.
     */
    @Test
    public void testCalculateSalary() {
        System.out.println("calculateSalary");
        int yearsOfService = 0;
        double basicSalary = 0.0;
        double performanceRating = 0.0;
        TestFunctions instance = new TestFunctions();
        double expResult = 0.0;
        double result = instance.calculateSalary(yearsOfService, basicSalary, performanceRating);
        assertEquals(expResult, result, 0);
        fail("The test case is a prototype.");
    }
    
}
