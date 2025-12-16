package AddressBook;

import java.util.*;

public class AddressBookMain {

    static Scanner sc = new Scanner(System.in);

    // UC-6: Dictionary of AddressBookName → List of Contacts
    static Map<String, ArrayList<Contact>> addressBookSystem = new HashMap<>();

    public static void main(String[] args) {

        System.out.println("Welcome to Address Book Program");

        boolean exit = false;

        while (!exit) {
            System.out.println("\n1. Add Address Book");
            System.out.println("2. Add Contact");
            System.out.println("3. Display Address Book");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    createAddressBook();
                    break;

                case 2:
                    addContactToAddressBook();
                    break;

                case 3:
                    displayAddressBook();
                    break;

                case 4:
                    exit = true;
                    System.out.println("Exiting Address Book Program");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    // UC-6: Create Address Book
    static void createAddressBook() {
        System.out.print("Enter Address Book Name: ");
        String name = sc.nextLine();

        if (addressBookSystem.containsKey(name)) {
            System.out.println("Address Book already exists!");
        } else {
            addressBookSystem.put(name, new ArrayList<>());
            System.out.println("Address Book '" + name + "' created.");
        }
    }

    // UC-1 extended for UC-6
    static void addContactToAddressBook() {
        System.out.print("Enter Address Book Name: ");
        String bookName = sc.nextLine();

        if (!addressBookSystem.containsKey(bookName)) {
            System.out.println("Address Book does not exist!");
            return;
        }

        System.out.print("Enter First Name: ");
        String firstName = sc.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = sc.nextLine();

        System.out.print("Enter Address: ");
        String address = sc.nextLine();

        System.out.print("Enter City: ");
        String city = sc.nextLine();

        System.out.print("Enter State: ");
        String state = sc.nextLine();

        System.out.print("Enter Zip: ");
        String zip = sc.nextLine();

        System.out.print("Enter Phone Number: ");
        String phone = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        Contact contact = new Contact(firstName, lastName, address,
                city, state, zip, phone, email);

        addressBookSystem.get(bookName).add(contact);

        System.out.println("Contact added to Address Book: " + bookName);
    }

    // Display contacts
    static void displayAddressBook() {
        System.out.print("Enter Address Book Name: ");
        String bookName = sc.nextLine();

        if (!addressBookSystem.containsKey(bookName)) {
            System.out.println("Address Book does not exist!");
            return;
        }

        System.out.println("\nContacts in Address Book: " + bookName);

        ArrayList<Contact> contacts = addressBookSystem.get(bookName);

        if (contacts.isEmpty()) {
            System.out.println("No contacts found.");
        } else {
            for (Contact c : contacts) {
                System.out.println(c);
            }
        }
    }
}
