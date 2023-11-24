package L02_Loops_Arrays;

public class WhileLoop2 {
    public static void main( String[] args ) {
        int product = 1;
        int number = 1;
        int count = 20;
        int lastNumber;

        lastNumber = 2 * count - 1; // lastNumber = 2 * 20 - 1 = 39

        while ( number < lastNumber ) {
            product = product * number;
            System.out.printf( "number: %d, product: %d", number, product ).println( );

            number = number + 2; // update
        }

    }
}
