import java.util.Scanner;

public class CodeLearAlgorithms_4a {

    public static void main(String[] args) {
        int n;
        int a[] = new int[101];

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int x = sc.nextInt();
        for (int i = n; i >= k+1; i--){
            a[i] = a[i-1];
        }
        a[k] = x;
        n++;
        for (int i = 0; i < n; i++){
            System.out.print(a[i]+ " ");
        }
    }
}
