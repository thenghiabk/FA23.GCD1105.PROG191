package L03_Classes_Objects.StudentClass;

public class Main {
    public static void main( String[] args ) {
        Student student = new Student( "John", 3, 4, 5 );
        student.showInfo( );
        System.out.println( "Updating..." );
        student.setFinalExamScore( 9.0 );
        student.showInfo();
    }
}
