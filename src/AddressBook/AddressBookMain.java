package AddressBook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {

    static ArrayList<Contact> addressBook = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println("Welcome to Address Book Program");

        Scanner sc = new Scanner(System.in);

        addressBook.add(new Contact(
                "Sam", "Arjani", "MG Road",
                "Bangalore", "KA", "560001",
                "9999999999", "sam@gmail.com"
        ));

        System.out.println("Enter First Name to delete:");
        String name = sc.nextLine();

        Contact deleteContact = null;

        for (Contact c : addressBook) {
            if (c.firstName.equals(name)) {
                deleteContact = c;
            }
        }

        if (deleteContact != null) {
            addressBook.remove(deleteContact);
            System.out.println("Contact deleted successfully");
        } else {
            System.out.println("Contact not found");
        }

        for (Contact c : addressBook) {
            c.display();
        }
    }
}
