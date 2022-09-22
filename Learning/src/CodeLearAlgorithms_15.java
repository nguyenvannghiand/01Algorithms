import java.util.Scanner;
import java.util.Stack;

public class CodeLearAlgorithms_15 {
    public static String endcodeString(String input) {
        Stack<Character> stack = new Stack<>();
        String result = "";
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (i == 0) {
                stack.push(input.charAt(0));
                count = 1;
            } else {
                if (stack.peek() != input.charAt(i)) {
                    result += stack.peek() + Integer.toString(count);
                    stack.push(input.charAt(i));
                    count = 1;
                } else {
                    count++;
                }
            }
            if (i == input.length() - 1) {
                result += stack.peek() + Integer.toString(count);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(endcodeString(input));
    }
}
