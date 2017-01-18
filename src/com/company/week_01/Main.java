package com.company.week_01;

/**
 * Created by frafiq on 1/17/2017.
 */
public class Main {
    public static void main(String[] args) {
      String cityName = "Columbus";
      int zipCode = 43215;
      double[] highTemps ={32,25,27,40,45};
      double average= (highTemps[0] + highTemps[1] + highTemps[2] + highTemps[3] + highTemps[4])/5;
      System.out.println("City: " + cityName);
      System.out.println("zip: " + zipCode);
      System.out.println("Average High Temperature:  " + average);


    }
}
