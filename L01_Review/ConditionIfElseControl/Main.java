package L01_Review.ConditionIfElseControl;

public class Main {
    public static void main( String[] args ) {
        int x = 1;
        int y = 2;
        int z = 3;

        if (x < y)
            if (x < z)
                System.out.println( "Hello" );
            else
                System.out.println("Good bye" );
    }
}
