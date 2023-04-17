// Implement the Fibonacci Series using recursion with for loop in java
public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; // number of terms to print
        System.out.println("Fibonacci series of " + n + " terms:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
