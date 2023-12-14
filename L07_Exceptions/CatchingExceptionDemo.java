package L07_Exceptions;

import java.util.Scanner;

public class CatchingExceptionDemo {
    public static void main( String[] args ) {
        show( );
    }
    public static void show( ) {
        Scanner scanner = new Scanner( System.in );
        boolean done = false;

        try {
            // call methods
            sayHello( "John" ); // may cause NullPointerException
            divide( 6, 2 ); // may cause ArithmeticException

        } catch ( NullPointerException e ) {
            System.out.println( "Error was caused by sayHello()." );
        } catch ( ArithmeticException e ) {
            System.out.println( "Error was caused by divide()." );
        } catch ( Exception e ) {
            System.out.println( e.getMessage( ) );
        }
        System.out.println( "Thank you." );

    }

    public static void divide( int num1, int num2 ) {
        System.out.println( num1 / num2 );
    }

    public static void sayHello( String name ) {
        System.out.println( "Hello, " + name.toUpperCase( ) + "." );
    }

}
