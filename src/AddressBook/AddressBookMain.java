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

        System.out.println("Enter First Name to edit:");
        String name = sc.nextLine();

        for (Contact c : addressBook) {
            if (c.firstName.equals(name)) {

                System.out.println("Enter New City:");
                c.city = sc.nextLine();

                System.out.println("Enter New Phone Number:");
                c.phoneNumber = sc.nextLine();

                System.out.println("Contact updated successfully");
            }
        }

        for (Contact c : addressBook) {
            c.display();
        }
    }
}
