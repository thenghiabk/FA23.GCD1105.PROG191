package L03_Classes_Objects.CallByReference;

public class Main {
    public static void main( String[] args ) {
        Student student;

        LibraryCard card1, card2;

        student = new Student( );
        student.setName( "Jon Java" );
        student.setEmail( "jj@javauniv.edu" );

        card1 = new LibraryCard();
        card1.setOwner( student );
        card1.checkOut();

        card2 = new LibraryCard();
        card2.setOwner( student );
        card2.checkOut();

    }
}
