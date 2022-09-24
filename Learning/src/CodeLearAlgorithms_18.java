import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CodeLearAlgorithms_18 {

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(n) ; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Queue<Integer> myQueue = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            if (isPrime(i)) {
                myQueue.add(i);
            }
        }
        while (!myQueue.isEmpty()) {
            int a = myQueue.poll();
            System.out.print(a + " ");
            for (int i = 0; i < 10; i++) {
                int b = a * 10 + i;
                if (isPrime(b) && b <= n) {
                    myQueue.add(b);
                }
            }
        }

    }
}
