package L04_CollectionClasses.StringOperators;

public class endsWith {
    public static void main( String[] args ) {
        /**
         * Checks whether a string ends with the specified character(s)
         *
         * Returns:	A boolean value:
         *               true - if the string ends with the specified character(s)
         *               false - if the string does not end with the specified character(s)
         */

        String str = "hello world";
        System.out.println(str.endsWith( "d" ) );
        System.out.println(str.endsWith( "ld" ) );
        System.out.println(str.endsWith( "rld" ) );
        System.out.println(str.endsWith( "orl" ) );
    }
}
