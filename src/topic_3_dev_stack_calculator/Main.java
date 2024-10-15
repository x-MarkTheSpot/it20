package topic_3_dev_stack_calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack stack = new Stack(5); // Create a stack of size 5

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Push an element (0-9)");
            System.out.println("2. Perform Addition (+)");
            System.out.println("3. Perform Subtraction (-)");
            System.out.println("4. Perform Multiplication (*)");
            System.out.println("5. Perform Division (/)");
            System.out.println("6. Peek at the top element");
            System.out.println("7. Show stack size");
            System.out.println("8. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: // Push an element
                    System.out.print("Enter a number between 0 and 9: ");
                    int value = scanner.nextInt();
                    if (value >= 0 && value <= 9) {
                        stack.push(value);
                    } else {
                        System.out.println("Invalid input. Please enter a number between 0 and 9.");
                    }
                    break;

                case 2: // Perform Addition
                    performOperation(stack, '+');
                    break;

                case 3: // Perform Subtraction
                    performOperation(stack, '-');
                    break;

                case 4: // Perform Multiplication
                    performOperation(stack, '*');
                    break;

                case 5: // Perform Division
                    performOperation(stack, '/');
                    break;

                case 6: // Peek at the top element
                    System.out.println("Top element is: " + stack.peek());
                    break;

                case 7: // Show stack size
                    System.out.println("Stack size is: " + stack.size());
                    break;

                case 8: // Exit
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println();
        }
    }

    private static void performOperation(Stack stack, char operator) {
        if (stack.size() < 2) {
            System.out.println("Not enough elements in the stack to perform this operation.");
            return;
        }

        int num2 = stack.pop(); // Pop the top two elements
        int num1 = stack.pop();
        int result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    stack.push(num1); // Push the elements back since the operation failed
                    stack.push(num2);
                    return;
                }
                result = num1 / num2;
                break;
        }

        System.out.println("Result of " + num1 + " " + operator + " " + num2 + " = " + result);
        stack.push(result); // Push the result back to the stack
    }
}