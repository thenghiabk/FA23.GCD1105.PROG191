package L04_CollectionClasses.StringOperators;

public class substring {
    public static void main( String[] args ) {

        // Returns a new string which is the substring of a specified string

        String str = "hello world!";
        String subStr = str.substring( 1, 4 );

        System.out.println( str );
        System.out.println( subStr );

    }
}
