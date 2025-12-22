package SOLID_AddBook;

public class PersonContact extends Contact{
    private String phoneNumber;


    public PersonContact(String name, String phoneNumber) {
        super(name);
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return super.toString()+"  PersonContact{" +
                "phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
