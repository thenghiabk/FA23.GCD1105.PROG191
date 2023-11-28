package LiveCode;



public class Recursion {
    public static void main( String[] args ) {
        printNumber(5);
        printNumberRev(5);

        gcd(9876, 22);
    }

    static void gcd(int a, int b){ // recursion
        int x = a % b;
        if (x == 0){
            System.out.println( b );
            return;
        }
        gcd(b, x);
    }

    static void printNumber(int n){
        if(n == 0)
            return;

        System.out.println( n ); // (step 1)
        printNumber(n-1); // (step 2)
    }

    static void printNumberRev(int n){
        if(n == 0)
            return;

        printNumberRev(n-1); // (step 1)
        System.out.println( n ); // (step 2)
    }
}
