package com.company.week05;

import java.util.ArrayList;
import java.util.List;

/*class WeatherData {
    private final static String TEMP_UNIT = "F";
    private final static String HUMIDITY_UNIT = "%";
    private final static String PRECIPITATION_UNIT = "%";
    private final static int FREEZING_TEMP = 32;

    private String cityName;
    private double temperature;
    private double humidity;
    private double precipitation;

    public WeatherData(String city, double temperature, double humidity,
                double precipitation) {
        cityName = city;
        this.temperature = temperature;
        this.humidity = humidity;
        this.precipitation = precipitation;
    }

    static double tempFtoC(double fahrenheit) {
        return 5.0 / 9 * (fahrenheit - 32);
    }

    static double tempCtoF(double celsius) {
        return 9.0 / 5 * celsius + 32;
    }

    static void displayFreezeTemp() {
        System.out.println(FREEZING_TEMP + TEMP_UNIT);
    }
    private boolean willSnow(){
        return (temperature <= FREEZING_TEMP )&& (precipitation >= 50);
    }
    public void displayWeatherReport(){
        String temp = temperature + TEMP_UNIT;
        String humid = humidity + HUMIDITY_UNIT;
        String precip = precipitation + PRECIPITATION_UNIT;
        String snowLikely = willSnow() ? "likely" : "unlikely";
        System.out.println("The current temperature in " + cityName + " is " + temp
                + ". The current relative humidity is: " + humid
                + ". The current chance of precipitation is " + precip
                + ". It is " + snowLikely + " to snow.");
    }
}

public class Main {
    public static void main(String[] args){
        double fahrenheit = 212;
        WeatherData columbus = new WeatherData("Columbus ", 65,50,21);
        WeatherData cleveland = new WeatherData("Cleveland",30,40,80);
        System.out.println(WeatherData.tempFtoC(fahrenheit));
        columbus.displayWeatherReport();
        cleveland.displayWeatherReport();

    }
}
*/

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

    public String getEmail() {
        return email;
    }
}
class AddressBook{
    private List<Contact> contacts = new ArrayList<>();

    public void add(Contact contact){
        contacts.add(contact);

    }
    public String findEmail(String name){
        for (Contact contact : contacts){
            if (contact.getName().equals(name)){
                return contact.getEmail();
            }
        }
        return null;
    }

}
public class Main {
    public static void main(String[] args){
        Contact bob = new Contact("bob","bob@bob.com");
        AddressBook addressBook = new AddressBook();
        addressBook.add(bob);

       Contact sue = new Contact("Sue","sue@sue.com");

        addressBook.add(sue);
        System.out.println(addressBook.findEmail("bob"));
        System.out.println(addressBook.findEmail("Sue"));


    }
}
