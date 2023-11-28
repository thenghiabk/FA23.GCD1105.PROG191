package L03_Classes_Objects.FractionExample;

public class Main {
    public static void main( String[] args ) {
        /* Fraction f1 = new Fraction( 24 );
        Fraction f2;
        f2 = f1.simplify( );
        System.out.println( f2 ); */

        Fraction f1 = new Fraction( 3, 4 );
        Fraction f2 = new Fraction( 1, 2 );
        // Fraction f3 = f1.add( f2 );
        Fraction f3 = f2.add( f1 );

        System.out.println( f3 );


    }
}
