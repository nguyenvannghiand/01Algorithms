import java.util.Scanner;

public class CodeLearAlgorithms_3 {

    public static void printResult() {
        int n;
        int[] arr = new int[101];
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        String result = "";
        for (int i = 0; i < n; i++) {
            int temp = arr[i];
            arr[i] = temp * temp;
            result += arr[i] + " ";
        }
        for (int item : arr) {
            System.out.printf(result);

        }
    }
    public static void main(String[] args) {
        printResult();
    }
}
