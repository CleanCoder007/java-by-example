package com.java8.interfce.functional;

public class CalculatorImpl {
    public static void main(String[] args) {
        Calculator calculator =  (a,b)->{};// this is functional interface with empty body
        Calculator calculator1 =  (a,b)->System.out.println(a*b);// this is functional interface with single statement
        Calculator calculator2 =  (a,b)->{
        if(a<0 || b<0) {
            throw new RuntimeException("Illegal Number Format Exception");
        }
            System.out.println(a*b);
        };// this is functional interface with business logic in body
        Calculator calculator3 = new Calculator() { // This is anonymous class.
            @Override
            public void mult(int a , int b) {
                System.out.println(a*b);
            }
        };// this is functional interface with empty body

        calculator.mult(1,2);
        calculator1.mult(1,2);
        calculator2.mult(1,2);
        calculator3.mult(1,2);
    }
}
