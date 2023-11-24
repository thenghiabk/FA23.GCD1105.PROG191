package L02_Loops_Arrays.Practice;

import java.util.Arrays;

public class InsertElementAtSpecificPosition {
    public static void main( String[] args ) {
        int[] arr = { 1, 3, 4, 5, 6 };
        int[] newArr = new int[ arr.length + 1 ];
        int valueToAdd = 9;
        int indexOfNewValue = 6;

        for ( int i = 0, j = 0; i < arr.length; i++ ) {
            if ( i == indexOfNewValue - 1 ) {
                j++;
                newArr[ j++ ] = arr[ i ];
            } else {
                newArr[ j++ ] = arr[ i ];
            }
            System.out.printf("i = %d, j = %d", i, j ).println(  );
        }

        newArr[ indexOfNewValue - 1 ] = valueToAdd;

        System.out.println( Arrays.toString( newArr ) );
    }
}
