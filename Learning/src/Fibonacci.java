public class Fibonacci {

    private static void printF(int value) {
        System.out.println("Fibonacci n = " + value);
    }

    //2 Khu de quy neu co the giai bai toan
    private static void fibonacci3(int n) {
        int[] fibo = new int[n + 1];
        //1 Bai toan co so
        fibo[1] = 1;
        fibo[2] = 1;
        for (int i = 3; i <= n; i++) {
            // Cong thu quy nap
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
        System.out.println(fibo[n]);
    }

    // De toi uu dung de quy co nho
    static int[] f = new int[1000];

    private static int fibonacci2(int n) {
        if (f[n] != 0) return f[n];
        System.out.println("Tinh: F[" + n + "]");
        if (n <= 2) {
            f[1] = 1;
            f[2] = 1;
            return 1;
        }

        f[n] = fibonacci2(n - 1) + fibonacci2(n - 2);
        return f[n];

    }

    private static int fibonacci(int n) {
        //1. Bai toan co so
        if (n <= 2) return 1;
        int fn = fibonacci(n - 1) + fibonacci(n - 2);
        return fn;
    }

    // in mang so nguyen tu 1->n
    private static void printElement(int[] arr, int index) {
        //1. Bai toan co so
        if (index < 0 || index >= arr.length) return;
        //2. Cong thuc quy nap
        System.out.println(arr[index]);
        printElement(arr, index + 1);
    }

    public static void main(String[] args) {
        int result = fibonacci(5);
        printF(result);
        //
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        printElement(arr, 0);
        //
        System.out.println("Day fibonacci khi toi uu: ");
        System.out.println(fibonacci2(10));

        System.out.println("Day fibonacci dung khu de quy: ");
        fibonacci3(10);
    }
}
