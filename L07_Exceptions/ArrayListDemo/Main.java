package LiveCode.ArrayListDemo;

import java.util.ArrayList;

class Student {
    private String name;
    private int age;
    public Student( String name, int age ) {
        this.name = name;
        this.age = age;
    }
    public String getName( ) {
        return name;
    }
    public int getAge( ) {
        return age;
    }
    @Override
    public String toString( ) {
        return "Name: " + name + ", age: " + age;
    }
}

public class Main {
    public static void main( String[] args ) {
        /*
            String ArrayList
         */
        ArrayList<String> stringArrayList = new ArrayList<>( );

        stringArrayList.add( "hello" );
        stringArrayList.add( "goodbye" );
        stringArrayList.add( "John" ); // John Doe
        stringArrayList.add( 1, "world" );
        stringArrayList.add( "Marry" );

        System.out.println( stringArrayList );

        System.out.println( stringArrayList.indexOf( "John" ) );

        System.out.println( stringArrayList.remove( "john" ) );

        System.out.println( stringArrayList );

        /*
            Integer ArrayList
         */

        ArrayList<Integer> intArrayList = new ArrayList<>( );

        intArrayList.add( 10 );
        intArrayList.add( 20 );
        intArrayList.add( 30 );

        System.out.println( intArrayList );

        intArrayList.add( 2, 50 );

        System.out.println( intArrayList );

        intArrayList.remove( 1 );

        System.out.println( intArrayList );

        intArrayList.set( 1, 40 );

        System.out.println( intArrayList );

        boolean result = intArrayList.contains( 50 );
        System.out.println( result );

        intArrayList.add( 60 );
        intArrayList.add( 40 );
        intArrayList.add( 70 );

        System.out.println( intArrayList );

        System.out.println( intArrayList.indexOf( 60 ) );
        System.out.println( intArrayList.indexOf( 40 ) );

        System.out.println( intArrayList.get( 2 ) );

    }
}
