package SOLID_AddBook;

public class AddressBookMemory implements AddressBookRepository{
    @Override
    public void save(AddressBook addressBook) {
        System.out.println("Addbook");
    }
}
