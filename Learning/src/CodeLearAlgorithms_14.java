import java.util.Scanner;
import java.util.Stack;

public class CodeLearAlgorithms_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Stack<Integer> stack = new Stack<>();
        while (n > 0) {
            stack.push(n % 2);
            n /= 2;
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
