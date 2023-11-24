package L02_Loops_Arrays.Practice;

import java.util.Arrays;

public class RemoveElement {
    public static void main( String[] args ) {
        int[] arr = { 1, 3, 4, 5, 5, 6 };
        int[] newArr = new int[ arr.length - 1 ];
        int valueToDelete = 5;

        for ( int i = 0, j = 0; i < arr.length; i++ ) {
            if ( arr[ i ] != valueToDelete ) {
                newArr[ j++ ] = arr[ i ];
            }
        }

        System.out.println( Arrays.toString( newArr ) );

    }
}
