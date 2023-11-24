package L02_Loops_Arrays;

public class WhileLoop1 {
    public static void main( String[] args ) {
        int sum = 0;
        int number = 1;

        while ( sum < 1_000_000 ) {
            sum = sum + number; // 998991 + 1413 = 1000405
            System.out.printf( "number: %d, sum: %d", number, sum ).println( );

            number = number + 1; // update
        }

    }
}
