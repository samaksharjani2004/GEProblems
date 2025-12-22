package SOLID_AddBook;

public class Main {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();

        Contact c1 = new PersonContact("Arpit","1234");
        Contact c2 = new PersonContact("Sahu", "1234455");

        addressBook.addContact(c1);
        addressBook.addContact(c2);

        AddressBookRepository repository = new AddressBookSQL();

        AddressBookService service = new AddressBookService(repository);

        service.save(addressBook);

        System.out.println(addressBook.getContacts());

    }
}
