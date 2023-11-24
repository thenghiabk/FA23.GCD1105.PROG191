package L02_Loops_Arrays;

import java.util.Scanner;

public class WhileLoop3 {

    public static void main( String[] args ) {
        int age;
        Scanner scanner = new Scanner( System.in );

        System.out.print( "Your Age (between 0 and 130): " );
        age = scanner.nextInt( );

        while ( age < 0 || age > 130 ) {
            System.out.println( "An invalid age was entered. Please try again." );

            System.out.print( "Your Age (between 0 and 130): " );
            // age = scanner.nextInt( );
        }
    }
}
