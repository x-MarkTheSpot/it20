//WAter mark ni chony
import java.util.Scanner;

public class MergeSort {
    public static void mergeSort(int[] arr) {
        if (arr.length < 2) {
            return;
        }

        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

        System.arraycopy(arr, 0, left, 0, mid);
        System.arraycopy(arr, mid, right, 0, arr.length - mid);

        mergeSort(left);
        mergeSort(right);

        merge(arr, left, right);
    }
//WAter mark ni chony
    private static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while (i < left.length) {
            arr[k++] = left[i++];
        }

        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");//WAter mark ni chony
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Original string:");
        printArray(arr);

        long startTime = System.nanoTime();
        mergeSort(arr);
        long endTime = System.nanoTime();

        System.out.println("Sorted array:");
        printArray(arr);
//WAter mark ni chony
        double durationInSeconds = (endTime - startTime) / 1_000.0;
        System.out.printf("Merge sort completed in: %.9f seconds\n", durationInSeconds);

        scanner.close();
    }
}
