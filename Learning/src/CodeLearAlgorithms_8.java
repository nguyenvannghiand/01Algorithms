import java.util.Scanner;

public class CodeLearAlgorithms_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] a = new int[101];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        boolean check1 = true; // kiem tra day tang
        boolean check2 = true; // kiem tra day giam
        for (int i = 0; i < n-1; i++) {
            if (a[i] >= a[i + 1]) check1 = false;
            if (a[i] <= a[i + 1]) check2 = false;
        }
        boolean isTrue = check1 || check2;
        if (isTrue) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
