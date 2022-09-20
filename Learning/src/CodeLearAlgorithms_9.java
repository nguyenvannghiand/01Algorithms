import java.util.Arrays;
import java.util.Scanner;

public class CodeLearAlgorithms_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] a = new int[101];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int m =sc.nextInt();
        int[] b = new int[101];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        int k = n + m;
        int[] c = new int[k];
        for (int i = 0; i < n; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < m; i++) {
            c[i + n] = b[i];
        }
        Arrays.sort(c);
        for (int i = 0; i < k; i++) {
            System.out.print(c[i] + " ");
        }
    }
}
