import java.util.Scanner;

public class CodeLearAlgorithms_4 {

    public static void printResult() {
        int n, k, x;
        int[] arr = new int[101];
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        k = scanner.nextInt();
        x = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int resultArr[] = new int[n + 1];
        String result = "";
        for (int i = 0; i < n+1; i++) {
            if (i <= k - 1) {
                resultArr[i] = arr[i];
            } else if (i == k) {
                resultArr[i] = x;
            } else {
                resultArr[i] = arr[i - 1];
            }
            result += resultArr[i] + " ";
        }
        System.out.printf(result);
    }
    public static void main(String[] args) {
        printResult();
    }
}
