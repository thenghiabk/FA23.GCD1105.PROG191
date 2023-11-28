package L03_Classes_Objects;

public class Argument_Parameter {
    public static void main( String[] args ) {
        int x = 3;
        int y = 4;
        int result = sum( x, y );

        System.out.printf("%d + %d = %d", x, y, result ).println(  );
    }

    public static int sum(int a, int b){
        int result = a + b;
        return result;
    }
}
