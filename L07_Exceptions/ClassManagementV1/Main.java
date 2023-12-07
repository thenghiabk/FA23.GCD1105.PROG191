package LiveCode.ClassManagementV1;

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

class ClassManagement {
    private ArrayList<Student> studentArrayList = new ArrayList<>( );

    public void addStudent( Student student ) {
        studentArrayList.add( student );
    }

    public void printAllStudents( ) {
        for ( Student student : studentArrayList ) {
            System.out.println( "Name: " + student.getName( ) + ", age: " + student.getAge( ) );
        }
    }

    public void removeStudent( String name, int age ) {
        for ( int i = 0; i < studentArrayList.size( ); i++ ) {
            Student student = studentArrayList.get( i );

            if ( student.getName( ).equals( name ) && student.getAge( ) == age ) {
                studentArrayList.remove( i );
                break;
            }
        }
    }

    public void removeStudentObject( Student studentToRemove ) {
        for ( int i = 0; i < studentArrayList.size( ); i++ ) {
            Student student = studentArrayList.get( i );

            if ( student.getName( ).equals( studentToRemove.getName( ) ) && student.getAge( ) == studentToRemove.getAge( ) ) {
                studentArrayList.remove( i );
                break;
            }
        }
    }

}


public class Main {

    public static void main( String[] args ) {

        ClassManagement myClass = new ClassManagement( );

        myClass.addStudent( new Student( "John", 22 ) );
        myClass.addStudent( new Student( "David", 18 ) );
        myClass.addStudent( new Student( "Lucy", 17 ) );
        myClass.addStudent( new Student( "David", 9 ) );

        myClass.removeStudent( "Lucy", 17 );
        myClass.removeStudentObject( new Student( "David", 9 ) );

        myClass.printAllStudents( );

    }
}
