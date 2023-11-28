package L03_Classes_Objects.CallByValue;

public class Main {
    public static void main( String[] args ) {
        Tester tester;
        int x, y;

        tester = new Tester( );
        x = 10;
        y = 20;
        tester.myMethod( x, y );
        System.out.println(x + " " + y );

    }
}
