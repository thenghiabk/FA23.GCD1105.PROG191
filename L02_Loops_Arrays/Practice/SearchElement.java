package L02_Loops_Arrays.Practice;

public class SearchElement {
    public static void main( String[] args ) {
        int[] arr = { 1, 3, 4, 5, 6 };
        int index = 0;
        int valueToSearch = 4;

        for ( int i = 0; i < arr.length; i++ ) {
            if ( arr[i] == valueToSearch ){
                index = i;
                break;
            }
        }

        System.out.println( index );
    }
}
