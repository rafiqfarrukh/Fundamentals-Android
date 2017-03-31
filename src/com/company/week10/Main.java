/*package com.company.week10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


class Contact implements Comparable<Contact> {
    String name;
    String email;

    @Override
    public int compareTo(Contact otherContact) {
       if(!this.name.equals()) {
           return this.name.compareTo(otherContact.name);
       }

    }

    Contact(String name, String email) {
        this.name = name;

        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
    public void display() {
        System.out.println("Name: " + name + ", Email:" + email);
    }
}
class ContactCollection implements Iterable<Contact>{
    private List<Contact> contactList = new ArrayList<>();
    public void add(Contact newContact){
        contactList.add(newContact);
    }

    @Override
    public Iterator<Contact> iterator() {
        return contactList.iterator();
    }
}

    public class Main {

    public static void main(String[] arg){
        Contact bob = new Contact("Bob", "bob@bob.com");
        Contact arthur = new Contact("Arthur", "aneuman1@cscc.edu");
        Contact arthur2 = new Contact("Arthur", "aaaa@aa.com");

       // List<Contact> contacts = new ArrayList<>();
        ContactCollection contacts = new ContactCollection();
        contacts.add(bob);
        contacts.add(arthur);

        for(Contact entry: contacts) {
            entry.display();
        }


    }




}*/
