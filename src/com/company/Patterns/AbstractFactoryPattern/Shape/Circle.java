package com.company.Patterns.AbstractFactoryPattern.Shape;

/**
 * Created by adil on 24/02/16.
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}