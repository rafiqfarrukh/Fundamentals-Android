package com.company.Project3;
import java.util.*;

/************************************************************************************************************
 * Name : Frank Rafiq
 * Instructor : Aurther N.
 * Class: CISC 2994
 * Project Name: Proj2
 * Due date 3/7/17
 *
 * Description: This program uses ArrayList to add elements to an array, remove elements from an array,
 *              update and print the element of the array.
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

        return name.compareTo(other.name);
    }
}
//class NameAndMoney implements Comparable<NameAndMoney> {
//    String name;
//    double money;
//
//    NameAndMoney(String name, double money) {
//        this.name = name;
//        this.money = money;
//    }
//
//    public int compareTo(NameAndMoney other) {
//        return name.compareTo(other.name);
//    }
//
//    public String toString() {
//        return String.format("%10s %5f", name, money);
//    }
//}


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
        // array list of task detail
        List<TaskDetail> myTasks = new ArrayList<>();
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
                        myTasks.add(myTasks.size(),myTask);
                    }
                    catch (Exception e) {
                        // while not int
                        System.out.println("Enter the new task's priority. ");
                    }
                }

            }
            else if (choose == 4){
                //listall;
                TaskDetail[] array = new TaskDetail[myTasks.size()];
                Arrays.sort(myTasks.toArray(array));
                for (TaskDetail tasks: myTasks) {
                    System.out.println("Task index: "+myTasks.indexOf(tasks)+", "+"Name: "
                            +tasks.getName()+", "+"Description: "+ tasks.getDesc()+", "+"Priority: "
                            +tasks.getPriority());
                }
            }
            else if (choose == 0){
                //default
                System.exit(0);
            }
            choose=  inputMethod();
        }
//        ArrayList<NameAndMoney> al = new ArrayList<NameAndMoney>();
//        al.add(new NameAndMoney("kkk", 123.4));
//        al.add(new NameAndMoney("zzzzz", 456.7));
//        al.add(new NameAndMoney("a", 9.0));
//        NameAndMoney[] array = new NameAndMoney[al.size()];
//        Arrays.sort(al.toArray(array));
//        for(NameAndMoney x : array)
//        System.out.println(x);

    }
}
