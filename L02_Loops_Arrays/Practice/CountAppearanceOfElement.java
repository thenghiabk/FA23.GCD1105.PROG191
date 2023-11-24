package L02_Loops_Arrays.Practice;

public class CountAppearanceOfElement {
    public static void main( String[] args ) {
        int[] arr = { 1, 3, 3, 5, 3, 3, 4, 5, 6, 3, 2, 4, 5, 6, 3, 3, 5, 6 };

        int valueToSearch = 3;
        int numOfOccurrences = 0;
        for ( int i = 0; i < arr.length; i++ ) {
            if ( arr[ i ] == valueToSearch ) {
                numOfOccurrences++;
            }
        }

        System.out.println( numOfOccurrences );
    }
}
