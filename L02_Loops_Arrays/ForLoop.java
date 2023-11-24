package L02_Loops_Arrays;

import java.util.Scanner;

public class ForLoop {
    public static void main ( String[] args ) {
        int i;
        int sum = 0;
        int number;

        Scanner scanner = new Scanner( System.in );

        for ( i = 0; i < 20; i++ ) {
            System.out.printf( "Please enter a number (i = %d): ", i );
            number = scanner.nextInt();
            sum += number;
        }

        System.out.println( "Sum of 20 numbers is: " + sum );
    }
}
