package org.dsa;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public int x = 10;
     String name;
    public static void staticMethod() {
        System.out.println("This is Main class static method");
    }

    public Main() {
        System.out.println("I am in class MAIN constructor");
    }
    public Main(String str) {
        System.out.println("I am in class argument MAIN constructor");
    }

    public  void over() {

    }

    private void privateMethod() {
        System.out.println("This is a private method");
    }

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
        Main main = new Main();
        main.privateMethod();


    }
}