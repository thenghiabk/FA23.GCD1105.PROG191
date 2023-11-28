package L04_CollectionClasses.PersonArray;

import java.util.Scanner;

public class Main {
    public static void main( String[] args ) {
        String name;
        int age;
        char gender;

        Scanner scanner = new Scanner( System.in );
        Person[] person = new Person[ 20 ];
        person[ 0 ] = new Person( "John", 20, 'M' );
        person[ 1 ] = new Person( "Linda", 18, 'F' );
        person[ 2 ] = new Person( "Ben", 45, 'M' );
        person[ 3 ] = new Person( "Mai", 16, 'F' );
        person[ 4 ] = new Person( "Lan", 5, 'F' );
        person[ 5 ] = new Person( "Tom", 8, 'M' );

        /*
            Sample 1: Fill the object array
         */

        // for ( int i = 0; i < person.length; i++ ) {
        //     System.out.print( "Enter name: " );
        //     name = scanner.next( );
        //     System.out.print( "Enter age: " );
        //     age = scanner.nextInt( );
        //     System.out.print( "Enter gender: " );
        //     gender = scanner.next( ).charAt( 0 );
        //
        //     person[ i ] = new Person( ); // create a new Person and assign values
        //     person[ i ].setName( name );
        //     person[ i ].setAge( age );
        //     person[ i ].setGender( gender );
        // }

        /*
            Sample 2: Find the youngest and oldest person
         */


        /*
            Approach 1: Delete an object by setting it to null
         */
        // int delIdx = 1;
        // person[ delIdx ] = null;
        // System.out.println( person[ delIdx ] );
        //
        // person[ delIdx ] = new Person( "Tom", 8, 'M' );
        // System.out.println( person[ delIdx ] );

        /*
            Approach 2: Delete an object by shifting
         */
        // int delIdx = 1;
        // int last = 5;
        //
        // person[ delIdx ] = person[ last ];
        // person[last] = null;
        //
        // System.out.println( person[ delIdx ] );

        /*
            Sample 3:
         */
        // int i = 0;
        //
        // while ( person[ i ] != null && !person[ i ].getName( ).equals( "Latte" ) ) {
        //     i++;
        // }
        //
        // if ( person[ i ] == null ) {
        //     // not found = unsuccessful search
        //     System.out.println("Ms. Latte was not in the array");
        // } else {
        //     // found
        //     System.out.println("Found Ms. Latte at position: " + i);
        // }

        /*
            Sample 4: Print all object by for-each
         */

        // for ( Person p : person
        // ) {
        //     if ( p != null ) {
        //         if ( p.getName( ) == "Linda" ) { // this proves that for-each can change attribute of element-33
        //             p.setName( "New Linda" );
        //         }
        //     } else
        //         break;
        // }
        //
        // System.out.println( person[ 1 ] );

    }
}
