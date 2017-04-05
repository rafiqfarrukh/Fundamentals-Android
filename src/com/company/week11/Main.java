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
    void addListene(WeatherDataListener listener);
    void
}
class TempSemsors implements WeatherSensor {
    List<WeatherDataListener> listeners = new ArrayList<>();
    private String temperature;
    public void updateTemperature(){
        double measuredTemp = new Random().nextDouble()*100;
    }
}
// Listener
class WeatherStation implements WeatherDataListener{
    List<String> log new ArrayList<>;

    @Override
    public void update(String data) {

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
          WeatherDataListener myWeatherStation = new WeatherStation();
          TempSemsors tempSensor =new TempSemsors();
          humidSensors

    }

}
