package com.company.OOP.Polymorphism;

/**
 * Polymorphism is the capability of a method to do different things based on the object that it is acting upon.
 * In other words, polymorphism allows you define one interface and have multiple implementations.
 * <p/>
 * Following concepts demonstrate different types of polymorphism in java.
 * 1) Method Overloading
 * 2) Method Overriding
 * <p/>
 * Created by adil on 24/02/16.
 */
public class BaseClass {

    //Overloading
    public void overloadedMethod(int a) {
        System.out.println("a: " + a);
    }

    public void overloadedMethod(int a, int b) {
        System.out.println("a and b: " + a + "," + b);
    }

    public double overloadedMethod(double a) {
        System.out.println("double a: " + a);
        return a * a;
    }

    public double methodToOverride() {
        System.out.println("I'm the method of BaseClass");
        return 5.0;
    }


}
