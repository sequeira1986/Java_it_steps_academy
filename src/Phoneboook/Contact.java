package Phoneboook;

public class Contact {
    String name, Lastname, phone, email;

    public Contact(String name, String lastname, String phone, String email) {
        this.name = name;
        Lastname = lastname;
        this.phone = phone;
        this.email = email;

    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastname() {
        return Lastname;
    }
    public void setLastname(String lastname) {
        Lastname = lastname;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
