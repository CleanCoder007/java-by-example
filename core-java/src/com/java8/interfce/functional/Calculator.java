package com.java8.interfce.functional;

@FunctionalInterface
public interface Calculator {
    void mult(int a, int b);// This is abstract method

    static  void turnOn(){
        System.out.println("Welcome! Calculator turned on!");
    }
    //We can create any number of static method inside
    static void turnOff(){
        System.out.println("Turning off calculator");
    }

    static void powerSaver(){
        System.out.println("Power Saved started");
    }

    //We can create any number of default method inside
    default int sum(int a, int b){return  a+b;}
    default int sub(int a, int b){return  a-b;}

}
