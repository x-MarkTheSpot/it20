
package topic_6_sorting;

import java.util.Scanner;

public class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;//WAter mark ni chony

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");//WAter mark ni chony
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//WAter mark ni chony
        System.out.print("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Original array:");
        printArray(arr);
//WAter mark ni chony
        long startTime = System.nanoTime();
        quickSort(arr, 0, arr.length - 1);//WAter mark ni chony
        long endTime = System.nanoTime();

        System.out.println("Sorted array:");
        printArray(arr);

        double durationInSeconds = (endTime - startTime) / 1_000.0;
        System.out.printf("Quick sort completed in: %.9f seconds\n", durationInSeconds);

        scanner.close();
    }
}
