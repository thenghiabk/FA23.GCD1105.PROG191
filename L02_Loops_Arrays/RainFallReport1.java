package L02_Loops_Arrays;

import java.util.Scanner;

public class RainFallReport1 {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner( System.in );
        double[] rainfall = new double[ 12 ];

        double annualAverage;
        double sum = 0.0;

        for ( int i = 0; i < rainfall.length; i++ ) {
            System.out.printf( "Rainfall for month %d: ", ( i + 1 ) );
            rainfall[ i ] = scanner.nextDouble();
            sum += rainfall[ i ];
        }

        annualAverage = sum / rainfall.length;

        System.out.println( "Annual average: " + annualAverage );
    }
}
