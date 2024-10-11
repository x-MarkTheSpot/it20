/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic_3_stack;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack stack = new Stack(5); // Create a stack of size 5

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Push an element");
            System.out.println("2. Pop an element");
            System.out.println("3. Peek at the top element");
            System.out.println("4. Show stack size");
            System.out.println("5. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number to push: ");
                    int value = scanner.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    System.out.println("Popped element: " + stack.pop());
                    break;
                case 3:
                    System.out.println("Top element is: " + stack.peek());
                    break;
                case 4:
                    System.out.println("Stack size is: " + stack.size());
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return; // Exit the program
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println(); 
        }
    }
}