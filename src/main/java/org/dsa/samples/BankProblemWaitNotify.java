package org.dsa.samples;

public class BankProblemWaitNotify {
    int amount;

    public BankProblemWaitNotify(int amount){
        this.amount = amount;
    }
    public synchronized void withdraw(int amount) {
        while (amount > this.amount){
            try {
                System.out.println("Waiting: "+ Thread.currentThread().getName());
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.amount = amount-this.amount;
        System.out.println("Amount deducted: " +Thread.currentThread().getName());
        notify();
    }

    public synchronized void deposit(int amount) {
        this.amount = this.amount + amount;
        System.out.println("Amount added: " +Thread.currentThread().getName());
        notify();
    }

    public static void main(String[] args) {
        BankProblemWaitNotify bankProblemWaitNotify = new BankProblemWaitNotify(10000);
        Thread t1 = new Thread(() -> bankProblemWaitNotify.deposit(1000));
        Thread t2 = new Thread(() ->  bankProblemWaitNotify.withdraw(12000));
        Thread t3 = new Thread(() -> bankProblemWaitNotify.deposit(1000));
        t1.start();
        t2.start();
        t3.start();

    }
}
