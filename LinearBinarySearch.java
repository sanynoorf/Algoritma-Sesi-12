import java.util.Arrays;

public class App {
    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 28, 33, 36, 55};
        int key = 33;
        long startTime = System.nanoTime();
        System.out.println("Unsorted Array: " + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        System.out.println("Binary Search: " + binarySearch(arr, key));
        System.out.println("Linear Search: " + linearSearch(arr, key));
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("Execution Time: " + duration + " nanoseconds");
    }
}