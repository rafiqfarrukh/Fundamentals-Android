package com.company.project2;
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



class TaskDetail{
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
                else if(choose == 2){
                    //remove
                    isInt = false;
                    while(!isInt){
                    System.out.println("Enter the index of the task to remove: ");
                    try {
                        indexLocation = Integer.parseInt(input.nextLine());
                        isInt = true;
                        myTasks.remove(indexLocation);
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
                        myTasks.set(indexLocation,myTask);
                    }
                    catch (Exception e) {
                        // while not int
                        System.out.println("Enter the new task's priority. ");
                        }
                    }

                }
                else if (choose == 4){
                    //listall;
                    for (TaskDetail tasks: myTasks) {
                        System.out.println("Task index: "+myTasks.indexOf(tasks)+", "+"Name: "
                                +tasks.getName()+", "+"Description: "+ tasks.getDesc()+", "+"Priority: "
                                +tasks.getPriority());
                    }
                }
                else if (choose == 5){
                    isInt = false;
                    System.out.println("Enter a priority.");
                    while (!isInt){
                        try {
                            inputPriority = Integer.parseInt(input.nextLine());
                            isInt = true;
                            for (TaskDetail tasks:myTasks){
                                if( tasks.getPriority() == inputPriority){
                                    System.out.println("Task index: "+myTasks.indexOf(tasks)+", "+"Name: "
                                            +tasks.getName()+", "+"Description: "+ tasks.getDesc()+", "+"Priority: "
                                            +tasks.getPriority());
                                }
                            }

                        }
                        catch (Exception e){
                            System.out.println("Enter a priority.");
                        }

                    }


                }
                else if (choose == 0){
                    //default
                   System.exit(0);
                }
                choose=  inputMethod();
            }

        }
    }