package L09_Testing.Fraction;

// Each Fraction object represents a rational number with a numerator and denominator.
// Fractions are always stored in reduced form such that the GCD of their
// numerator and denominator is always 1.
public final class Fraction {
    private int numerator;
    private int denominator;

    public Fraction() {
        this( 0, 1 );
    }
    public Fraction(int numerator) {
        this(numerator, 1);
    }

    public Fraction(int numerator, int denominator) {
        // reduce the fraction
        int g = gcd(numerator, denominator);
        numerator /= g;
        denominator /= g;
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }

        setNumerator( numerator );
        setDenominator( denominator );
    }

    public void setNumerator( int numerator ) {
        this.numerator = numerator;
    }

    public void setDenominator( int denominator ) {
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public Fraction add( Fraction other) {
        int n = numerator * other.denominator + other.numerator * denominator;
        int d = denominator * other.denominator;
        return new Fraction(n, d);
    }

    public Fraction subtract( Fraction other) {
        int n = numerator * other.denominator - other.numerator * denominator;
        int d = denominator * other.denominator;
        return new Fraction(n, d);
    }

    public Fraction multiply( Fraction other) {
        int n = numerator * other.numerator;
        int d = denominator * other.denominator;
        return new Fraction(n, d);
    }

    public Fraction divide( Fraction other) {
        // check preconditions
        if ( ( denominator == 0 ) || ( other.denominator == 0 ) || ( other.numerator == 0 )) {
            throw new IllegalArgumentException( "invalid denominator" );
        }

        int n = numerator * other.denominator;
        int d = denominator * other.numerator;
        return new Fraction(n, d);
    }

    public String toString() {
        if (denominator == 1) {
            return String.valueOf(numerator);
        } else {
            return numerator + "/" + denominator;
        }
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return Math.abs(a);
        } else {
            return gcd(b, a % b);
        }
    }
}
