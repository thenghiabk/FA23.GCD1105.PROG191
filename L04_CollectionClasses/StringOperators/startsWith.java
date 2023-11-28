package L04_CollectionClasses.StringOperators;

public class startsWith {
    public static void main( String[] args ) {
        /**
         * Checks whether a string starts with specified characters
         *
         * Returns:	A boolean value:
         *                          true - if the string starts with the specified character(s)
         *                          false - if the string does not start with the specified character(s)
         */
        String str = "hello world";
        System.out.println(str.startsWith( "h" ) );
        System.out.println(str.startsWith( "he" ) );
        System.out.println(str.startsWith( "hel" ) );
        System.out.println(str.startsWith( "ell" ) );

    }
}
