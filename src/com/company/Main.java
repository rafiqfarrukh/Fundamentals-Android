package com.company;
import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;
import java.util.*;

public class Main {
   /* static void displayElements (List < String > someList) {
        for (String element : someList) {
            System.out.println(element);
        }
    }


    public static void main(String[] args) {
        // write your code here
       /* Map<String, Integer[]> cityTemperature = new TreeMap<>();
        for (int index=0; index<cities.length; index++){
            Integer[] temp = (low[index], high[index]);
            cityTemperatures.put(cities(index),temps)
        }
        return cityTemperature;
    }
    static  void displayTemperature(Map<String,Integer[]> cityTemp) {
        for (String Key : cityTemp.keySet()) {
            Integer[] temp = cityTemps.keyget()){
            System.out.println("city:"+ key +"low:"+temp[0]+", High:" +temp[1] );

            }
        }*/
        static Map<String, Integer[]> getInput() {
            List<String> cities = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);
            Map<String, Integer[]> cityTempMap = new HashMap<>();
            System.out.println("Enter a city or End to stop. ");
            String city = scanner.nextLine();
            while (!city.equals("END")) {
                cities.add(city);
                System.out.println("Enter a city or End to stop.");
                city = scanner.nextLine();

            }
            for (String cityName : cities) {
                System.out.println("enter the average temperature for the next five days for" + cityName);
                String Temperature = scanner.nextLine();
                String[] fiveTemps = Temperature.split(" ");
                Integer[] fiveInts = new Integer[5];
                for (int i = 0; i < fiveTemps.length; i++) {
                    fiveInts[i] = Integer.parseInt(fiveTemps[i]);

                }
                cityTempMap.put(cityName, fiveInts);
            }
            return cityTempMap;
        }
    static Map<String, Double> calculateAverages(Map<String, Integer[]> temperatures) {
        Map<String, Double> averageMap = new HashMap<>();
        for (String city: temperatures.keySet()) {
            Integer[] cityTemperatures = temperatures.get(city);
            // calculate average
            Double average = new Double(0);
            for (Integer temp: cityTemperatures) {
                average += temp;
            }
            average /= 5;
            averageMap.put(city, average);
        }
        return averageMap;
    }
    static void displayAverage(Map<String, Double> averageMap) {
        for(String city: averageMap.keySet()) {
            System.out.println(city + ": " + averageMap.get(city));
        }
    }


    public static void main(String[] args) {
        Map<String, Integer[]> temperatures = getInput();
        Map<String, Double> averages = calculateAverages(temperatures);
        displayAverage(averages);
    }
}
      /*  public static void main(String[] args) {
            Map<String, Integer[]> temperatures = getInput();
            Map<String, Double> averages = calculateAverages(temperatures);
            displayAverage(averages);
    }
        }



           }

         {
            System.out.println("Enter a city or End to stop");
            String city = scanner.nextLine();
        }
        }
    }
        List<String> citiesList = new ArrayList<>();
        citiesList.add("Columbus");
        citiesList.add("New York");
        citiesList.add("Columbus");
        System.out.println("List");
        for (String city: citiesList{
            System.out.println(city);
        }
        String[] cityName = ("Columbus","New york", "Huston");
        int[] LowTemps = (-10,-5,50);

        int[] HighTemps (20,40,66));
        Map<String, Integer[]> temperatures;
                M

/*
        List<String> cities = new ArrayList<>();
        cities.add("Columbus");
        cities.add("New York");
        cities.add("Tokyo");

        List<String> states  =new LinkedList<>();
        states.add("ohio");
        states.add("Alaska");
        states.add("New York");
        displayElements(cities);
        displayElements(states);


        System.out.println("Cleveland in list" + cities.contains("Cleveland"));
        System.out.println("Numbers of cities:" + cities.size());
        System.out.println("Second element uppercase:" + cities.get(1).toUpperCase());
        cities.remove(2);
        for (String city : cities) {
            System.out.println(city);
        } */


