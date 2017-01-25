package com.company;

/**
 * Created by frafiq on 1/24/2017.
 */
public class week_02 {
    public static void main(String[] args) {

        String[] days = {"Sun", "Mon","Tue", "Wed", "Thu", "Fri", "Sat"};
        int[] temp = {45, 29, 10,22,41,28,33};
        double[] probability = {0.95,0.6,0.25,0.05,0,0.75,0.9};
        for(int i=0; i<days.length; i++){
            if(temp[i] <= 32 && probability[i] > 0.5){
                System.out.println(days[i]);

            }
        }

//        java.util.Scanner scanner = new java.util.Scanner(System.in);
//       for(int number = 1; number <= 10; number++){
//            System.out.println("My favorite number is " +number);
//
//        }
//        int i = 0;
//        while (i < 10){
//            System.out.println(i);
//            i += 2;
//        }
//        String input = "";
//       while (!input.equals("x")){
//           System.out.println("Enter x to exit.");
//           input = scanner.nextLine();
//       }

    }
}
