package com.company.proj1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static int inputMethod(){
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
        return Integer.parseInt(input.nextLine());

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
        //inputMethod();
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
                //inputMethod();
                //choose= Integer.parseInt(input.nextLine());
            }
            else if(choose == 2){
                //remove
                System.out.println("Current size of array is: " +task.size() );
                System.out.println();
                System.out.println("Enter The place from where u want the task removed: ");
                location= Integer.parseInt(input.nextLine());
                //System.out.println("Enter the task: ");
                //inputTask = input.nextLine();
                remove(task,location);
                //inputMethod();
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
                // inputMethod();
                //continue;
            }
            //call input method again;
            // wait to continue logic
            //inputMethod();
            choose=  inputMethod();
        }

    }
}
