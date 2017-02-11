package com.company.proj1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/************************************************************************************************************
 * Name : Frank Rafiq
 * Instructor : Aurther N.
 * Class: CISC 2994
 * Project Name: Proj1
 * Due date 2/7/17
 * Description: This program uses ArrayList to add elements to an array, remove elements from an array,
 *              update and print the element of the array.
 */
public class Main {
    static int inputMethod(){
        int inputChoice;
        Scanner input = new Scanner(System.in);
        System.out.println("Please choose an option:");
        System.out.println();
        System.out.println("(1) Add a task. ");
        System.out.println();
        System.out.println("(2) Remove  a task. ");
        System.out.println();
        System.out.println("(3) Update a task. ");
        System.out.println();
        System.out.println("(4) List all tasks. ");
        System.out.println();
        System.out.println("(0) Exit.");
        try {
            inputChoice = Integer.parseInt(input.nextLine());
            if (inputChoice == (int)inputChoice)
                return inputChoice;
        }
        catch (Exception e){
            System.out.println(" Please start again & enter a number between 0-4 as a choice. ");
        }

        return 0;
    }
    static void add(List<String> task, int addLocation, String addNewtask) {

        task.add(addLocation,addNewtask);
    }
    static void remove(List<String> task, int removeLocation) {

        task.remove(removeLocation);
    }
    static void update(List<String> task, int updateLocation, String updateTask) {

        task.set(updateLocation,updateTask);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int location, choose;
        String inputTask;
        ArrayList<String> task = new ArrayList<String>();
        choose= inputMethod();
        while(choose != 0){
            if(choose == 1){
                //add
                System.out.println("Current size of array is:" +task.size() );
                System.out.println();
                System.out.println("Enter The place where u want the task added: ");
                location = Integer.parseInt(input.nextLine());
                System.out.println("Enter the task: ");
                inputTask = input.nextLine();
                add(task, location, inputTask);
             }
            else if(choose == 2){
                //remove
                System.out.println("Current size of array is: " +task.size() );
                System.out.println();
                System.out.println("Enter The place from where u want the task removed: ");
                location= Integer.parseInt(input.nextLine());
                remove(task,location);
                //remove
            }
            else if (choose == 3){
                //update;
                System.out.println("Current size of array is:" +task.size() );
                System.out.println();
                System.out.println("enter the place in array you want updated ");
                location = Integer.parseInt(input.nextLine());
                System.out.println("Enter the task: ");
                inputTask = input.nextLine();
                task.set(location,inputTask);
                //inputMethod();
            }
            else if (choose == 4){
                //listall;
                for (String tasks: task) {
                    System.out.println(tasks);
                }
            }
            else{
                //default

            }
            //pause before program starts over again.
            System.out.println();
            System.out.println("Please hit enter to continue:");
            inputTask = input.nextLine();
            //call input method again;
            choose=  inputMethod();
        }

    }
}
