package topic_4_queue;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Queue customerQueue = new Queue();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a customer name to add to the queue (only string characters cuz my knowledge is limited:");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("exit")) {
                break;
            }
            customerQueue.enqueue(new Customer(name));
            customerQueue.displayQueue();
        }

        // Serve customers
        while (!customerQueue.isEmpty()) {
            System.out.println("Serving the next customer...");
            customerQueue.dequeue();
            customerQueue.displayQueue();
        }

        scanner.close();
    }
}