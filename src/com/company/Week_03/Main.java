package com.company.Week_03;

import java.util.Scanner;

/**
 * Created by frafiq on 1/31/2017.
 */
public class Main {
    static double getTemperature(){
        System.out.println("Enter a temperature.");
        Scanner scanner= new Scanner(System.in);
        String input = scanner.nextLine();
        return Double.parseDouble(input);
    }
    static double fahrenheitToCelsius(double fahrenheit){
        return 5.0/9* (fahrenheit - 32);
    }
    static void displayTemperature(double Temperature){
        System.out.println("The temperature is " +Temperature);
    }
    public static void main(String[] args){
        Double userInput = getTemperature();
        while (userInput >= -460) {
            double celsius = fahrenheitToCelsius(userInput);

            displayTemperature(celsius);
            userInput = getTemperature();


        }
    }
}

   /* enum Direction(North, South,West, East);

    static void describeWind(Dirction windDirection){
        switch (windDirection)
    }
    static  int add(int a, int b){
        return a+b;
    }
    }
    static  double add(double a, double b){
        return a+b;
    }
    static  int add(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String[] arg){
        String input = "1234";
        int inputInt = Integer.parseInt(userInput);
        System.out.println(intValue + 4321);
    }
}



        static void displaySnowMessage( double temp, double prob){
            System.out.println("When the temp is " + temp + " and the probability is "
                    + prob + ", it is likely to snow.");
        }

    static void willItSnow(double temp, double prob) {
        if (temp <32 && prob >= 0.5){
            displaySnowMessage(temp, prob);
        }



    public static void main(String[] args) {
        double[] temperatures = {28, 31, 46, 37};
        double[] probabilities = {.3, .9, .4, .7};
        for int i=0; i<temp.lenth;i++{
            willItSnow(temp[i], prob[i]);
        }

}

 static void methodExample(int integerValue, int[] integerArray){
        integerValue +=1000;
        integerArray[0] = -integerArray[0];

    }
    static double celsiusToFahrenheit(double celsiusValue) {
        double fahrenheitValue = 9.0/5 * celsiusValue + 32;
        return fahrenheitValue;
    }
    public static void main(String[] args){
        int anInteger = 100;
        int[] anIntegerArray = (10,20);
        System.out.println("interger: " +anInteger);
        System.out.println("intergerArray[0]: " +anIntegerArray[0]);
        methodExample(anInteger, anIntegerArray);
        System.out.println("interger: " +anInteger);
        System.out.println("intergerArray[0]: " +anIntegerArray[0]);
    }
}
public class Main{
   static void displayElements}
    ststic list<String> removeElement(list<String> existingArry, int index){
        existingArray.remove(index);
    }
}*/
