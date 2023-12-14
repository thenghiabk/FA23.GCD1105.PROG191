package L09_Testing.MathUtil;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.Assert.*;

public class MathUtilTest {

//    @BeforeAll
//    static void setup(){
//        System.out.println("Executes a method Before all tests");
//    }
//    @BeforeEach
//    void setupThis(){
//        System.out.println("Executed Before each @Test method in the current test class");
//    }

    @Test
    @DisplayName("Add two numbers")
    public void testSum() {
        MathUtil mathUtil = new MathUtil();
        assertEquals(8, mathUtil.sum(3, 5));
        assertEquals(5, mathUtil.sum(-2, 7));
        assertEquals(0, mathUtil.sum(0, 0));
    }

    @Test
    @DisplayName("Subtract two numbers")
    public void testSubtract() {
        MathUtil mathUtil = new MathUtil();
        assertEquals(-2, mathUtil.subtract(3, 5));
        assertEquals(-9, mathUtil.subtract(-2, 7));
        assertEquals(0, mathUtil.subtract(0, 0));
    }

    @Test
    @DisplayName("Divide two numbers")
    public void testDivide() {
        MathUtil mathUtil = new MathUtil();
        assertEquals(2.5, mathUtil.divide(5, 2), 0.0001);
        assertEquals(-2.0, mathUtil.divide(-10, 5), 0.0001);
        //assertEquals(Double.POSITIVE_INFINITY, mathUtil.divide(1, 0), 0.0001); // < crashes the test
        assertThrows(IllegalArgumentException.class, () -> {
            mathUtil.divide(1, 0);
        });
    }

    @Test
    @DisplayName("Multiple two numbers")
    public void testMultiply() {
        MathUtil mathUtil = new MathUtil();
        assertEquals(15, mathUtil.multiply(3, 5));
        assertEquals(-14, mathUtil.multiply(-2, 7));
        assertEquals(0, mathUtil.multiply(0, 0));
    }

    @Test
    public void testMax() {
        MathUtil mathUtil = new MathUtil();
        assertEquals(5, mathUtil.max(3, 5));
        assertEquals(7, mathUtil.max(7, -2));
        assertEquals(0, mathUtil.max(0, 0));
    }

    @Test
    public void testMin() {
        MathUtil mathUtil = new MathUtil();
        assertEquals(3, mathUtil.min(3, 5));
        assertEquals(-10, mathUtil.min(-10, -2));
        assertEquals(0, mathUtil.min(0, 0));
    }

    @Test
    public void testSquare() {
        MathUtil mathUtil = new MathUtil();
        assertEquals(25, mathUtil.square(5));
        assertEquals(0, mathUtil.square(0));
        assertEquals(144, mathUtil.square(-12));
    }

    @Test
    public void testFactorial() {
        MathUtil mathUtil = new MathUtil();
        assertEquals(1, mathUtil.factorial(0));
        assertEquals(1, mathUtil.factorial(1));
        assertEquals(24, mathUtil.factorial(4));
        assertEquals(120, mathUtil.factorial(5));
    }

    @Test
    public void testIsPrime() {
        MathUtil mathUtil = new MathUtil();
        assertFalse(mathUtil.isPrime(1)); //passed
        assertTrue(mathUtil.isPrime(2));
        assertTrue(mathUtil.isPrime(3));
        assertFalse(mathUtil.isPrime(4));
        assertTrue(mathUtil.isPrime(17));
        assertFalse(mathUtil.isPrime(100));
    }

    @DisplayName("CSV File Source Case - Add two numbers")
    @ParameterizedTest
    @CsvFileSource(resources = "/L09_Testing/MathUtil/MathUtil_sum_dataTest.csv", numLinesToSkip = 1)
    public void testSum(int a, int b, int result) {
        MathUtil mathUtil = new MathUtil();
        Assertions.assertEquals(mathUtil.sum(a, b), result);
    }

//    @AfterEach
//    void tearThis(){
//        System.out.println("Executed After each @Test method in the current test class");
//    }
//    @AfterAll
//    static void tear(){
//        System.out.println("Executes a method After all tests");
//    }
}