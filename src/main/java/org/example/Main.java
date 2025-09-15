package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Main class started");

        OtherClass other = new OtherClass();
        other.sayHello();

        System.out.println("Main class finished");
    }

    public void greet() {
        System.out.println("Greetings from MainClass!");

    }
}