package org.dsa.samples;

public class Test3 {
    public static void main(String[] args) throws InterruptedException {
        RunnableThread r1 = new RunnableThread();
        RunnableThread r2 = new RunnableThread();
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t1.join();
        t2.start();


        System.out.println("I am main thread: "+Thread.currentThread().getName());
    }
}

class RunnableThread implements Runnable{
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName());
        }
    }
}
