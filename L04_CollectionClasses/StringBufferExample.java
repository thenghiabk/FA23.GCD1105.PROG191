package L04_CollectionClasses;

public class StringBufferExample {
    public static void main( String[] args ) {
        StringBuffer word = new StringBuffer( "Java" );
        System.out.println("original hashcode: " + word.hashCode() );

        word.setCharAt( 0,'D' );
        word.setCharAt( 1,'i' );

        System.out.println("modified hashcode: " + word.hashCode() );

    }
}
