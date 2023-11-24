package L02_Loops_Arrays;

import java.util.Arrays;

public class RainFallReport3 {
    public static void main ( String[] args ) {
        // assume rainfall is declared and initialized properly
        double[] quarterAverage = new double[ 4 ];
        double[] rainfall = { 2.443, 8.99, 12.3, 45.009, 18.2,
                9.00, 3.123, 22.084, 18.08, 10.5, 10.5, 10.5 };
        double sum;
        
        for ( int i = 0; i < 4; i++ ) {
            sum = 0;

            for ( int j = 0; j < 3; j++ ) {
                // compute the sum of
                sum += rainfall[ 3 * i + j ]; // one quarter
            }
            quarterAverage[ i ] = sum / 3.0; // Quarter (i+1) average
        }

        System.out.println( Arrays.toString( quarterAverage ) );
    }
}
