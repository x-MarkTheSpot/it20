package topic_6_sorting;

import java.util.Scanner;

public class BubbleSort {
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

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Original array:");
        printArray(arr);

        long startTime = System.nanoTime();
        bubbleSort(arr);
        long endTime = System.nanoTime();

        System.out.println("Sorted array:");
        printArray(arr);

        long durationInNano = endTime - startTime;
        double durationInSeconds = durationInNano / 1_000.0;   //the timer
        System.out.printf("Bubble sort completed in: %.9f seconds\n", durationInSeconds);

        scanner.close();
    }
}
