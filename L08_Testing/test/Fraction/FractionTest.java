package L09_Testing.Fraction;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FractionTest {
    @Test
    public void testDefaultConstructor( ) {
        Fraction fraction = new Fraction( );
        assertEquals( 0, fraction.getNumerator( ) );
        assertEquals( 1, fraction.getDenominator( ) );
    }

    @Test
    public void testConstructorWithNumerator( ) {
        Fraction fraction = new Fraction( 5 );
        assertEquals( 5, fraction.getNumerator( ) );
        assertEquals( 1, fraction.getDenominator( ) );
    }

    @Test
    public void testConstructorWithNumeratorAndDenominator( ) {
        Fraction fraction = new Fraction( 3, 4 );
        assertEquals( 3, fraction.getNumerator( ) );
        assertEquals( 4, fraction.getDenominator( ) );
    }

    @Test
    public void testAdd( ) {
        Fraction fraction1 = new Fraction( 1, 2 );
        Fraction fraction2 = new Fraction( 1, 3 );
        Fraction result = fraction1.add( fraction2 );
        assertEquals( 5, result.getNumerator( ) );
        assertEquals( 6, result.getDenominator( ) );
    }

    @Test
    public void testSubtract( ) {
        Fraction fraction1 = new Fraction( 3, 4 );
        Fraction fraction2 = new Fraction( 1, 2 );
        Fraction result = fraction1.subtract( fraction2 );
        assertEquals( 1, result.getNumerator( ) );
        assertEquals( 4, result.getDenominator( ) );
    }

    @Test
    public void testMultiply( ) {
        Fraction fraction1 = new Fraction( 2, 3 );
        Fraction fraction2 = new Fraction( 3, 4 );
        Fraction result = fraction1.multiply( fraction2 );
        assertEquals( 1, result.getNumerator( ) );
        assertEquals( 2, result.getDenominator( ) );
    }

    @Test
    public void testDivide( ) {
        Fraction fraction1 = new Fraction( 2, 3 );
        Fraction fraction2 = new Fraction( 3, 4 );
        Fraction result = fraction1.divide( fraction2 );
        assertEquals( 8, result.getNumerator( ) );
        assertEquals( 9, result.getDenominator( ) );
    }

    @Test
    public void testToString( ) {
        Fraction fraction = new Fraction( 3, 4 );
        assertEquals( "3/4", fraction.toString( ) );

        Fraction wholeNumberFraction = new Fraction( 5 );
        assertEquals( "5", wholeNumberFraction.toString( ) );
    }

    /*
        TORTURE TEST

        Each following test method validates the expected behavior of the Fraction class
        in specific scenarios, such as large values, negative values, precision and rounding,
        division by zero, performance, edge cases, and string representation.
     */

    @Test
    public void testLargeValues( ) {
        Fraction fraction = new Fraction( Integer.MAX_VALUE, Integer.MAX_VALUE - 1 );
        assertEquals( 1, fraction.getNumerator( ) );
        assertEquals( 1, fraction.getDenominator( ) );

        Fraction result = fraction.add( new Fraction( Integer.MAX_VALUE, Integer.MAX_VALUE ) );
        assertEquals( 2, result.getNumerator( ) );
        assertEquals( 1, result.getDenominator( ) );
    }

    @Test
    public void testNegativeValues( ) {
        Fraction fraction = new Fraction( -10, -5 );
        assertEquals( 2, fraction.getNumerator( ) );
        assertEquals( 1, fraction.getDenominator( ) );

        Fraction result = fraction.subtract( new Fraction( -3, -4 ) );
        assertEquals( -5, result.getNumerator( ) );
        assertEquals( 4, result.getDenominator( ) );
    }

    @Test
    public void testDivisionByZero( ) {
        Fraction fraction = new Fraction( 5, 2 );
        Fraction zero = new Fraction( 0 );
        assertThrows( IllegalArgumentException.class, ( ) -> {
            fraction.divide( zero );
        } );
    }

    @Test
    public void testPrecisionAndRounding( ) {
        Fraction fraction1 = new Fraction( 1, 3 );
        Fraction fraction2 = new Fraction( 2, 7 );

        Fraction result = fraction1.add( fraction2 );
        assertEquals( 13, result.getNumerator( ) );
        assertEquals( 21, result.getDenominator( ) );
    }

    @Test
    @Timeout( 1000 )
    public void testPerformance( ) {
        for ( int i = 0; i < 100000; i++ ) {
            Fraction fraction1 = new Fraction( i, i + 1 );
            Fraction fraction2 = new Fraction( i + 2, i + 3 );
            fraction1.add( fraction2 );
        }
    }

    @Test
    public void testEdgeCases( ) {
        Fraction fraction1 = new Fraction( Integer.MIN_VALUE, Integer.MIN_VALUE );
        assertEquals( 1, fraction1.getNumerator( ) );
        assertEquals( 1, fraction1.getDenominator( ) );

        Fraction fraction2 = new Fraction( Integer.MAX_VALUE, Integer.MAX_VALUE );
        assertEquals( 1, fraction2.getNumerator( ) );
        assertEquals( 1, fraction2.getDenominator( ) );

        Fraction result = fraction1.divide( fraction2 );
        assertEquals( 1, result.getNumerator( ) );
        assertEquals( 1, result.getDenominator( ) );
    }

    @Test
    public void testStringRepresentation( ) {
        Fraction fraction = new Fraction( 3, 4 );
        assertEquals( "3/4", fraction.toString( ) );

        Fraction wholeNumberFraction = new Fraction( 5 );
        assertEquals( "5", wholeNumberFraction.toString( ) );
    }
}