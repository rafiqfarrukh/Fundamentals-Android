package com.company.Week13;

/**
 * Created by frafiq on 4/18/2017.
 */
import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.*;
import java.util.concurrent.*;

class CheckingAccount{
    private Semaphore permits = new Semaphore(1, true);
    private int balance;
    public CheckingAccount(int balance){
        this.balance = balance;
    }
    public int withdraw(int amount){

        try{

        }
    }
}
class AccountHolder implements Runnable{
    private String name;
    private  CheckingAccount account;

    public void run(){
        for (int i=0; i < 10; i++){
            System.out.println(name + " tries to withdraw $ 10, balance: " +
            account.withdraw(10));
        }
    }
}


public class Main {
    public static  void  main(String[] args){
        CheckingAccount account = new CheckingAccount(100);
        AccountHolder person1 = new AccountHolder("Person1",account);
        AccountHolder person2 = new AccountHolder("Person2",account);
        public static void sleep(int duration){

    }
        BlockingQueue<Character> queue = new ArrayBlockingQueue<Character>(5);
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.submit()


    }
}
