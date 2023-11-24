package L02_Loops_Arrays.Practice;

import java.util.Arrays;

public class InsertElement {
    public static void main( String[] args ) {
        int[] arr = { 1, 3, 4, 5, 6 };
        int[] newArr = new int[ arr.length + 1 ];
        int valueToAdd = 9;

        for ( int i = 0, j = 0; i < arr.length; i++ ) {
            newArr[ j++ ] = arr[ i ];
        }
        newArr[ newArr.length - 1 ] = valueToAdd;

        System.out.println( Arrays.toString( newArr) );
    }
}
