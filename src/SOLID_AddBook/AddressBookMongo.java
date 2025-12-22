package SOLID_AddBook;

public class AddressBookMongo implements  AddressBookRepository{
    @Override
    public void save(AddressBook addressBook) {
        System.out.println("Mongo Connected");
    }
}
