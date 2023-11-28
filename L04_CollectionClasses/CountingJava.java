package L04_CollectionClasses;

import java.util.Scanner;

public class CountingJava {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner( System.in );
        int javaCount = 0;
        boolean repeat = true;
        String word;

        while ( repeat ) {
            System.out.print( "Next word: " );
            word = scanner.next( );

            if ( word.equals( "STOP" ) ) { // STOp != STOP
                repeat = false;
            } else if ( word.equalsIgnoreCase( "java" ) ) { // JAVA, Java, jAVA -> java
                javaCount++;
            }
        }
        System.out.println("You have entered the word \"java\": " + javaCount + " time(s)." );
    }
}
