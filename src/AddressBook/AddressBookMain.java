package AddressBook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookMain {

    // UC-6: Dictionary of Address Books
    static Map<String, ArrayList<Contact>> addressBookSystem = new HashMap<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Welcome to Address Book Program");

        System.out.println("Enter Address Book Name:");
        String addressBookName = sc.nextLine();

        // Create new Address Book
        addressBookSystem.put(addressBookName, new ArrayList<>());

        System.out.println("Address Book '" + addressBookName + "' created.");

        addContact(addressBookName);
        displayAddressBook(addressBookName);
    }

    // Add Contact to a specific Address Book
    public static void addContact(String addressBookName) {

        System.out.println("Enter First Name:");
        String firstName = sc.nextLine();

        System.out.println("Enter Last Name:");
        String lastName = sc.nextLine();

        System.out.println("Enter Address:");
        String address = sc.nextLine();

        System.out.println("Enter City:");
        String city = sc.nextLine();

        System.out.println("Enter State:");
        String state = sc.nextLine();

        System.out.println("Enter Zip:");
        String zip = sc.nextLine();

        System.out.println("Enter Phone Number:");
        String phone = sc.nextLine();

        System.out.println("Enter Email:");
        String email = sc.nextLine();

        Contact contact = new Contact(firstName, lastName, address,
                city, state, zip, phone, email);

        addressBookSystem.get(addressBookName).add(contact);

        System.out.println("Contact added to Address Book: " + addressBookName);
    }

    // Display contacts of a specific Address Book
    public static void displayAddressBook(String addressBookName) {

        System.out.println("\nContacts in Address Book: " + addressBookName);

        for (Contact c : addressBookSystem.get(addressBookName)) {
            c.display();
        }
    }
}
