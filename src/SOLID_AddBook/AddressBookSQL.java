package SOLID_AddBook;

public class AddressBookSQL implements AddressBookRepository{
    @Override
    public void save(AddressBook addressBook) {
        System.out.println("SQL Connected");
    }
}