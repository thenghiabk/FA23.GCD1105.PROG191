package L02_Loops_Arrays;

public class DoWhileLoop {
    public static void main ( String[] args ) {
        int sum = 11;
        int number = 1;

        // Do-While
        do {
            sum += number;
            // number++;
            System.out.println( "Sum = " + sum );
        } while ( sum <= 10 );

        /* // While
        while ( sum <= 10 ) {
            sum += number;
            // number++;
            System.out.println( "Sum = " + sum );
        } */
    }
}
