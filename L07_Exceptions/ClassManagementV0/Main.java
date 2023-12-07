package LiveCode.ClassManagementV0;

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

    static void removeStudent( ArrayList<Student> arrayList, String name, int age ) {
        for ( int i = 0; i < arrayList.size( ); i++ ) {
            Student student = arrayList.get( i );

            if ( student.getName( ).equals( name ) && student.getAge( ) == age ) {
                arrayList.remove( i );
                break;
            }
        }
    }

    static void removeStudentObject( ArrayList<Student> arrayList, Student studentToRemove ) {
        for ( int i = 0; i < arrayList.size( ); i++ ) {
            Student student = arrayList.get( i );

            if ( student.getName( ).equals( studentToRemove.getName( ) ) && student.getAge( ) == studentToRemove.getAge( ) ) {
                arrayList.remove( i );
                break;
            }
        }
    }

    static void printAllStudents( ArrayList<Student> arrayList ) {
        for ( Student student : arrayList ) {
            System.out.println( "Name: " + student.getName( ) + ", age: " + student.getAge( ) );
        }
    }

    public static void main( String[] args ) {
        ArrayList<Student> studentArrayList = new ArrayList<>( );
        Student student1 = new Student( "John", 22 );
        Student student2 = new Student( "David", 18 );

        studentArrayList.add( student1 );
        studentArrayList.add( student2 );
        studentArrayList.add( new Student( "Lucy", 17 ) );
        studentArrayList.add( new Student( "David", 9 ) );

        removeStudent( studentArrayList, "David", 9 );
        Student studentToRemove = new Student( "Lucy", 17 );
        removeStudentObject( studentArrayList, studentToRemove );
        printAllStudents( studentArrayList );

    }
}
