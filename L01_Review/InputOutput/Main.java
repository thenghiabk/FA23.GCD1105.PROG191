package L01_Review.InputOutput;

import java.util.Scanner;

public class Main {
    public static void main( String[] args ) {
        Scanner scnr = new Scanner( System.in );

        // read a string
        System.out.print( "Enter a message: ");
        String message = scnr.nextLine();

        // read an integer
        System.out.print("Enter an integer: " );
        int n = scnr.nextInt();

        // read a double
        System.out.print( "Enter a double: " );
        double d = scnr.nextDouble( );
    }
}
