import java.util.Scanner;
import java.util.Stack;

public class CodeLearAlgorithms_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            stack.push(c);
        }
        for (int i = stack.size(); i >0 ; i--) {
            System.out.print(stack.pop());
        }
    }
}
