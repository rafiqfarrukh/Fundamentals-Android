package com.company.week11;
import java.util.*;

//interface StringFilter{
//    boolean accept(String candidate );
//
//}
//class Names{
//    private List<String> names = new ArrayList<>();
//    public void add(String name){
//        names.add(name);
//    }
//    public List<String> filter(StringFilter theFilter){
//        List<String> filteredNames = new ArrayList<>();
//        for (String name: names){
//            if (theFilter.accept(name)){
//                filteredNames.add(name);
//            }
//
//        }
//        return  filteredNames;
//    }
//
//}
////class BFilter implements  StringFilter{
////    @Override
////    public boolean accept(String candidate) {
////        return candidate.startsWith("b");
////    }
////}
//class FilterCreator{
//    public static StringFilter startsWithFilter(String preFix){
//        // local class
//        class StartsWithFilter implements StringFilter{
//            @Override
//            public boolean accept(String candidate) {
//                return candidate.startsWith(preFix);
//            }
//        };
//    }
//}
//class consoleViewer implements NewsListener{
//
//}
//class Printer implements NewsListener{
//
//}
//class NewsCollection{
//    private List<String> newsItems = new ArrayList<>();
//    private List<NewsListeners> listeners = new ArrayList<>();
//    public void addlistener(String newNews){
//        for (NewsListener listener : listeners){
//            listener.update(newNews);
//        }
//    }
//    public void updateListeners(String newNews){
//        for
//    }
//
//}
interface WeatherDataListener{
    public void update(String data);

}
interface WeatherSensor{
    void addListener(WeatherDataListener listener);
    void updateListeners(String data);
}
class TempSensor implements WeatherSensor {
    List<WeatherDataListener> listeners = new ArrayList<>();
    private String temperature;
    public void updateTemperature(){
        double measuredTemp = new Random().nextDouble()*100;
        temperature = "Temperature: " + measuredTemp;
        updateListeners(temperature);
    }



    @Override
    public void addListener(WeatherDataListener listener) {
        listeners.add(listener);

    }

    @Override
    public void updateListeners(String data) {
        for (WeatherDataListener listener: listeners) {
            listener.update(data);
        }

    }
}
class HumidSensor implements WeatherSensor {
    List<WeatherDataListener> listeners = new ArrayList<>();
    private String humidity;

    public void updateHumidity() {
        double measuredTemp = new Random().nextDouble();
        humidity = "Humidity: " + measuredTemp;
        updateListeners(humidity);
    }

    @Override
    public void addListener(WeatherDataListener listener) {
        listeners.add(listener);
    }

    @Override
    public void updateListeners(String data) {
        for (WeatherDataListener listener : listeners) {
            listener.update(data);
        }
    }
}
class PressureSensor implements WeatherSensor {
    List<WeatherDataListener> listeners = new ArrayList<>();
    private String pressure;

    public void updatePressure() {
        double measuredTemp = new Random().nextDouble();
        pressure = "Pressure: " + measuredTemp;
        updateListeners(pressure);
    }

    @Override
    public void addListener(WeatherDataListener listener) {
        listeners.add(listener);
    }

    @Override
    public void updateListeners(String data) {
        for (WeatherDataListener listener: listeners) {
            listener.update(data);
        }
    }
}

// Listener
class WeatherStation implements WeatherDataListener{
    List<String> log = new ArrayList<>();

    @Override
    public void update(String data) {
        System.out.println("New weather data: " + data);
        log.add(data);
    }
    public void displayLog() {
        for (String weatherItem: log) {
            System.out.println(weatherItem);
        }
    }
}



public class Main {
        public static void main(String[] args) {
//        Names friends = new Names();
//        friends.add("bob");
//        friends.add("sue");
//        friends.add("pete");
//        StringFilter bFilter = FilterCreator.startsWithFilter("b");
//        List
          WeatherStation myWeatherStation = new WeatherStation();
          TempSensor tempSensor = new TempSensor();
          HumidSensor humidSensor = new HumidSensor();
          PressureSensor pressureSensor = new PressureSensor();
            tempSensor.addListener(myWeatherStation);
            humidSensor.addListener(myWeatherStation);
            pressureSensor.addListener(myWeatherStation);

            System.out.println("Simulate sensor updates");
            tempSensor.updateTemperature();
            humidSensor.updateHumidity();
            tempSensor.updateTemperature();
            pressureSensor.updatePressure();

            System.out.println("All weather events");
            myWeatherStation.displayLog();
        }

}
