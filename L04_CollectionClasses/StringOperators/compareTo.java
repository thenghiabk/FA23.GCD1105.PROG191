package L04_CollectionClasses.StringOperators;

public class compareTo {
    public static void main( String[] args ) {
        /**
         *   The Java String class compareTo() method compares the given
         *   string with the current string lexicographically.
         *   It returns a positive number, negative number, or 0.
         *   ___________________________________________
         *   	if s1 > s2, it returns positive number
         * 	    if s1 < s2, it returns negative number
         * 	    if s1 == s2, it returns 0
         *   ___________________________________________
         *
         *      x.compareTo(y) <  0     // x <  y
         *      x.compareTo(y) <= 0     // x <= y
         *      x.compareTo(y) != 0     // x != y
         *      x.compareTo(y) == 0     // x == y
         *      x.compareTo(y) >  0     // x >  y
         *      x.compareTo(y) >= 0     // x >= y
         */

        String s1 = "hello";
        String s2 = "hello";
        String s3 = "hell0";
        String s4 = "Hello";
        System.out.println( s1.compareTo( s2 ) );
        System.out.println( s1.compareTo( s3 ) );
        System.out.println( s1.compareTo( s4 ) );

    }
}
