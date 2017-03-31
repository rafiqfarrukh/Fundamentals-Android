package com.company.week_08;
import java.util.*;
class Contact{
    private String name;
    private String email;

    public Contact(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public boolean equals(Object obj){
        if (!(obj instanceof Contact)){
            return false;

        }
        Contact otherContact = (Contact) obj;
        return this.name.equals(otherContact.getName())
                && this.email.equals(otherContact.getEmail());

    }
    public void display(){
        System.out.println("Name:" +name);
        System.out.println("Email:" +email);
    }

}
class BusinessContact extends Contact{
    private String phoneNumber;

    public BusinessContact(String name, String email, String phoneNumber){
        super(name, email);
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void display(){
        super.display();
        System.out.println("phone:" + phoneNumber);
    }
}
class AddresBook{
    private  List<Contact> contactList = new ArrayList<>();
    public void add(Contact aContact){
        contactList.add(aContact);
    }
    public void display(){
        for (Contact aContact: contactList){
            aContact.display();
        }
    }
}

public class Main {

    public static void main(String[] args){
        AddresBook myContacts = new AddresBook();
        Contact bob = new Contact("Bob", "bob@bob.com");
        myContacts.add(bob);
        BusinessContact sue= new BusinessContact("Sue", "sue@sue.com","123-456-7890");
        myContacts.add(sue);
        myContacts.display();
    }
}


