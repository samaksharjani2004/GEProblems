package AddressBook;

import java.util.ArrayList;

public class AddressBookMain {

    static ArrayList<Contact> addressBook = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println("Welcome to Address Book Program");

        addressBook.add(new Contact(
                "Sam", "Arjani", "MG Road",
                "Bangalore", "KA", "560001",
                "9999999999", "sam@gmail.com"
        ));

        addressBook.add(new Contact(
                "Amit", "Shah", "Park Street",
                "Mumbai", "MH", "400001",
                "8888888888", "amit@gmail.com"
        ));

        addressBook.add(new Contact(
                "Neha", "Singh", "Sector 18",
                "Noida", "UP", "201301",
                "7777777777", "neha@gmail.com"
        ));

        for (Contact c : addressBook) {
            c.display();
        }
    }
}
