package L02_Loops_Arrays;

public class IntegerOverflow {
    public static void main( String[] args ) {
        int a = 2_000_000_000;
        int b = 2_000_000_000;
        int c = a + b;

        System.out.println(c );
    }
}
