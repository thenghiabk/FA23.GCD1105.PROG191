package L07_Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TryCatch {
    public static void main( String[] args ) {

        // ! FileNotFoundException
        // FileReader reader = new FileReader("file.txt"); // < compilation error

        // SOLUTION
        try {
            FileReader reader = new FileReader( "file.txt" );
            System.out.println( "File opened" );
        } catch ( FileNotFoundException ex ) {
            // System.out.println("File does not exist");
            // System.out.println(ex.getMessage());
            ex.printStackTrace( );
        }
    }
}
