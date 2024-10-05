import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Scanner for user input
        Scanner wow = new Scanner(System.in);
		
		// LinkedList object
        LinkedList list = new LinkedList();        // Get 5 strings from user
        System.out.println("Enter 5 random strings to add to the list: ");
        String string1 = wow.nextLine();
        String string2 = wow.nextLine();
        String string3 = wow.nextLine();
        String string4 = wow.nextLine();
        String string5 = wow.nextLine();
        // Add strings to LinkedList
        list.add(string1);
        list.add(string2);
        list.add(string3);
        list.add(string4);
        list.add(string5);
        // Print LinkedList
        System.out.println("Current Linked List: ");
        list.printList();
        // Delete a string
        System.out.println("\nEnter the string you want to delete: ");
        String stringToDelete = wow.nextLine();
        list.deleteByValue(stringToDelete); // Remove the string
        System.out.println("Current Linked List after deletion:");
        list.printList();
        // Move/Swap two strings by inputting the index
        System.out.println("\nMoving/Swapping nodes in the list...");
        System.out.println("Enter the first index you want to move/swap: ");
        String stringToSwap1 = wow.nextLine();
        System.out.println("Enter the second index you want to move/swap: ");
        String stringToSwap2 = wow.nextLine();
        list.moveNodePointer(stringToSwap1, stringToSwap2); // Swap strings
        // Print LinkedList after swap
        System.out.println("Current Linked List after swapping:");
        list.printList();
    }
}