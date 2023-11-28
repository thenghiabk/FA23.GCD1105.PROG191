package L04_CollectionClasses;

import java.util.Scanner;

public class CountingVowels {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner( System.in );
        char letter;
        System.out.print( "Your name: " );
        String name = scanner.next( );
        int numberOfCharacters = name.length( );
        int vowelCount = 0;

        for ( int i = 0; i < numberOfCharacters; i++ ) {
            letter = name.charAt( i );
            if ( letter == 'a' || letter == 'A' ||
                    letter == 'e' || letter == 'E' ||
                    letter == 'i' || letter == 'I' ||
                    letter == 'o' || letter == 'O' ||
                    letter == 'u' || letter == 'U'
            ) {
                vowelCount++;
            }
        }
        System.out.println( name + ", your name has " + vowelCount + " vowels." );
    }
}
