package L02_Loops_Arrays;

public class GCDFinding {

    public static void main ( String[] args ) {
        System.out.println("Finding GCD");
        int firstNumb = 55;
        int secondNumb = 121;

        // int gcdResult = gcd_bruteforce(firstNumb, secondNumb); // direct approach

        int gcdResult =  gcd(firstNumb, secondNumb); // more efficient approach

        System.out.printf("GCD (%d,%d) = %d", firstNumb, secondNumb, gcdResult).println();
    }

    // direct approach
    public static int gcd_bruteforce ( int m, int n ) {
        // assume m, n >= 1
        int last = Math.min(m, n);

        int gcd = 1; // default GCD
        int i = 1;

        while (i <= last) {
            if (m % i == 0 && n % i == 0) { // <--
                gcd = i;
            }

            i++;
        }

        return gcd;
    }

    // more efficient approach
    public static int gcd ( int m, int n ) {
        // it doesn't matter which of n and m is bigger
        // this method will work fine either way

        // assume m, n >= 1

        int r = n % m; // calculate remainder
        while (r != 0) {
            n = m;
            m = r;
            r = n % m;
        }

        return m;
    }


}
