package L02_Loops_Arrays;

import java.util.Scanner;

public class RainFallReport2 {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner( System.in );
        double[] rainfall = new double[ 12 ];
        // String[] monthName = new String[ 12 ];
        // monthName[0] = "January";
        // monthName[1] = "Febuary";
        String[] monthName = { "January", "February", "March", "April",
                "May", "June", "July", "August", "September", "October",
                "November", "December" };
        // System.out.println( Arrays.toString( monthName ) );
        double annualAverage;
        double sum = 0.0;

        for ( int i = 0; i < rainfall.length; i++ ) {
            System.out.print( "Rainfall for " + monthName[ i ] + ": " );
            rainfall[ i ] = scanner.nextDouble();
            sum += rainfall[ i ];
        }

        annualAverage = sum / rainfall.length;
        System.out.println( "Annual average: " + annualAverage );

    }
}
