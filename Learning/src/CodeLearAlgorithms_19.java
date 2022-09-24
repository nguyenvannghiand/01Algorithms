import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Vector;

public class CodeLearAlgorithms_19 {

    public static boolean checkDuplicate(Vector<Integer> vector, int temp) {
        return !vector.contains(temp);
    }

    public static Queue<Integer> solution(Vector<Integer> vector, int n) {
        Queue<Integer> mySolution = new LinkedList<>(vector);

        while (mySolution.size() > n) {
            mySolution.remove();
        }
        return mySolution;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        Vector<Integer> vector = new Vector<>();
        for (int i = 0; i < k; i++) {
            int temp = scanner.nextInt();
            if (checkDuplicate(vector, temp)) {
                vector.add(temp);
            }
        }

        int n = scanner.nextInt();
        Queue<Integer> myQueue = solution(vector, n);
        int size = myQueue.size();
        for (int i = 0; i < size; i++) {
            System.out.print(myQueue.remove() + " ");
        }

    }
}
