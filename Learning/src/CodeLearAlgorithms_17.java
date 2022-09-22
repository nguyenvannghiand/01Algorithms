import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CodeLearAlgorithms_17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Queue<Integer> myQueue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            myQueue.add(scanner.nextInt());
        }
        int k = scanner.nextInt();
        for (int i = 0; i < k; i++) {
            if (!myQueue.isEmpty()) {
                //get phan tu dau tien
                int value = myQueue.peek();
                // remove phan tu dau tien
                myQueue.poll();
                // add phan tu dau tien dc lay ra vao lai cuoi queue
                myQueue.add(value);
            }
        }
        while (myQueue.size() > 0) {
            System.out.print(myQueue.poll() + " ");
        }
    }
}
