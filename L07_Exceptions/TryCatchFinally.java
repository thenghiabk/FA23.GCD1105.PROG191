package L07_Exceptions;

import java.io.FileReader;
import java.io.IOException;

public class TryCatchFinally {
    public static void main( String[] args ) {

        // ! FileNotFoundException
        // FileReader reader = new FileReader("file.txt"); // < compilation error

        // SOLUTION
        FileReader reader = null;

        try {
            reader = new FileReader( "file.txt" );
            int value = reader.read( );
            System.out.println( "File opened" );
        } catch ( IOException ex ) {
            System.out.println( "File does not exist" );
            // System.out.println(ex.getMessage());
            // ex.printStackTrace();
        } finally {
            if ( reader != null ) {
                try {
                    reader.close( );
                } catch ( IOException e ) {
                    e.printStackTrace( );
                }
            }
        }
    }
}
