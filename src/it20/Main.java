package it20;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ItemManager list = new ItemManager();

        // Initial items
        list.insertItem("IT20");
        list.insertItem("Data Structures and Algorithms");

        // Display initial items
        list.displayItems();

        Scanner kurasoy = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("1. Insert Item");
            System.out.println("2. Update Item");
            System.out.println("3. Delete Item");
            System.out.println("4. Display Items");
            System.out.println("5. Find Item");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = kurasoy.nextInt();
            kurasoy.nextLine(); // Consume newline character

            if (choice == 1) {
                // Insert Item
                System.out.print("Enter the item to insert: ");
                String newItem = kurasoy.nextLine();
                list.insertItem(newItem);
            } else if (choice == 2) {
                // Update Item
                System.out.print("Enter the index of the item to update: ");
                int updateIndex = kurasoy.nextInt();
                kurasoy.nextLine(); // Consume newline character
                System.out.print("Enter the new item: ");
                String updatedItem = kurasoy.nextLine();
                list.updateItem(updateIndex, updatedItem);
            } else if (choice == 3) {
                // Delete Item
                System.out.print("Enter the index of the item to delete: ");
                int deleteIndex = kurasoy.nextInt();
                list.deleteItem(deleteIndex);
            } else if (choice == 4) {
                // Display Items
                list.displayItems();
            } else if (choice == 5) {
                // Find Item
                System.out.print("Enter the item to find: ");
                String findItem = kurasoy.nextLine();
                list.findItem(findItem);
            } else if (choice == 6) {
                // Exit
                exit = true;
                System.out.println("Exiting the program.");
            } else {
                System.out.println("Invalid option. Please choose again.");
            }
        }

        kurasoy.close();
    }
}
