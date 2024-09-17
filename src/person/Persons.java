package person;

public class Persons {
    private String name;
    private String address;
    private String phoneNumber;
    private String emailAddress;
    private boolean isPersonExisting = false;
    public Persons(String name, String address, String phoneNumber, String emailAddress) {
        setName(name);
        setAddress(address);
        setPhoneNumber(phoneNumber);
        setEmailAddress(emailAddress);
        isPersonExisting = true;
    }
    public void setName(String name) {
        this.name = name.replaceAll("[^a-zA-Z\\s]", "");
    }
    public String getName(){
        return name;
    }
    public void setAddress(String address) {
        this.address = address.replaceAll("[\\p{Punct}&&[^,()-]]", "");
    }
    public String getAddress(){
        return address;
    }
    public void setPhoneNumber(String phoneNumber) {
        if(phoneNumber.length()!=11) this.phoneNumber = "Invalid Phone Number";
        else this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress.replaceAll("[\\p{Punct}&&[^@.]]", "");
    }
    public String getEmailAddress(){
        return emailAddress;
    }
    public boolean isExisting(){
        return isPersonExisting;
    }
}
