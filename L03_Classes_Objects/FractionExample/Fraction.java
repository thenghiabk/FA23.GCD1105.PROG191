package L03_Classes_Objects.FractionExample;

public class Fraction {

    private int numerator;
    private int denominator;

    public Fraction( int numerator ) {
        this( numerator, 1 );
    }

    public Fraction( int numerator, int denominator ) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator( ) {
        return numerator;
    }

    public void setNumerator( int numerator ) {
        this.numerator = numerator;
    }

    public int getDenominator( ) {
        return denominator;
    }

    public void setDenominator( int denominator ) {
        this.denominator = denominator;
    }

    private static int gcd( int a, int b ) {
        if ( b == 0 ) {
            return Math.abs( a );
        } else {
            return gcd( b, a % b );
        }
    }

    public String toString( ) {
        if ( denominator == 1 ) {
            return String.valueOf( numerator );
        } else {
            return numerator + "/" + denominator;
        }
    }

    public Fraction simplify( ) {
        Fraction simp;

        int num = getNumerator( );
        int denom = getDenominator( );
        int gcd = gcd( num, denom );

        simp = new Fraction( num / gcd, denom / gcd );
        return simp;
    }

    public Fraction add( Fraction frac ) {
        int a, b, c, d;
        Fraction sum;

        a = this.getNumerator( ); // object's numerator
        b = this.getDenominator( ); // object's denominator

        c = frac.getNumerator( ); // frac's numerator
        d = frac.getDenominator( ); // frac's denominator

        sum = new Fraction( a * d + b * c, b * d );

        return sum;

    }
}
