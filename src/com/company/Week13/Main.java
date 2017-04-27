package com.company.Week13;

/**
 * Created by frafiq on 4/18/2017.
 */
import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.*;
import java.util.concurrent.*;

class CheckingAccount{
    private int balance;
    public CheckingAccount(int balance){
        this.balance = balance;
    }

    public int withdraw(int amount){
        if (amount <= balance) {
            int sleepTime = (int) (Math.random() * 200);

            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            balance -= amount;
        }
        return balance;
    }
}



public class Main {
    public static  void  main(String[] args){
        CheckingAccount account = new CheckingAccount(100);
        Runnable r = new Runnable(){
            @Override
            public void run() {
                String name = Thread.currentThread().getName();
                for (int i = 0; i < 10; i++){
                    synchronized (account){
                        System.out.println(name +
                                " tries to withdraw $10, balance: " +
                                account.withdraw(10));
                    }
                }
            }
        };
        Thread person1 = new Thread(r);
        person1.setName("Person1");
        Thread person2 = new Thread(r);
        person2.setName("Person2");
        person1.start();
        person2.start();

    }
}
