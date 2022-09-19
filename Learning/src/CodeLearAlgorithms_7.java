import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class CodeLearAlgorithms_7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Integer[] a=new Integer[n];
        for(int i=0;i<n;i++) {
            a[i]=sc.nextInt();
        }
        List<Integer> list=Arrays.asList(a);
        Collections.sort(list, Integer::compareTo);
        Supplier<Stream<Integer>> supplier = list::stream;
        supplier.get().distinct().forEach(t -> System.out.print(t + " - " + supplier.get().filter(p -> p == t).count() + "; "));
    }
}
