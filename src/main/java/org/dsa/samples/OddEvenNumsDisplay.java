package org.dsa.samples;

public class OddEvenNumsDisplay {
    int num;
    int count = 1;

    public OddEvenNumsDisplay(int num){
        this.num = num;
    }

    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        OddEvenNumsDisplay oddEvenNumsDisplay = new OddEvenNumsDisplay(20);
        Thread t1 = new Thread(oddEvenNumsDisplay::displayOddNum);
        Thread t2 = new Thread(oddEvenNumsDisplay::displayEvenNum);

        t1.start();
        System.out.println(Runtime.getRuntime().availableProcessors());
        t2.start();
        System.out.println(Runtime.getRuntime().availableProcessors());
    }

    private synchronized void displayOddNum(){
        while (count<num) {
            while (count % 2 ==0){
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("Value of count is: " +  count + " : "+ Thread.currentThread().getName());
            count++;
            notify();
        }
    }

    private synchronized void displayEvenNum(){
        while (count<num) {
            while (count % 2 !=0){
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("Value of count is: " +  count + " : "+ Thread.currentThread().getName());
            count++;
            notify();
        }
    }
}
