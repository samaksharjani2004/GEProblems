package SOLID_AddBook;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {

    private List<Contact> contacts = new ArrayList<>();

    public void addContact(Contact c){
        contacts.add(c);
    }

    public void deleteContact(String phoneNumber){
        for (Contact c : contacts){
            PersonContact c1 =  (PersonContact) c;
            if(c1.getPhoneNumber().equals(phoneNumber)){
                contacts.remove(c);
            }else {
                System.out.println("Contact not found");
            }

        }
    }

    public List<Contact> getContacts() {
        return contacts;
    }


}
