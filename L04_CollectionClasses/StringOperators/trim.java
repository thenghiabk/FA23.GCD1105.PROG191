package L04_CollectionClasses.StringOperators;

public class trim {
    public static void main( String[] args ) {
        /**
         * Remove whitespace from both sides of a string
         *
         * Returns:	A String value, which is a copy of the string, without leading and trailing whitespace
         */

        String str = "    hello world   ";
        System.out.println( str );
        System.out.println(str.trim() );

    }
}
