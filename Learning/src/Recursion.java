public class Recursion {
    private static void printF(int value) {
        System.out.println("Giai thua n = " + value);
    }

    // Tinh n! return n!
    private static int factorial(int n) {
        if (n < 0) return -1;
        if (n == 0) return 1;
        int t = n * factorial(n - 1);
        return t;
    }

    public static void main(String[] args) {
        int value = factorial(5);
        printF( value);
    }

}
