package SOLID_AddBook;

public class AddressBookService {
    private AddressBookRepository repository;
    public AddressBookService(AddressBookRepository repository){
        this.repository = repository;
    }

    public void save(AddressBook addressBook){
        repository.save(addressBook);
    }
}