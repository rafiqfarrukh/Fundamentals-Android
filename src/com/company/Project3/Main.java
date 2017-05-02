package com.company.Project3;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.ToIntFunction;
import java.util.Iterator;

/************************************************************************************************************
 * Name : Frank Rafiq
 * Instructor : Aurther N.
 * Class: CISC 2994
 * Project Name: Project 3
 * Due date 4/11/17
 *
 * Description: This program uses Collection class to add elements to an array, remove elements from an list,
 *              update and print the element of the array. It also implements Comparable and iterable interface.
 *
 */



class TaskDetail implements Comparable<TaskDetail>{
    private String name;
    private String desc;
    private int priority;



    public void setName(String sName) {
        this.name = sName;
    }

    public void setDesc(String sDesc) {
        this.desc = sDesc;
    }

    public void setPriority(int sPriority) {
        this.priority = sPriority;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public int getPriority() {
        return priority;
    }


    @Override
    public int compareTo(TaskDetail other) {

        if (getPriority() - other.getPriority()== 0) {
            return name.compareTo(other.name);
        }
        else{
            return getPriority() - other.getPriority();
        }
    }

}

class TaskCollection implements Iterable<TaskDetail> {
    private List<TaskDetail> myTasks = new ArrayList<>();

    public void add(TaskDetail newTask) {
        myTasks.add(newTask);
    }

    public void remove(int removeIndex) {
        myTasks.remove(removeIndex);
    }

    public void update(int updateIndex, TaskDetail updateTask) {
        myTasks.set(updateIndex, updateTask);
    }

    public int indexOf(TaskDetail newTask) {
        return myTasks.indexOf(newTask);
    }

    @Override
    public void forEach(Consumer<? super TaskDetail> action) {

    }

    @Override
    public Iterator<TaskDetail> iterator() {
        return myTasks.iterator();
    }

    public void sort() {
        Collections.sort(myTasks);
    }


    public void display() {
        myTasks.forEach(tasks -> System.out.println("Task index: " + myTasks.indexOf(tasks) + ", " + "Name: "
                + tasks.getName() + ", " + "Description: " + tasks.getDesc() + ", " + "Priority: "
                + tasks.getPriority()));
    }

    public void displayByPriority(int checkPriority) {
        for (TaskDetail tasks : myTasks) {
            if (tasks.getPriority() == checkPriority) {
                System.out.println("Task index: " + myTasks.indexOf(tasks) + ", " + "Name: "
                        + tasks.getName() + ", " + "Description: " + tasks.getDesc() + ", " + "Priority: "
                        + tasks.getPriority());
            }
        }
    }
}

public class Main {
    static int inputMethod() {
        int inputChoice = -1;
        boolean isInt = false;
        String inputName, inputDescription;
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1) Add a task. ");
        System.out.println("2) Remove  a task. ");
        System.out.println("3) Update a task. ");
        System.out.println("4) List all tasks. ");
        System.out.println("5) List all tasks of a certain priority.");
        System.out.println("(0) Exit.");
        System.out.println("Choose an option.");
        while (!isInt) {

            // while outside try
            try {
                inputChoice = Integer.parseInt(input.nextLine());
                isInt = true;

            } catch (Exception e) {
                // while is based on inputchoice instead
                System.out.println("Choose an option.");
            }
        }

        return inputChoice;
    }

    public static void main(String[] args) {
        int choose, inputPriority, indexLocation =0;
        String inputName, inputDescription;
        String inputTask;
        boolean isInt = false;
        // collection of task detail
        TaskCollection collectionOfTasks = new TaskCollection();
        Scanner input = new Scanner(System.in);
        choose = inputMethod();
        while(choose != 0){
            if(choose == 1){
                //add
                TaskDetail myTask = new TaskDetail();
                isInt = false;
                System.out.println("Enter the new task's name. " );
                inputName = input.nextLine();
                myTask.setName(inputName);
                System.out.println("Enter the new task's description. " );
                inputDescription = input.nextLine();
                myTask.setDesc(inputDescription);
                System.out.println("Enter the new task's priority. ");
                while(!isInt){
                    try {
                        inputPriority = Integer.parseInt(input.nextLine());
                        isInt = true;
                        myTask.setPriority(inputPriority);
                        collectionOfTasks.add(myTask);
                    }
                    catch (Exception e) {
                        // while not int
                        System.out.println("Enter the new task's priority. ");
                    }
                }

            }// add
            else if(choose == 2){
                //remove
                isInt = false;
                while(!isInt){
                    System.out.println("Enter the index of the task to remove: ");
                    try {
                        indexLocation = Integer.parseInt(input.nextLine());
                        isInt = true;
                        collectionOfTasks.remove(indexLocation);
                    }
                    catch (Exception e){
                        System.out.println("Enter the index of the task to remove: ");

                    }

                }

                //remove
            }
            else if (choose == 3){
                //update;
                TaskDetail myTask = new TaskDetail();
                isInt = false;
                while(!isInt){
                    System.out.println("Enter the index of the task to update. ");
                    try {
                        indexLocation = Integer.parseInt(input.nextLine());

                        isInt = true;
                    }
                    catch(Exception e){
                        System.out.println("Enter the index of the task to update. ");
                    }
                }

                System.out.println("Enter the new task's name. " );
                myTask.setName(input.nextLine());
                System.out.println("Enter the new task's description. " );
                myTask.setDesc(input.nextLine());;
                isInt = false;
                while (!isInt){
                    try {
                        System.out.println("Enter the new task's priority. ");
                        myTask.setPriority(Integer.parseInt(input.nextLine()));
                        isInt = true;
                        collectionOfTasks.update(indexLocation,myTask);
                    }
                    catch (Exception e) {
                        // while not int
                        System.out.println("Enter the new task's priority. ");
                    }
                }

            }// update
            else if (choose == 4){
                //print collections;
                collectionOfTasks.sort();
                collectionOfTasks.display();

            }// print collections
            else if (choose == 5){
                // print base on priority
                TaskDetail myTask = new TaskDetail();
                isInt = false;
                System.out.println("Enter a priority.");
                while (!isInt){
                    try {
                        inputPriority = Integer.parseInt(input.nextLine());
                        isInt = true;
                        collectionOfTasks.displayByPriority(inputPriority);

                    }
                    catch (Exception e){
                        System.out.println("Enter a priority.");
                    }

                }
            }// print base on priority
            else if (choose == 0){
                //default
                System.exit(0);
            }
            choose=  inputMethod();
        }
    }
}
