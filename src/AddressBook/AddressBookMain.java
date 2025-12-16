package AddressBook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {

    static ArrayList<Contact> addressBook = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Welcome to Address Book Program");

        addContact();
        displayContacts();
    }

    // UC-1
    public static void addContact() {

        System.out.println("Enter First Name:");
        String firstName = scanner.nextLine();

        System.out.println("Enter Last Name:");
        String lastName = scanner.nextLine();

        System.out.println("Enter Address:");
        String address = scanner.nextLine();

        System.out.println("Enter City:");
        String city = scanner.nextLine();

        System.out.println("Enter State:");
        String state = scanner.nextLine();

        System.out.println("Enter Zip:");
        String zip = scanner.nextLine();

        System.out.println("Enter Phone Number:");
        String phone = scanner.nextLine();

        System.out.println("Enter Email:");
        String email = scanner.nextLine();

        Contact contact = new Contact(firstName, lastName, address,
                city, state, zip, phone, email);

        addressBook.add(contact);
        System.out.println("Contact added successfully");
    }

    public static void displayContacts() {
        for (Contact contact : addressBook) {
            contact.displayContact();
        }
    }
}
