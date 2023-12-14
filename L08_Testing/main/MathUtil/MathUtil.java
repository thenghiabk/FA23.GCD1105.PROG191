package L09_Testing.MathUtil;

public class MathUtil {
    // Returns the maximum of two numbers
    public int max(int a, int b) {
        return Math.max(a, b);
    }

    // Returns the minimum of two numbers
    public int min(int a, int b) {
        return Math.min(a, b);
    }

    // Returns the square of a number
    public int square(int a) {
        return a * a;
    }

    // Returns the factorial of a number
    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Returns true if a number is prime, false otherwise
    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Returns the sum of two numbers
    public int sum(int a, int b) {
        return a + b;
    }

    // Returns the difference between two numbers
    public int subtract(int a, int b) {
        return a - b;
    }

    // Returns the division of two numbers
    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return a / b;
    }

    // Returns the product of two numbers
    public int multiply(int a, int b) {
        return a * b;
    }
}