// Insertion bai....naa lang mangape ani..diba kita man ang katag

package topic_6_sorting;

import java.util.Scanner;

public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
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

        // kong pila ka strings
        System.out.print("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Original array:");
        printArray(arr);

        // Start timer
        long Timer = System.nanoTime();
        insertionSort(arr);
        long intervalMaybe = System.nanoTime();
        // End timer

        System.out.println("Sorted array:");
        printArray(arr);

        // Calculate and display the runtime in seconds
        double durationInSeconds = (intervalMaybe - Timer) / 1_000.0;
        System.out.printf("Insertion sort completed in: %.9f seconds\n", durationInSeconds);

        scanner.close();
    }
}
