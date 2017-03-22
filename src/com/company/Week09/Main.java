package com.company.Week09;

/**
 * Created by frafiq on 3/21/2017.
 */

/* abstract class Animal{
    public String name;
    public int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    abstract  public void speak();
}
abstract class FlyingAnimal extends Animal{
    abstract
}

class Dog extends Animal {

}
class Cat extends Animal {

}*/

abstract class Contact{
    protected String name;

    public Contact(String name) {
        this.name = name;
    }
    abstract public void contact();
}
class EmailContact extends Contact{
    protected String email;

    public EmailContact(String name, String email) {
        super(name);
        this.email = email;
    }
    public void contact(){
        System.out.println("Emailing " +email);
    }

}
class PhoneContact extends Contact{
        protected  String phone;

    public PhoneContact(String name, String phone) {
        super(name);
        this.phone = phone;
    }

    @Override
    public void contact() {
        System.out.println("calling " +phone);

    }
}
public class Main {
    public static void main(String[] arg){
 EmailContact myEmail= new EmailContact("Joe", "joe@joe.om");
        myEmail.contact();
        PhoneContact myPhone = new PhoneContact("Joe","123-456-7890");
        myPhone.contact();


    }
}
