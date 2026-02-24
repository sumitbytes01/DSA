package org.dsa.samples;

class Test {
    static volatile boolean flag = true;

    public static void main(String[] args) throws InterruptedException {

        new Thread(() -> {
            // now it won't stop because of this, even with volatile
            //if (flag) {
                while (flag) {
                    System.out.println("in while " + flag);
                }
            //}
            //System.out.println("Stopped");
        }).start();
        //Thread.sleep(2000);
        new Thread(() -> flag = false).start();
    }
}
