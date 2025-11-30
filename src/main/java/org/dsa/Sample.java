package org.dsa;

import java.io.IOError;

public class Sample extends Main{
    private int x = 20;
    String name;
    public Sample(){
        super("hello");
        System.out.println("I am in class SAMPLE constructor");
    }
    public Sample(String str){

        System.out.println("I am in class SAMPLE");
    }
    public static void staticMethod() {
        System.out.println("This is Sample class static method");
    }


    public void sample1(long x){

    }

    public void sample1(int x) throws NumberFormatException {

    }

    @Override
    public    void over() {

    }

    private void privateMethod() {
        System.out.println("This is a private method");
       // String name1 = Sample.super.name;
        Sample sample = new Sample();
        String name2 = sample.name;
    }
    public static void main(String[] args) {
        Sample sample = new Sample();

        sample.staticMethod();
        Sample.staticMethod();
        System.out.println(((Main)sample).x);
        ((Main)sample).staticMethod();
        System.out.println(sample.x);
        Main main = new Main();
        //main.privateMethod();
    }
}
