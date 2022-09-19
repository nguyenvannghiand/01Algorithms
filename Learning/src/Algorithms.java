public class Algorithms {

    private static void printArray(int position, int[] a) {
        System.out.printf("%d: ", position);
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d ", a[i]);
        }
        System.out.println();
    }
    private static void bubbleSort(int[] array) {
        int n = array.length;
        //
        for (int i = 0; i < n; i++) {
            boolean isSorted = true;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    isSorted = false;
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            printArray(i, array);
            if (isSorted) {
                break;
            }
        }
    }

    private static void insertionSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            // Chen a[i] vao day 0 -> i-1
            int ai = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > ai) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = ai;
            //
            printArray(i, a);
        }
    }

    private static void selectionSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            printArray(i, a);
        }
    }

    public static void main(String[] args) {
        //1. SortingAlgorithm
        int[] arrayA = {5, 3, 2, 7, 8, 1, 2};
        int[] arrayB = {1, 2, 2, 3, 5, 7, 6};
        //bubbleSort(arrayA);
        System.out.println("Sap xep array B voi bien isSorted");
        bubbleSort(arrayB);
        System.out.println("Sap xep array A voi insertionSort");
        //insertionSort(arrayA);
        System.out.println("Sap xep array A voi selectionSort");
        selectionSort(arrayA);
    }
}